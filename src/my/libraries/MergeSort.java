package my.libraries;

public class MergeSort 
{
	public static int[] mergeSort(int[] array, int start, int end)
	{
		if(start-end<=2)
		{
			return sort(array);
		}
		else
		{
			int midPoint=array.length/2;
			int[] left=mergeSort(array,0,midPoint);
			int[] right=mergeSort(array,midPoint,end);
			int[] newArray=new int[left.length+right.length];
			for(int i=0; i<left.length; i++)
			{
				newArray[i]=left[i];
			}
			for(int i=0; i<right.length; i++)
			{
				newArray[i+left.length]=right[i];
			}
			return sort(newArray);
		}
	}
	
	public static int[] sort(int[] array)
	{
		int minIndex=-1;
		int swap=-1;
		for(int i=0; i<array.length; i++)
		{
			minIndex=i;
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[minIndex])
				{
					minIndex=j;
				}
			}
			if(array[minIndex]<array[i])
			{
				swap=array[i];
				array[i]=array[minIndex];
				array[minIndex]=swap;
			}
		}
		return array;
	}
}
