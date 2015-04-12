public class ArrayDemoRandom{
	public static void main(String []args){
		int []dRandom = new int[10];
		System.out.println("Mengisi bilangan dengan angka random");
		for(int i=0;i<dRandom.length;i++){
			dRandom[i] = (int) (Math.random()*69);
		}
		
		System.out.println("Menghasilkan angka random dalam array");
		for(int j=0;j<dRandom.length;j++){
			System.out.println("Data random ke ["+j+"] = " +dRandom[j]);
		}
	}
}
