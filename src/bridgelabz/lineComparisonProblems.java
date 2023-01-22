package bridgelabz;

import java.util.Scanner;

public class lineComparisonProblems {
	public static void compareline() {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double x4;
		double y4;
		
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter x1");
		 x1=scanner.nextInt();
		 
		 System.out.println("Enter the y1");
		 y1=scanner.nextInt();
		 
		 System.out.println("Enter the x2;");
		 x2=scanner.nextInt();
		 
		 System.out.println("Enter the y2");
		 y2=scanner.nextInt();
		 
		 System.out.println("Enter the x3");
		 x3=scanner.nextInt();
		 
		 System.out.println("Enter the y3");
		 y3=scanner.nextInt();
		 
		 System.out.println("Enter the x4");
		 x4=scanner.nextInt();
		 
		 System.out.println("Enter the y4");
		 y4=scanner.nextInt();
		 
		 
		 double length1=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		 String str1=Double.toString(length1);
		 double length2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3, 2));
		 String str2=Double.toString(length2);
		 System.out.println(str2.compareTo(str1));
	}
	public static void main(String args[]) {
		compareline();
	}

}
