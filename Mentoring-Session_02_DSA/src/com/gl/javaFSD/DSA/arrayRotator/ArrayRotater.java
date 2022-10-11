package com.gl.javaFSD.DSA.arrayRotator;

public class ArrayRotater {

private int[] array;
	
	public ArrayRotater(int []array) {
		
		this.array = array;		
	}
	
	public void rotateLeft(int byHowManyPositions) {
		
		for (int index = 0; index < byHowManyPositions; index ++) {
			rotateLeft();
		}
	}
	
	public void rotateLeft() {
	
		int length = array.length;
		
		int zerothElement = array[0];
		
		for (int currentIndex = 0; currentIndex < (length - 1); currentIndex ++) {
			
			int nextPosition = (currentIndex + 1);
			int nextElement = array[nextPosition];
			
			int currentPosition = currentIndex;
			array[currentPosition] = nextElement;					
		}
		
		int lastPosition = (length - 1);
		array[lastPosition] = zerothElement;
	}
}
