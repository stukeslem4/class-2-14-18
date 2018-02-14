
public class Ave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=118;
		int b=36;
		int c=22;

		double x=average(a,b,c);
		System.out.println("The average is " + x);

		int d=200;
		int e=6;
		int f=97;		

		double y=average(d,e,f);
		System.out.println("the average is " + y);
		
		
		
		
	}

	public static double average(int a1, int a2, int a3){

		double average=((a1+a2+a3)/3);
		return average;
	}



}
