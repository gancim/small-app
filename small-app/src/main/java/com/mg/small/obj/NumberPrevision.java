package com.mg.small.obj;

public class NumberPrevision implements Prevision{

	public String getPrevision() {
		return (int)(Math.random() * 10) + "";
	}
		
}
