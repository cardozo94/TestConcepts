package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.Player;

public class LockedState extends State {

	public LockedState(Player player) {
		super(player);
		player.setPlaying(false);
	}

	@Override
	public String onLock() {
		String lock;
		if(player.isPlaying()) {
			player.changeState(new ReadyState(player));
			lock = "Stop playing";
		}else
			lock = "Locked...";
		return lock;
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Ready";
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		return "Locked...";
	}

}
