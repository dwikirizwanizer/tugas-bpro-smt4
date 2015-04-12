import java.util.*;
public class PrintNRandom
{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("masukkan banyaknya bil random: ");
		int n = sc.nextInt();
		int i = 1;
		int total = 0;
		int BilRandom = 0;
		while(i<=n){
		BilRandom = (int) (Math.random()*10.0);
			System.out.println("Bil Kampret " +i + ": " +BilRandom);
			total +=BilRandom;
			i++;
		}
		System.out.println("Total : " +total);
	}

}