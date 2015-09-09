package sorting;

public class SelectionSort {

	public static void main(String[] args){
		
		int[] toSort={5,9,1,2,7,6};
		
		selectionSort(toSort);
		display(toSort);
		
		
	}
	
	public static void selectionSort(int[] a){
		
		
		
		
		for(int k=0;k<a.length-1;k++){
			int min=k;
			int temp=0;
			boolean flag=false;
			for(int i=k+1;i<a.length;i++){
				if(a[min]>a[i]){
					min=i;
					flag=true;
				}
			}
			if(flag){
			temp=a[k];
			a[k]=a[min];
			a[min]=temp;
			}
			display(a);
		}
	}
	
	public static void display(int[] a){
		for(int i:a){
			System.out.print("|"+i+"|");
		}
		System.out.println();
	}
}
