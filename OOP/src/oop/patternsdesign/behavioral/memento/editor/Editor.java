package oop.patternsdesign.behavioral.memento.editor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

import javax.swing.JComponent;

import oop.patternsdesign.behavioral.memento.caretakers.History;
import oop.patternsdesign.behavioral.memento.mementos.MementoII;
import oop.patternsdesign.behavioral.memento.originators.Command;
import oop.patternsdesign.behavioral.memento.shapes.CompoundShape;
import oop.patternsdesign.behavioral.memento.shapes.Shape;

public class Editor extends JComponent {

	private Canvas canvas;
	private CompoundShape allShapes = new CompoundShape();
	private History history;

	public Editor() {
		canvas = new Canvas(this);
		history = new History();
	}

	public void loadShapes(Shape...shapes) {
		allShapes.clear();
		allShapes.add(shapes);
		canvas.refresh();
	}

	public CompoundShape getShapes() {
		return allShapes;
	}

	public void excute(Command c) {
		history.push(c, new MementoII(this));
		c.execute();
	}

	public void undo() {
		if (history.redo())
			canvas.repaint();
	}

	public void redo() {
		if (history.redo())
			canvas.repaint();
	}
	
	public String backup() {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this.allShapes);
			oos.close();
			return Base64.getEncoder().encodeToString(baos.toByteArray());
		} catch (IOException e) {
			return "";
		}
	}
	
	public void restore(String state) {
		try {
			byte[] data = Base64.getDecoder().decode(state);
			ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
			this.allShapes = (CompoundShape)ois.readObject();
			ois.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException ocurred.");
		}catch (IOException e) {
			System.out.println("IOException ocurred.");
		}
	}
}
