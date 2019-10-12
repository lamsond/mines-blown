package org.whrhs.dlamson.apa.mines;

public class Mine{
	public static final int RAD = 5;
	private int x, y;
	private boolean blown;
	
	public Mine(int x, int y) {
		this.x = x;
		this.y = y;
		blown = false;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double getDistance(int[] coords) {
		int dx = coords[0]-x;
		int dy = coords[1]-y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	
	public boolean isBlown(int[] coords) {
		return this.getDistance(coords) <= RAD;
	}
}
