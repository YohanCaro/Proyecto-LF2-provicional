package com.uptc.view;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.uptc.controller.MoveListerner;

public class Canvas extends JPanel {
	
	private NodeFigure figure;
	private ArrayList<NodeFigure> list;
	private int incremental;
	
	public Canvas(MoveListerner ml) {
		figure = new NodeFigure();
		
		list = new ArrayList<NodeFigure>();
		
		incremental = 0;
		this.addMouseListener(ml);
		
//		this.refresh();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
//		figure.draw(g);
		for (NodeFigure nodeFigure : list) {
			nodeFigure.draw(g);
		}
	}
	
	public void createNode(int x, int y) {
		figure = new NodeFigure();
		figure.setX(x);
		figure.setY(y);
		figure.setText("q" + incremental);
		list.add(figure);
		incremental++;
	}
	
	public void refresh() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				repaint();
			}
			
		}).start();
	}
	
}
