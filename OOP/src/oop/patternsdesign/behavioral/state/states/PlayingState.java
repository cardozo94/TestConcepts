package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.Player;

public class PlayingState extends State {

	public PlayingState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		player.changeState(new LockedState(player));
		player.setCurrentTrackAfterStop();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Paised...";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
	}

	@Override
	public String onPrevious() {
		return player.previousTrack();
	}

}
