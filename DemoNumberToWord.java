import java.util.*;
import java.text.NumberFormat;
public class DemoNumberToWord {
	public static final String [] units = {"","one","two","three","four","five","six","seven","eight","nine"};


	public static String convert(final int n)
	{
		if(n<0) {
			return "Minus"+convert(-n);
		}
		if(n<10) {
			return units[n];
		}
	}
	public static void main (String [] args) {
		Scanner SC = new Scanner (System.in);
		System.out.println("Enter value for conver number to word");
		int n = SC.nextInt();
		System.out.println(NumberFormat.getInstance().format(n)+""+convert(n)+"");
	}
}