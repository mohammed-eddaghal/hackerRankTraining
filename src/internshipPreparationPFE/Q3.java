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

class Result1 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	
		int x= arr.size();
		double pos=0,nul=0,neg =0;
		for(int i: arr) {
			if(i==0)nul++;
			else if(i<0) neg++;
			else pos++;
		}
		 System.out.printf("%.6f\n",(double)pos/x);
		 System.out.printf("%.6f\n",(double)neg/x);
		 System.out.printf("%.6f\n",(double)nul/x);
		

    }

}

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result1.plusMinus(arr);

        bufferedReader.close();
    }
}

