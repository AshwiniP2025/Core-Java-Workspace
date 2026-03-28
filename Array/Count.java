package Array;

public class Count {
	public static void main(String args[]) {

	int a[] = {108, 21, 3, 8, 11};
	int Count = 0;
	
	for(int i = 0; i < a.length; i++)
		if(a[i]%2 == 0)
			Count++;
	
	System.out.println(Count);
}
}