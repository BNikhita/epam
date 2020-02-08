package example1;

public class Sweet3 extends Sweet1{
	public int totalweight(int [] choco,int c)

	{

		int total=0;

		for(int i=0;i<c;i++)

		{

			total=total+choco[i];

		}

		return total;

	}

	public int numofcandy(int low,int high,int[] sweets,int s)

	{

		int count=0;

		for(int i=0;i<s;i++)

		{

			if(sweets[i]>=low && sweets[i]<=high)

				count++;

		}

		return count;

	}

}