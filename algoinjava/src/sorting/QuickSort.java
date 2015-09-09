package sorting;

public class QuickSort {
	
	public static void main(String[] args){
		
		int[] toSort={4,7,3,2,45,67,32,14,56,98,512,321,145};
		
		quickSort(toSort, 0, toSort.length-1);
		display(toSort);
		
	}

	public static void quickSort(int[] a, int start, int end) {
		if(start<end){
			int pIndex=partition(a,start,end);
			quickSort(a, start, pIndex-1);
			quickSort(a, pIndex+1, end);
		}
	}

	public static int partition(int[] a, int start, int end) {
		
		int pivot=a[end];
		int pIndex=start;
		int temp=0;
		for(int i=start;i<=end-1;i++){
			if(a[i]<=pivot){
				temp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=temp;
				pIndex++;
			}
		}
		temp=a[pIndex];
		a[pIndex]=a[end];
		a[end]=temp;
		return pIndex;
	}

	public static void display(int[] a){
		for(int i:a){
			System.out.print("|"+i+"|");
		}
		System.out.println();
	}
}
