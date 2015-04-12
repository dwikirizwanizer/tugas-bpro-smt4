import java.util.*;
public class PencetakBilGenap
{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah Bil. Genap: ");
		int n = sc.nextInt();
		int i = 0;
		int BilGenap = 0;
		while(i<n){
			System.out.println("Bil Genap " +i + ": " +BilGenap);
			BilGenap +=2;
			i++;
		}
	}

}