 //To find the sum of command-line arguments and count the invalid integers entered.
public class Summation {
	public static void main (String a[]) {
		int sum = 0;
		int invalid = 0;
		for(int i=0; i<a.length; i++){
			try {
				sum += Integer.parseInt(a[i]);
			
			} catch(NumberFormatException e) {
				invalid++;
			}
			
		}
		System.out.println("Total no.of arguments:"+a.length);
		System.out.println("InvalidIntegers:"+invalid);
		System.out.println("sum:"+sum);
	}
	

}
