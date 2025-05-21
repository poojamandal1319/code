package javabasic;

import java.util.*;
public class area {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int s, b, r, m,l;
System.out.println("1. volume of cube, 2. volume of cuboid ,3. volume of sphere");
char ch;
System.out.println("Enter your choice");
ch=sc.next().charAt(0);
switch(ch)
{
case '1':
	System.out.println("Enter the side");
	s=sc.nextInt();
	double area=s*s*s;
	System.out.println("volume of cube is"+area);
	break;
	
case '2':
	System.out.println("Enter the length");
	System.out.println("Enter the breadth");
	System.out.println("Enter the height");
	l=sc.nextInt();
	m=sc.nextInt();
	int h=sc.nextInt();
	double area1 =l*m*h;
	System.out.println("volume of cuboid is"+area1);
	break;
	
case '3': 
	System.out.println("Enter the radius");
	r=sc.nextInt();
	double area2= 4/3*3.14*r*r*r;
	System.out.println(" volume of sphere is"+area2);
	break;

default: 
System.out.println("invalid choice(enter between 1 to 3)only");


}

	}

}