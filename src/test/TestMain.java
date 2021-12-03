package test;

import java.text.DecimalFormat;

public class TestMain {

	public static void main(String[] args) {
		/*DecimalFormat df = new DecimalFormat ( ) ;
		df.setMaximumFractionDigits ( 2 ) ; //arrondi à 2 chiffres apres la virgules
		df.setMinimumFractionDigits ( 2 ) ;
		df.setDecimalSeparatorAlwaysShown ( true ) ;
		System.out.println ( Double.parseDouble(df.format ( -4.327))); //cela t'affiche -4,33
		System.out.println ( df.format ( 2174534.3279 ) ) ; //2,174,534,33

		double x=4.25125512588941;
		System.out.printf("%.6f",x);*/
		
		int x=73/5;
		System.out.println(x);
		System.out.println(5*(x+1));
	}

}
