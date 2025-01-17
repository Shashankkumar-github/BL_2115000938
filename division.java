import java.util.Scanner;
public class divison
{
	public static void main(String[] args) 
	{
	     int fnum,snum,res=0;
	     Scanner sc = new Scanner(System.in);
	   
		System.out.println("enter the first num:");
		fnum = sc.nextInt();
		System.out.println("enter the second num:");
		snum = sc.nextInt();
		
		res = fnum/snum;
			System.out.println (res);
            sc.close();
	}
}
