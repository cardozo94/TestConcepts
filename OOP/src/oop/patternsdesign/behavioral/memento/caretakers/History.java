package oop.patternsdesign.behavioral.memento.caretakers;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.memento.mementos.MementoII;
import oop.patternsdesign.behavioral.memento.originators.Command;

public class History {
	
	private List<Pair> history = new ArrayList<History.Pair>();
	private int virtualSize = 0;
		
	private class Pair{
		Command command;
		MementoII memento;
		
		public Pair(Command c, MementoII m) {
			command =c;
			memento =m;
		}
		
		private Command getCommand() {
			return command;
		}
		
		private MementoII getMemento() {
			return memento;
		}
	}
	
    public void push(Command c, MementoII m) {
        if (virtualSize != history.size() && virtualSize > 0) {
            history = history.subList(0, virtualSize - 1);
        }
        history.add(new Pair(c, m));
        virtualSize = history.size();
    }
    
    public boolean undo() {
		Pair pair = getUndo();
		if(pair == null)
			return false;
		System.out.println("Undoing: "+pair.getCommand().getName());
		pair.getMemento().restore();
		return true;
	}
    
    public boolean redo() {
		Pair pair = getRedo();
		if(pair == null)
			return false;
		System.out.println("Redoing: "+pair.getCommand().getName());
		pair.getMemento().restore();
		pair.getCommand().execute();
		return true;
	}

    private Pair getUndo() {
		if (virtualSize ==0) 
			return null;
		virtualSize = Math.max(0, virtualSize-1);
		return history.get(virtualSize);
	}
    
    private Pair getRedo() {
		if(virtualSize ==0)
			return null;
		virtualSize= Math.min(0, virtualSize+1);
		return history.get(virtualSize-1);
	}
}
