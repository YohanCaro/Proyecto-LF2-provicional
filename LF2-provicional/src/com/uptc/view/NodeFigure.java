package com.uptc.view;

import java.awt.Color;
import java.awt.Graphics;

public class NodeFigure {
	
	private static int SIZE = 40;
	private int y;
	private int x;
	private String text;
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, SIZE, SIZE);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, SIZE, SIZE);
		g.drawString(text, x+(SIZE/2)-5, y+(SIZE/2)+5);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	
}
