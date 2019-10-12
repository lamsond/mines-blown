package org.whrhs.dlamson.apa.mines;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.ArrayList;

public class MineField extends JPanel{
	
	private static final int NUM_MINES = 5;
	private static final int SIZE = 500;
	
	private ArrayList<Mine> mines = new ArrayList<Mine>();
	private JLabel distLab;
	
	public MineField() {
		initMines();
		this.setBackground(Color.green);
		distLab = new JLabel("Click With Caution");
		this.add(distLab);
	}
	
	private void initMines() {
		for(int i = 0; i < NUM_MINES; i++) {
			mines.add(new Mine(getRandomValue(), getRandomValue()));
		}
	}
	
	private int getRandomValue() {
		return (int)(Math.random()*501);
	}
	
	
}
