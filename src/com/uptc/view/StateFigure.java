package com.uptc.view;

import java.awt.Color;
import java.awt.Graphics;

import com.uptc.model.State;

public class StateFigure extends State {

	protected static int SIZE = 40;
	protected int y;
	protected int x;
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, SIZE, SIZE);
		g.setColor(Color.BLACK);
		g.drawOval(x, y, SIZE, SIZE);
		g.drawString(this.name, x+(SIZE/2)-5, y+(SIZE/2)+5);
		
		if (this.finalState) {
			g.drawOval(x +3, y+3, SIZE-6, SIZE-6);
		}
		
		if (this.initialSate) {
			g.drawLine(x, y + (SIZE/2), x - 20, y + (SIZE/2)-15);
			g.drawLine(x - 20, y + (SIZE/2)-15, x - 20, y + (SIZE/2) + 15);
			g.drawLine(x - 20, y + (SIZE/2) + 15, x, y + (SIZE/2));
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
