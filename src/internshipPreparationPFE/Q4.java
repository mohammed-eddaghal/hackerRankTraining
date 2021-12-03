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

class Result4 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    	int nbSpace= n-2;
    	StringBuffer sb1 = new StringBuffer();
    	StringBuffer sb2 = new StringBuffer("#");
    	
    	for(int i=0;i<n-1;i++) {
    		sb1.append(" ");
    	}
    	System.out.println(sb1.toString()+sb2.toString());
    	for(int i=n;i>0;i--) {
    		//System.out.println(sb1.length());
       		//System.out.println(nbSpace);
    		if(nbSpace>0) {sb1.deleteCharAt(nbSpace);sb2.append("#");
    		nbSpace--;
    		System.out.println(sb1.toString()+sb2.toString());}
    		else if(i>=2) sb2.append("#");
    		
    		//else sb1.deleteCharAt(0);
    	}System.out.println(sb2.toString());
    	

    }

}

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result4.staircase(15);

        bufferedReader.close();
    }
}
