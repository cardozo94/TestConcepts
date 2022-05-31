package oop.patternsdesign.behavioral.state;

import oop.patternsdesign.behavioral.state.contexts.Player;

public class Demo {

	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();

	}

}
