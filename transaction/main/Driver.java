package transaction.main;

import java.util.Scanner;

import transaction.service.Service;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the values of array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		
		Service transactionService = new Service();
		
		transactionService.checkTransaction(arr, targetNo);
		
		sc.close();
	}

}
