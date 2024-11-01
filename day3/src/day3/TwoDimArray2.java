package day3;

public class TwoDimArray2 
{
	public static void main(String[] args) 
	{
		int two_ar3 [][] = new int[4][];
		/*
		 *  stack : two_ar3 : 500번지
		 *  heap : 500:[600번지][][][]
		 *  	   600:[1개]
		 */
		
		//System.out.println(two_ar3.length);
		
		for(int i = 0; i < two_ar3.length; i++)
		{
			two_ar3[i] = new int[i+1];
			
			for(int j = 0; j < two_ar3[i].length; j++)
			{
				two_ar3[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(two_ar3[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}
