package demo;

import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= {45,23,67,2,69};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
