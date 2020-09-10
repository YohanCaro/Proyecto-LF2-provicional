package com.uptc.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.uptc.controller.MoveListerner;

public class MainFrame extends JFrame {

	private Canvas canvas;
	private MoveListerner listerner;
	
	public MainFrame() {
		this.setLayout(new BorderLayout());
//		canvas = new Canvas();
		
		listerner = new MoveListerner();
		
		this.add(listerner.getCanvas(), BorderLayout.CENTER);
		this.add(listerner.getjPanelToggle(), BorderLayout.EAST);
		this.init();
	}
	
	private void init() {
		
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
}
