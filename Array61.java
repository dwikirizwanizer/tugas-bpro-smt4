//latihan1

public class Array61{
	public static void main(String [] args){
	
		//deklarasi array 2 dimensi dgn 3 baris
		int [][] data = {
		
		//tiap baris dan kolom
		{1,0,0,0,0,0},
		{0,1,0,0,0,0},
		{0,0,1,0,0,0},
		{0,0,0,1,0,0},
		{0,0,0,0,1,0},
		{0,0,0,0,0,1}
		};
		
		//looping baris 
		for(int i=0; i<data.length; i++){
		
			//looping baris
			for(int j=0; j<data[i].length; j--){
				System.out.print((data[i][j]==0)?" # ":" . ");
			}
			System.out.println();
		}
	}
}


