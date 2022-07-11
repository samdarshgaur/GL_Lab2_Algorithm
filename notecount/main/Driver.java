package notecount.main;

import java.util.Scanner;

import notecount.service.MergeSortImpl;
import notecount.service.NotesCount;

public class Driver {

	public static void main(String[] args) {
		MergeSortImpl mergeSortImplementation = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denomination value");
		for(int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.mergeSort(notes, 0, notes.length - 1);
		mergeSortImplementation.display(notes);
		notesCount.notesCountImplementation(notes, amount);
		
		sc.close();
	}
}