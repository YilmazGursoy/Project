import java.util.Random;


public class ThreeWayMerge {

	//****************************************************************Merge Sort 2
		
	public static void Merge2(int []Left,int[]Right,int[]Final){
		
		
			
		int nL=Left.length;
			int nR=Right.length;
			int Counter=0;
			int L=0;
			int R=0;
			
			while(L<nL&&R<nR){
				if(Left[L]<Right[R]){
					Final[Counter]=Left[L];
					L++;Counter++;
					}
				else{
					Final[Counter]=Right[R];
					R++;Counter++;
				}
			}
			while(L<nL){
				Final[Counter]=Left[L];
				L++;Counter++;
				}
			while(R<nR){
				Final[Counter]=Right[R];
				R++;Counter++;
				}
			}
		public static void MergeSort2(int[]SortingArray){
			int i;
			int ArrayLength=SortingArray.length;
			if(ArrayLength<2) return;
			int Orta=ArrayLength/2;
			int[] Left=new int[Orta];
			int[] Right=new int[ArrayLength-Orta];
			
			
			for(i=0;i<=Orta-1;i++){
				Left[i]=SortingArray[i];
			
			}
			
			for(int abc=Orta;abc<=ArrayLength-1;abc++){
				Right[i-Orta]=SortingArray[i];
			
				i++;
			}
			MergeSort2(Left);
			MergeSort2(Right);
			Merge2(Left,Right,SortingArray);
			
		}
//****************************************************************Merge Sort 3
		public static Boolean Control(int i,int j,int z){
			if(i<j){
				if(i<z){
					return true;
				}
				else if(i==z){
					return true;
				}
				else{
				return false;
				}
			}
			else if(i==j){
				if(i<z){
					return true;
				}
				else if(i==z){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		public static void Merge(int []Left,int[]Middle,int[]Right,int[]Final){
			
			
			int nL=Left.length;
			int nM=Middle.length;
			int nR=Right.length;
			
			int L=0;
			int M=0;
			int R=0;
			int Counter=0;
			while((L<nL)&&(M<nM)&&(R<nR)){
				int LL=Left[L];
				int RR=Right[R];
				int MM=Middle[M];
			
				if(Control(LL,RR,MM)){
			
					Final[Counter]=Left[L];
					L++;Counter++;
				}
				else if(Control(RR,LL,MM)){
			
					Final[Counter]=Right[R];
					R++;Counter++;
				}
				
				else if(Control(MM,LL,RR)){
			
					Final[Counter]=Middle[M];
					M++;Counter++;
					}
				else if(Control(LL,MM,RR)){
			
					Final[Counter]=Middle[L];
					L++;Counter++;
					}
				else if(Control(MM,RR,LL)){
			
					Final[Counter]=Middle[M];
					M++;Counter++;
					}
				else if(Control(RR,MM,LL)){
			
					Final[Counter]=Middle[R];
					R++;Counter++;
					}
				else{
			
				}
			}
				
			
				while(L<nL&&R<nR){
			
					if(Left[L]<=Right[R]){
						Final[Counter]=Left[L];
						L++;Counter++;
					}
					else{
						Final[Counter]=Right[R];
						R++;Counter++;
					}
				}
				while(L<nL&&M<nM){
			
					if(Left[L]<=Middle[M]){
						Final[Counter]=Left[L];
						L++;Counter++;
					}
					else
					{
						Final[Counter]=Middle[M];
						M++;Counter++;
					}
				}
				while(R<nR&&M<nM){
			
					if(Right[R]<=Middle[M]){
						Final[Counter]=Right[R];
						R++;Counter++;
					}
					else
					{
						Final[Counter]=Middle[M];
						M++;Counter++;
					}
					
				}
				while(R<nR){
			
					Final[Counter]=Right[R];
					Counter++;R++;
				}
				while(L<nL){
					
					Final[Counter]=Left[L];
					Counter++;L++;
				}
				while(M<nM){
					
					Final[Counter]=Middle[M];
					M++;Counter++;
				}
			
			
			
		
		}
		public static void MergeSort3(int[]SortingArray){
			
			int i=0;
			int ArrayLength=SortingArray.length;
			
			if(ArrayLength<2) return;
			int Bas;
			int Orta;
			int Son;
			
			
			if (ArrayLength % 3 == 0) {
		        Bas = ArrayLength / 3;
		        Orta= ArrayLength / 3;
		        Son= ArrayLength / 3;
		    } else if (ArrayLength % 3 == 1) {
		        Bas = (ArrayLength / 3) + 1;
		        Orta= ArrayLength / 3;
		        Son= ArrayLength / 3;
		    } else { //if (elements % 3 == 2)
		        Bas= (ArrayLength/ 3) + 1;
		        Orta= ArrayLength / 3;
		        Son= (ArrayLength / 3) + 1;
		    }
			
			
			int[] Left=new int[Bas];
			int[] Middle=new int[Orta];
			int[] Right=new int[Son];
			
			for(i=0;i<=Bas-1;i++){
			
				Left[i]=SortingArray[i];
			}
			
			for(int abc=Bas;abc<=Orta+Bas-1;abc++){
			
				Middle[i-Bas]=SortingArray[i];
				i++;
			}
			
			int DD=Orta+Bas;
			for(int bcc=DD;bcc<=ArrayLength-1;bcc++){
			
				Right[bcc-(Orta+Bas)]=SortingArray[i];
				
				i++;
				
			}
			
			MergeSort3(Left);
			MergeSort3(Middle);
			MergeSort3(Right);
			Merge(Left, Middle, Right, SortingArray);
			
			
		}

	public static void main(String[] args) {
		int deneme[]=new int[10];
		Random rand=new Random();
		for(int i=0;i<10;i++){
			System.out.println(i);
			int randomNum = rand.nextInt(5);
			deneme[i]=randomNum;
		}
		System.out.println("Basladi");
		
		//Here is 3-Way Merge Sort Algorithm
		Stopwatch watch2=new Stopwatch();
		MergeSort2(deneme);
		double ElapsedTime2=watch2.elapsedTime();
		System.out.println("Elapsed time 2-WayMerge"+ ElapsedTime2);

		
		
		Stopwatch watch3=new Stopwatch();
		
		MergeSort3(deneme);
		System.out.println("Burasi bitti");
		double ElapsedTime3=watch3.elapsedTime();
		System.out.println("Elapsed time 3-WayMerge"+ ElapsedTime3);
		
		//Here is 2-Way Merge Sort Algorithm
				}

}
