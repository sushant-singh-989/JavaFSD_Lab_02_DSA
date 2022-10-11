package com.gl.javaFSD.DSA.arrayRotator;

public class ArrayRotaterTest {

    public static void main(String[] args) {
	
    	rotateLeftByMultiplePositionsTest();
}
    static void rotateLeftTest(){

		int[] array = {2, 4, 6, 8, 10};
		ArrayRotater rotater = new ArrayRotater(array);
		
		DataStructureUtils.print(array);		
		rotater.rotateLeft();
		DataStructureUtils.print(array);		
	}

	
	static void rotateLeftByTwoPositionsTest(){

		int[] array = {2, 4, 6, 8, 10};
		ArrayRotater rotater = new ArrayRotater(array);
		
		DataStructureUtils.print(array);		
		rotater.rotateLeft(2);
		DataStructureUtils.print(array);		
	}
	
	static void rotateLeftByMultiplePositionsTest(){

		int[] array = {2, 4, 6, 8, 10};
		ArrayRotater rotater = new ArrayRotater(array);
		
		DataStructureUtils.print(array);	
		
		rotater.rotateLeft();
		DataStructureUtils.print(array);	

		rotater.rotateLeft();
		DataStructureUtils.print(array);	

		rotater.rotateLeft();
		DataStructureUtils.print(array);	

		rotater.rotateLeft();
		DataStructureUtils.print(array);	

		rotater.rotateLeft();
		DataStructureUtils.print(array);	
		
	}
}
