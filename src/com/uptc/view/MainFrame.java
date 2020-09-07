package com.uptc.view;

import javax.swing.JFrame;

import com.uptc.controller.MoveListerner;

public class MainFrame extends JFrame {

	private Canvas canvas;
	
	private MoveListerner listerner;
	
	public MainFrame() {
//		canvas = new Canvas();
		listerner = new MoveListerner();
		
		this.add(listerner.getCanvas());
		this.init();
	}
	
	private void init() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
}
