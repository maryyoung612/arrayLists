import java.util.ArrayList;

public class secondChallenge
	{
		static ArrayList <Double> temp = new ArrayList<Double>();
		public static void main(String[] args)
			{
				
				temp.add(98.6);
				temp.add(97.6);
				temp.add(100.0);
				temp.add(102.0);
				temp.add(98.0);
				temp.add(97.9);
				temp.add(98.3);
				temp.add(99.3);
				temp.add(99.7);
				temp.add(98.25);
			for(double fred:temp)
				{
				System.out.println(fred+ " degrees Fahrenheit");
				}
			check();
			}
		public static void check()
			{
			Double counter=0.0;
			for(int i=0;i>secondChallenge.temp.size();i++)
				{
				if(secondChallenge.temp.get(i)>=98.6)
					{
					counter=counter+secondChallenge.temp.get(i);
					}
				}
			System.out.println(counter+ " many people have fevers");
			}
	}