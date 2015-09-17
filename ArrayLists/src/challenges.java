import java.util.ArrayList;

public class challenges
	{
		public static void main(String[] args)
			{
				ArrayList <Double> deci = new ArrayList<Double>();
				deci.add(5.5);
				deci.add(3.14);
				deci.add(65.3);
				deci.add(29.77);
				deci.add(0.001);
				double sum=deci.get(0)+deci.get(1)+deci.get(2)+deci.get(3)+deci.get(4);
			for(double fred : deci)
				{
				System.out.println(fred);
				}
			System.out.println("Here are the numbers added up: " + sum);
			deci.remove(0);
			deci.add(2.2);
			deci.add(3.67);
			System.out.println(deci);
			double sum2=(deci.get(0)+deci.get(1)+deci.get(2)+deci.get(3)+deci.get(4)+deci.get(5))/2;
			System.out.println("Here are the numbers averaged: " + sum2);
			}
	}