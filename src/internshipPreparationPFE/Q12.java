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

class Result12 {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

	class Pairs{
		int i;
		int j;
		public Pairs(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public int getJ() {
			return j;
		}
		public void setJ(int j) {
			this.j = j;
		}
		
	}
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    	
    	int nbPaire=0;
    	
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    				if((ar.get(i)+ar.get(j))%k==0) {
    					nbPaire++;
    				}
    			}
    			
    		}
    	
    	return nbPaire;

    }

}

public class Q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result12.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
