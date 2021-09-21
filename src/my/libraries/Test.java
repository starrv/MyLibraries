package my.libraries;

public class Test 
{

	public static void main(String[] args)
	{
		int[] array= {9,2,5,-5,-5,-5,3,6,-2,50,600,-500,2,5,0,0};
		printArray(MergeSort.mergeSort(array,0,array.length));
	}
	
	
	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
}
