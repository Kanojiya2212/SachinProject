package org.java;

import java.util.*;

public class Myself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       int[] array = {3, 3,4, 4,2,2,2,2,2, 4};
		        
		        int candidate = findMajorityCandidate(array);
		        boolean hasMajority = isMajority(array, candidate);
		        
		        if (hasMajority) {
		            System.out.println("Majority element: " + candidate);
		        } else {
		            System.out.println("No majority element found.");
		        }
		    }
		    
		    private static int findMajorityCandidate(int[] array) {
		        int candidate = array[0];//3
		        int count = 1;
		        
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] == candidate) {
		                count++;
		                System.out.println(count);
		            } else {
		                count--;
		                System.out.println(count);
		                if (count == 0) {
		                    candidate = array[i];
		                    count = 1;
		                }
		            }
		        }
		        
		        return candidate;
		    }
		    
		    private static boolean isMajority(int[] array, int candidate) {
		        int count = 0;
		        
		        for (int num : array) {
		            if (num == candidate) {
		                count++;
		            }
		        }
		        
		        return count > array.length / 2;
		    
		

	}
		public void productOfElement() { //except that element
		        int[] array = {1, 2, 3, 4, 5};
		        int[] result = new int[array.length];
		        
		        int product = 1;
		        
		        for (int i = 0; i < array.length; i++) {
		            result[i] = product;
		            product *= array[i];
		        
		            System.out.println(product);
		        }
		        
		        product = 1;
		        
		        for (int i = array.length - 1; i >= 0; i--) {
		            result[i] *= product;
		            System.out.println(product);
		            
		            product *= array[i];
		            
		            
		        }
		        
		        System.out.println("Product of all elements except the current element: " + Arrays.toString(result));
		    }
		


		public void missingElement() {
		       int[] array = {1,4, 5, 6};
		        int n = array.length + 1;
		        int expectedSum = (n * (n + 1)) / 2;
		        int actualSum = 0;
		        
		        for (int num : array) {
		            actualSum += num;
		        }
		        
		        int missingNumber = expectedSum - actualSum;
		        
		        System.out.println("Missing number in the array: " + missingNumber);
		    
		
	}
		public void commonElement() {
		
		      int[] array1 = {1, 2, 3, 4, 5,7};
		        int[] array2 = {4, 5,};
		        
		        System.out.print("Common elements in the arrays: ");
		        
		        for (int num1 : array1) {
		            for (int num2 : array2) {
		                if (num1 == num2) {
		                    System.out.print(num1 + " ");
		                    break;
		                }
		            }
		        }
		 
		

		
		
	}
		
		
		
		public void reverseArray() {
		    int[] array = {1, 2, 7, 4, 5};
		        
		        System.out.println("Original Array: " + Arrays.toString(array));
		        
		        int start = 0;
		        int end = array.length - 1;
		        
		        while (start < end) {
		            int temp = array[start];
		            array[start] = array[end];
		            array[end] = temp;
		            start++;
		            end--;
		        }
		        
		        System.out.println("Reversed Array: " + Arrays.toString(array));
		    }
		

		
		
		
		

	
	
	
	
	
	
		public void removeElement() {
		        int[] array = {1, 2, 3, 4, 5};
		        int elementToRemove = 3;

		        System.out.println("Original Array: " + Arrays.toString(array));

		        // Find the index of the element to remove
		        int index = -1;
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == elementToRemove) {
		                index = i;
		                break;
		            }
		        }

		        // If the element is found, remove it and shift the subsequent elements
		        if (index != -1) {
		        	System.out.println(index);
		            for (int i = index; i < array.length - 1; i++) {
		            	//        2  ; 2<4
		            //	System.out.println(Arrays.toString(array));
		            	
		                array[i] = array[i + 1];
		                
		               
		                
		            }
		            System.out.println(Arrays.toString(array));

		            // Resize the array to remove the last element
		            array = Arrays.copyOf(array, array.length - 1);

		            System.out.println("Array after removing element: " + Arrays.toString(array));
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }
		

		
		
		
		
		
		
	

}
