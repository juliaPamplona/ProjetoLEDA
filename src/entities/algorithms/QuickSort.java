package entities.algorithms;

public class QuickSort {
	public static void swap(double array[], int i, int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	  }
	  
	  public static int partition(double array[], int low, int high) {
		double pivot = array[high];
		int i = (low - 1);
	  
		for (int j = low; j <= high - 1; j++) {
		  if (array[j] <= pivot) {
			i++;
			swap(array, i, j);
		  }
		}
	  
		swap(array, i + 1, high);
		return (i + 1);
	  }
	  
	  public void quickSort(double array[], int low, int high) {
		int stack[] = new int[high - low + 1];
		int top = -1;
	  
		stack[++top] = low;
		stack[++top] = high;
	  
		while (top >= 0) {
		  high = stack[top--];
		  low = stack[top--];
	  
		  int p = partition(array, low, high);
	  
		  if (p - 1 > low) {
			stack[++top] = low;
			stack[++top] = p - 1;
		  }
	  
		  if (p + 1 < high) {
			stack[++top] = p + 1;
			stack[++top] = high;
		  }
		}
	  }
}
