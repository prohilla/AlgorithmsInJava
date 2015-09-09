package sorting;

public class BubbleSort {

	public static void main(String[] args){
		
		int[] toSort={2,7,4,1,5,3};
		
		//bubbleSort(toSort);
		//display(toSort);
		
		//bubbleSortWithReducingPasses(toSort);
		//display(toSort);
		
		bubbleSortWithFlag(toSort);
		display(toSort);
		
		
	}
	
	//Normal Bubble Sort
	public static void bubbleSort(int[] a){	
	for(int k=0;k<a.length-1;k++){	
		for(int i=0;i<=a.length-2;i++){
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	}
	
	public static void bubbleSortWithReducingPasses(int[] a){
		for(int k=0;k<a.length-1;k++){	
			for(int i=0;i<=a.length-k-2;i++){
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSortWithFlag(int[] a){
		
		boolean flag=false;;
		for(int k=0;k<a.length-1;k++){	
			for(int i=0;i<=a.length-k-2;i++){
				flag=false;
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=true;
				}
			}
			if(!flag){
				break;
			}
		}
	}
	
	public static void display(int[] a){
		for(int i:a){
			System.out.print("|"+i+"|");
		}
	}
}
