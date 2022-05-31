package oop.patternsdesign.structural.flyweight;


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import oop.patternsdesign.structural.flyweight.factory.TreeFactory;
import oop.patternsdesign.structural.flyweight.object.Tree;
import oop.patternsdesign.structural.flyweight.object.TreeType;

public class Forest extends JFrame {
	
	private List<Tree> trees = new ArrayList<Tree>();
	
	public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
		TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
		Tree tree = new Tree(x, y, type);
		trees.add(tree);
	}
	
	@Override
	public void paint(Graphics graphics) {
		for (Tree tree : trees) {
			tree.draw(graphics);
		}
	}
	
}
