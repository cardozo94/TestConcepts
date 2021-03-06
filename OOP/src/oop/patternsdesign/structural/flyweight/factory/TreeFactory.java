package oop.patternsdesign.structural.flyweight.factory;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import oop.patternsdesign.structural.flyweight.object.TreeType;

public class TreeFactory {
	
	static Map<String, TreeType> treeTypes = new HashMap<String, TreeType>();
	
	public static TreeType getTreeType(String name, Color color, String otherTreeData) {
		TreeType result = treeTypes.get(name);
		if(result == null) {
			result = new TreeType(name, color, otherTreeData);
			treeTypes.put(name, result);
		}
		return result;
	}

}
