
public class LargestElement {

	public static void main(String[] args) {
		 int temp, size;
	      int arr[] = {1, 4, 7, 9, 22};
	      size = arr.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(arr[i]>arr[j]){
	               temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	      System.out.println("largest element is:: "+arr[size-1]);
	   }
	

}
