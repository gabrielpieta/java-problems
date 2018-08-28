package br.com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

	public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        
        arr.add(1);
        arr.add(2);
        arr.add(3);
        
        long res = subarraySum(arr);
        
        System.out.println(res);

 	}

	private static long subarraySum(List<Integer> arr) {
        long result = 0;
        
        if (arr != null) {
            long size = arr.size();
            
            for (int i=0; i < size; i++){
            	result += (arr.get(i) * (i+1) * (size-i));        	
            }
		}
        return result ;
	}
}
