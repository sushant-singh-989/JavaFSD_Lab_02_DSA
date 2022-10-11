package com.gl.javaFSD.DSA.arrayRotator;

public class DataStructureUtilsTest {

    public static void main(String[] args) {
		
		evenNumbersArrayTest();
	}
	
	static void evenRandomArrayTest() {
		int[] array = DataStructureUtils.generateRandomArray(10);
		
		DataStructureUtils.print(array);
	}

	static void oddRandomArrayTest() {
		int[] array = DataStructureUtils.generateRandomArray(7);
		
		DataStructureUtils.print(array);
	}

	static void evenNumbersArrayTest() {
		
		int[] array = DataStructureUtils.generateEvenNumbersRandomArray(10);
		
		DataStructureUtils.print(array);
	}
	
}
