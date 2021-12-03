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

class Result5 {

    /*
     * Mini-Max Sum
     * 
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	Collections.sort(arr);
    	//System.out.println(arr.toString());
    	long minSum=0,maxSum=0;
    	for(int i=0;i<arr.size();i++) {
    		if(i!=arr.size()-1)minSum+=arr.get(i);
    		if(i!=0)maxSum+=arr.get(i);
    	}
    	System.out.println(minSum+" "+maxSum);
    }

}

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = new ArrayList<>();
            
        arr.add(256741038);
         arr.add(623958417);
         arr.add(467905213);
         arr.add(714532089);
         arr.add(938071625);

        
        Result5.miniMaxSum(arr);

        bufferedReader.close();
    }
}

