package maccess;

public class min {
	static void min(int[] arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i])
				min=arr[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {13,56,1,4,14};
min(a);
	}

}
