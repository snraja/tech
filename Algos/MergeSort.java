

public class MergeSort
{
	static int numbers[] = { 10, 66, 5, 8, 21, 67, 45 };
	
	public static void main(String[] args) 
	{
		mergeSort(numbers, 0, numbers.length);

	}

	static void mergeSort(int[] array, int start, int end)
	{
		if(end > start)
		{
			mergeSort(array, start, (start + end)/2);
			mergeSort(array, (start + end)/2 + 1 , end);
			merge(array, start, end, (start + end)/2);
		}

	}

	static void merge(int[] array, int left, int right, int middle)
	{
		int n1 = middle - left;
		int n2 = right - middle;
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

	}
}