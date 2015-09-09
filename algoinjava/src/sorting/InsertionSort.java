package sorting;

public class InsertionSort {

	public static void main(String[] args){
		
		int[] toSort={1,5,7,2,4,3};
		selectionSort(toSort);
		display(toSort);
	}
	
	public static void selectionSort(int[] a) {
		
		for(int k=1;k<a.length;k++){
			int value=a[k];
			int hole=k;
			while(hole>0 && a[hole-1]>value){
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=value;
			}
	}

	public static void display(int[] a){
		for(int i:a){
			System.out.print("|"+i+"|");
		}
		System.out.println();
	}
}
