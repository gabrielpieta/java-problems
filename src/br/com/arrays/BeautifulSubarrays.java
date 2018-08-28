package br.com.arrays;

import java.util.ArrayList;
import java.util.List;

public class BeautifulSubarrays {

	public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(4);

        int m = 2;
        
        long res = beautifulSubarrays(arr , m);
        
        System.out.println(res);

 	}

	static long beautifulSubarrays(List<Integer> a, int m) {

		if (a == null || a.isEmpty() || m < 0) {
	        return 0;
	    }
	   
	    int[] aux = new int[a.size()];
	    int odd = 0;
	    long result = 0;
	    for (int i = 0; i < a.size(); i++) {
	        aux[odd]++;
	        if ((a.get(i) & 1) == 1) {
	            odd++;
	        }
	        if (odd >= m) {
	            result += aux[odd - m];
	        }
	    }
	    return result;
		
	}
}
