
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
					System.out.println("LL="+LL+"; RR="+RR+"; MM="+MM);
					System.out.println("Control 1");
					Final[Counter]=Left[L];
					L++;Counter++;
				}
				else if(Control(RR,LL,MM)){
					System.out.println("LL="+LL+"; RR="+RR+"; MM="+MM);
					System.out.println("Control 2");
					Final[Counter]=Right[R];
					R++;Counter++;
				}
				
				else if(Control(MM,LL,RR)){
					System.out.println("LL="+LL+"; RR="+RR+"; MM="+MM);
					System.out.println("Control 3");
					Final[Counter]=Middle[M];
					M++;Counter++;
					}
				
				}
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
				while(L<nL&&M<nM){
					if(Left[L]<Middle[M]){
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
					if(Right[R]<Middle[M]){
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
			System.out.println("**************Yeni Bastan**************");
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
			for(int a=0;a<Left.length;a++){
				System.out.print(Left[a]+" ");
			}
			System.out.println();
			for(int a=0;a<Middle.length;a++){
				System.out.print(Middle[a]+" ");
			}
			System.out.println();
			for(int a=0;a<Right.length;a++){
				System.out.print(Right[a]+" ");
			}
			System.out.println();
			MergeSort3(Left);
			MergeSort3(Middle);
			MergeSort3(Right);
			Merge(Left, Middle, Right, SortingArray);
			
			
		}
	
	public static void main(String[] args) {
		int[]deneme={1,2,3,6,4,78,23,9,23,54,23,76,45,33};
		MergeSort3(deneme);
		
		for(int i=0;i<deneme.length;i++){
			System.out.print(deneme[i]+"  ");
		}
		MergeSort2(deneme);
		
	}

}
