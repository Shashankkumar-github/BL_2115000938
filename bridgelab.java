import java.util.Scanner;
public class bridgelab
{
	public static void main(String[] args) 
	{
	     int fnum,snum,res=0;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter +for addition,-for subtraction,*for multiplication,/for division and %for modulus:");
	     char ch= sc.next().charAt(0);
		System.out.println("enter the first num:");
		fnum = sc.nextInt();
		System.out.println("enter the second num:");
		snum = sc.nextInt();
		switch (ch)
		{
		     case '+':
		          res = fnum + snum;
		          break;
		      case '-':
		          res = fnum - snum;
		          break;
		      case '*':
		          res = fnum * snum;
		          break;
		      case '/':
		          res = fnum / snum;
		          break;
		      case '%':
		          res = fnum % snum;
		          break;
		    default:
		    System.out.println("please enter a valid symbol!!");
		    }
			System.out.println (res);
            sc.close();
	}
}