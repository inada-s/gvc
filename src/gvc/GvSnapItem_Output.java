/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 colun ( Yasunobu Imamura )
 * 
 */
package gvc;

public class GvSnapItem_Output implements GvSnapItem {
	public final String output;
	public GvSnapItem_Output(String output) {
		this.output = output;
	}
	@Override
	public double getMinX() {
		return Double.MAX_VALUE;
	}
	@Override
	public double getMinY() {
		return Double.MAX_VALUE;
	}
	@Override
	public double getMaxX() {
		return Double.MIN_VALUE;
	}
	@Override
	public double getMaxY() {
		return Double.MIN_VALUE;
	}
	@Override
	public void paint(GvGraphics g, double scale) {
	}
	@Override
	public void output() {
		System.out.println(output);
	}
}
