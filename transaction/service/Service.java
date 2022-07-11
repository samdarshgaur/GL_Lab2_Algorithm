package transaction.service;

import java.util.Scanner;

public class Service {
	public void checkTransaction(int[] arr, int targetNo) {
		Scanner sc = new Scanner(System.in);
		
		while(targetNo-- != 0) {
			int flag = 0;
			
			int target;
			
			System.out.println("enter the value of target");
			target = sc.nextInt();
			
			int sum = 0;
			
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
				
				if(sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " Transaction");
					
					flag = 1;
					
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
		
		sc.close();
	}
}
