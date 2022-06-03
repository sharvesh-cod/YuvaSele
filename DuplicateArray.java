package week1.day2;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
	    int length = arr.length;
// 		Arrays.sort(arr);
	    // System.out.println("the given numbers " + Arrays.toString(arr)); 
	    for (int i=0;i<length-1 ;i++)
	    	
	    {
	    	count = 1;
	    	
	    	for (int j =i+1;j<length-1;j++) {
	    		
	    		if (arr[i]==arr[j])
	    		{
	    			count = count +1 ;
	    			
	    		}
	    	}
	    	
	    	
	    	if(count>1) {
	    		System.out.println(arr[i]);
	    	}
	    		
	    	}
	    }
		
		
		
				
		}

	


