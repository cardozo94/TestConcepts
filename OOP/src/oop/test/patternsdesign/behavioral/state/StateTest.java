package oop.test.patternsdesign.behavioral.state;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.jupiter.api.Test;

import oop.patternsdesign.behavioral.state.contexts.Package;
import oop.patternsdesign.behavioral.state.states.DeliveredState;
import oop.patternsdesign.behavioral.state.states.OrderedState;
import oop.patternsdesign.behavioral.state.states.ReceivedState;

class StateTest {

	@Test
	void givenNewPackage_whenPackageReceived_thenStateReceived() {
		Package pkg = new Package();
		assertThat(pkg.getState(), instanceOf(OrderedState.class));
		pkg.nextState();
		
		assertThat(pkg.getState(), instanceOf(DeliveredState.class));
		pkg.nextState();
		assertThat(pkg.getState(), instanceOf(ReceivedState.class));
		
	}

	@Test
	void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
		Package pkg = new Package();
		pkg.setState(new DeliveredState());
		pkg.previousState();
		
		assertThat(pkg.getState(), instanceOf(OrderedState.class));
	}

}
