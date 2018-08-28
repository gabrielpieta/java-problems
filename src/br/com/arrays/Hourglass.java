package br.com.arrays;

public class hourglass {

	public static void main(String[] args) {
        int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = i + j;
            }
        }
		int result = hourglassSum(arr);
        System.out.println(result);
	}
	
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
		int biggest = 0;
		boolean init = true;
		int sum = 0;
    	for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
        		for (int k = j+2; k >= j; k--) {
    				sum += arr[i][k];
                }
        		sum += arr[i+1][j+1];
        		for (int l = j+2; l >= j; l--) {
    				sum += arr[i+2][l];
                }
        		if (init){
        			biggest = sum;
        			init = false;
        		}
        		if(sum > biggest){
        			biggest = sum;
        		}
        		sum = 0;
            }
    	}    	
    	return biggest;
    }
}
