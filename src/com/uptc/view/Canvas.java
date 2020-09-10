package com.uptc.view;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.uptc.controller.MoveListerner;

public class Canvas extends JPanel {
	
	private StateFigure figure;
	private ArrayList<StateFigure> list;
	private int incremental;
	private int mode;
	
	public Canvas(MoveListerner ml) {
		figure = new StateFigure();
		
		list = new ArrayList<StateFigure>();
		
		incremental = 0;
		this.addMouseListener(ml);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
//		figure.draw(g);
		for (StateFigure nodeFigure : list) {
			nodeFigure.draw(g);
		}
		
		
//		if (list.size() > 1) {
//			for (int i = list.size()-2; i < list.size()-1; i++) {
//				drawConcatenation(list.get(i), list.get(i+1));
//			}
////			list.get(0).drawArrow(g, 50, 50, 120, 120);
//		}
		
	}
	
	public void createNode(int x, int y) {
		figure = new StateFigure();
		
		if (mode == 0) {
			figure.setFinalState(false);
			figure.setInitialSate(false);
		} else if (mode == 1) {
			figure.setFinalState(true);
			figure.setInitialSate(false);
		} else if (mode == 2) {
			figure.setFinalState(false);
			figure.setInitialSate(true);
		} else {
			figure.setFinalState(true);
			figure.setInitialSate(true);
		}
		
		figure.setX(x);
		figure.setY(y);
//		figure.setText("q" + list.size());
		figure.setName("q" + list.size());
		list.add(figure);
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}
		
	public void drawConcatenation(NodeFigure nf, NodeFigure dnf) {
		int nm = (nf.x + (nf.SIZE/2));
		int nm2 = (nf.y + (nf.SIZE/2));
		
		int dnm = (dnf.x + (nf.SIZE/2));
		int dnm2 = (dnf.y + (nf.SIZE/2));
		
//		double d = dnf.x - nf.x;
//		double d2 = dnf.y - nf.y;
		double d = nm2 - nm;
		double d2 = dnm2 - dnm;
		
		double dt = Math.sqrt( Math.pow(d, 2) + Math.pow(d2, 2) );
		
		double angle = Math.toDegrees(Math.asin(d2/dt))*-1;
		
		System.out.println(angle);
		
		int getX = (int) (Math.toDegrees(Math.sin(angle))*(nf.SIZE/2));
		int getY = (int) (Math.toDegrees(Math.cos(angle))*(nf.SIZE/2));
		System.out.println("X: " + getX);
		System.out.println("Y: " + getY);
		
		if (nf.x > dnf.x && nf.y > dnf.y) { //2 cuadrante
			nf.drawArrow(getGraphics(), nm - ((nf.SIZE/2) + getY), nm2 - ((nf.SIZE/2) + getX), dnm, dnm2 );
		} else if (nf.x > dnf.x && nf.y < dnf.y) { //3 cuadrante
			nf.drawArrow(getGraphics(), nf.x, nf.y + nf.SIZE, dnf.x + dnf.SIZE, dnf.y);
		} else if (nf.x < dnf.x && nf.y > dnf.y) { //1 cuadrante
			nf.drawArrow(getGraphics(), nf.x + nf.SIZE, nf.y, dnf.x, dnf.y + dnf.SIZE);
		} else if (nf.x < dnf.x && nf.y < dnf.y) { //4 cuadrante
			nf.drawArrow(getGraphics(), nf.x + nf.SIZE, nf.y + nf.SIZE, dnf.x, dnf.y);
		}
		
		
	}
	
	public void drawPlus() {
		
	}
	
}
