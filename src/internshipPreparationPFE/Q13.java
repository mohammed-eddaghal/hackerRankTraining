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

class Result13 {
	Map<Integer,Integer> mapOfVal=new HashMap<>();
	private int getNumOfOccur(int key) {
		
		return 0;
	}
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    	Collections.sort(arr);
    	/*int mostFrq= arr.get(0), newNum;
    	int morFriq1=  0, morFriq2 = 0;
    	
    	for (int x:arr) {
    		if(x==mostFrq) {
    			morFriq1++;morFriq2++;
    		}
    		else break;
    	}
    	newNum=arr.get(morFriq1);
    	for (int i=morFriq1;i<arr.size();i++) {
    		if(newNum!=mostFrq) {
    			
    		}
    		
    		
    	}*/
    	
    	int firstApprear = 0,lastApprear;
    	int key = arr.get(0), nbRept;
    	int morFriq2=0,morFriq1=0;
    	for (int x:arr) {
    		if(x==key) {
    			morFriq1++;
				morFriq2++;
    		}
    		else {
    			
    			break;
    		}
    	}

    	return 0;
    }

}

public class Q13 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result13.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
