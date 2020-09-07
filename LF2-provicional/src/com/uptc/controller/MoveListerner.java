package com.uptc.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.uptc.view.Canvas;

public class MoveListerner implements MouseListener {
	
	private Canvas canvas;
	
	public MoveListerner() {
		canvas = new Canvas(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.getPosition(e.getX(), e.getY());
		System.out.println("X: " + e.getX() + " - Y: " + e.getY());
		canvas.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void getPosition(int x, int y) {
		canvas.createNode(x, y);
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

}
