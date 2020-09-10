package com.uptc.model;

import java.util.ArrayList;

public class State {
	
	protected String name;
	protected boolean initialSate;
	protected boolean finalState;
	protected boolean transitionalState;
	protected ArrayList<Transition> transitions;
	
	public State() {
		initialSate = true;
		finalState = true;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFinalState(boolean finalState) {
		this.finalState = finalState;
	}
	
	public void setInitialSate(boolean initialSate) {
		this.initialSate = initialSate;
	}
	
}
