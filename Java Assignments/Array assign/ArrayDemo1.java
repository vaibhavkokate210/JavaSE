package demo;

public class ArrayDemo1 {
	    static int cnt=0;
		void disp()
		{
			
			cnt++;
			System.out.println(cnt+" Object is created");
			
		}
	public static void main(String[] args) {
		ArrayDemo1 arr[] = new ArrayDemo1[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new ArrayDemo1();
			arr[i].disp();
		}

	}

}
