package oop.patternsdesign.creational.objectpool.pool;

import oop.patternsdesign.creational.objectpool.object.Oliphaunt;

public class OliphauntPool extends ObjectPool<Oliphaunt> {
	
	@Override
	protected Oliphaunt create() {
		return new Oliphaunt();
	}

}
