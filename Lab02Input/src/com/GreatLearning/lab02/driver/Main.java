package com.GreatLearning.lab02.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.GreatLearning.lab02.service.MergeSortDemo;
import com.GreatLearning.lab02.service.CurrencyNotesCount;

public class Main {
	
	public static void main(String[] args) {
		
		MergeSortDemo mergeSortObj = new MergeSortDemo();
		CurrencyNotesCount notesCountObj = new CurrencyNotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortObj.sort(notes,0,notes.length-1);
		notesCountObj.notesCountImplementation(notes, amount);
	}

}
