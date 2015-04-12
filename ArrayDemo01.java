public class ArrayDemo01{
	public static void main(String []args){
		int []arr = new int[5];
		arr[0] = 100;
		arr[1] = 69;
		arr[4] = 10;
		
		int i=0;
		while(i<5){
		System.out.println("isi array ke ["+i+"] ="  +arr[i]);
		i++;
		}
	}
}