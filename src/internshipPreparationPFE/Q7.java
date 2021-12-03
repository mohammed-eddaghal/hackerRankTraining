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

class Result7 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    	String period =s.substring(s.length()-2);
    	String time= s.substring(0, s.length()-2);
    	String[] listString = time.split(":");
    	if ("AM".equals(period)) {
    		if("12".equals(listString[0]))return "00:"+listString[1]+":"+listString[2];
    		else return time;
    	}else {
    		if("12".equals(listString[0]))return time;
    		for(int i=1;i<12;i++) {
    			if(Integer.parseInt(listString[0])==i) {
    				 return (i+12)+":"+listString[1]+":"+listString[2];
    			}
    		}
    	}
return "";
    }

}

public class Q7 {
    public static void main(String[] args) throws IOException {
         String result = Result7.timeConversion("12:05:45AM");

        System.out.println(result);
    }
}

