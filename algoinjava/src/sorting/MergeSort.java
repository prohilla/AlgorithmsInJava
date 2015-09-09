package sorting;

public class MergeSort {

	public static void main(String[] args){
		
		int[] toSort={45,65,2,4,7,43,25,87,54,44,29,101,154};
		
		mergeSort(toSort);
		display(toSort);
	}
	
	public static void mergeSort(int[] a) {
		
		if(a.length<2){
			return;
		}
		else{
			int mid=a.length/2;
			int[] left= new int[mid];
			int[] right=new int[a.length-mid];
			int j=0;
			
			for(int i=0;i<mid;i++){
				left[i]=a[i];
			}
			
			for(int i=mid;i<a.length;i++){
					right[j]=a[i];
					j++;
			}
			
			mergeSort(left);
			mergeSort(right);
			merge(left,right,a);
		}
		
	}

	public static void merge(int[] left, int[] right, int[] a) {
		
		int i=0;
		int j=0;
		int k=0;
		while (i<left.length && j<right.length) {
			if(left[i]<=right[j]){
				a[k]=left[i];
				i++;
			}
			else{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		
		while (i<left.length) {
				a[k]=left[i];
				i++;
				k++;
		}
		while (j<right.length) {
				a[k]=right[j];
				j++;
				k++;
		}
		
	}

	public static void display(int[] a){
		for(int i:a){
			System.out.print("|"+i+"|");
		}
		System.out.println();
	}
}
