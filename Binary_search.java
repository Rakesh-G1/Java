package arrays;

public class Binary_search 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {3,4,5,7,1,8};
		int x,y,temp;
		for(x=0;x<a.length;x++)
		{
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		System.out.println("sorted array is:");
		for(int w:a)
		{
			System.out.println(w);
		}
		int low,high,mid;
		low=a[0];
		high=a.length-1;
		int search=5;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]<search)
			{
				low=mid+1;
			}
			else if(a[mid]==search)
			{
				System.out.println("element found:"+mid);
				break;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println("element not found");
		}

	}

}
