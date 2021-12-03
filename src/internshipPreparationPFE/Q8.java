package internshipPreparationPFE;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result8 {

    /*
     * Complete the 'permutationGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String permutationGame(List<Integer> arr) {
    // Write your code here
    	List<Integer> arrList= arr;
    	int currentIdx=0;
    	boolean aliceTurn = true;
    	boolean isNotFinish=true;
    	System.out.println("Alice"+ arrList.toString());
    	while(isNotFinish) {
    		
    		isNotFinish= false;
    		for(int i=0;i<arrList.size()-1;i++) {
    			currentIdx=i;
    			if(arrList.get(i)>arrList.get(i+1)) {
    				
    				arrList.remove(i);
    				break;
    			}
    		}
    		if(currentIdx==arrList.size()) {
    			break;
    		}
    		//aliceTurn=!aliceTurn;
    		for(int i=0;i<arrList.size()-1;i++) {
    			if(arrList.get(i)>arrList.get(i+1)) {
    				isNotFinish=true;
    				aliceTurn=!aliceTurn;
    				break;
    			}
    		}  
    		String t=aliceTurn?"Alice":"Bob" ;
    		System.out.println(t + arrList.toString());
    	}
    	if(aliceTurn) {
    		//System.out.println("Alice");
    		return "Alice";
    	}
    	else {
    		//System.out.println("Bob");
    		return "Bob";
    	}
    	
    }

}

public class Q8 {
    public static void main(String[] args) throws IOException {
       
                List<Integer> arr= new ArrayList<>();
                
                
               //5 3 2 1 4
                arr.add(5);arr.add(3);
                arr.add(2);arr.add(1);
                arr.add(4);
                
                //7 8 2 11 5 4 10 13 3 14 6 12 15 1 9
                /*arr.add(7);arr.add(8);
                arr.add(2);arr.add(11);
                arr.add(5);arr.add(4);
                arr.add(10);arr.add(13);
                arr.add(3);arr.add(14);
                arr.add(7);arr.add(8);
                arr.add(6);arr.add(12);
                arr.add(15);arr.add(1);
                arr.add(9);*/
                
                //9 13 1 3 2 12 4 8 7 6 10 11 5
                
                /*arr.add(9);arr.add(13);
                arr.add(1);arr.add(3);
                arr.add(2);arr.add(12);
                arr.add(4);arr.add(8);
                arr.add(7);arr.add(6);
                arr.add(10);arr.add(11);
                arr.add(5);*/
                
                //5 3 10 8 11 4 1 6 2 7 12 9
                /*arr.add(5);arr.add(3);
                arr.add(10);arr.add(8);
                arr.add(11);arr.add(4);
                arr.add(1);arr.add(6);
                arr.add(2);arr.add(7);
                arr.add(12);arr.add(9);*/
                //5 4 7 3 6 2 1
                /*arr.add(5);arr.add(4);
                arr.add(7);arr.add(3);
                arr.add(6);arr.add(2);
                arr.add(1);*/
                //1 3 2
                //arr.add(1);arr.add(3);arr.add(2);
                

                String result = Result8.permutationGame(arr);
                System.out.println(result);

            
    }
}

