package test_2401031;

import java.util.Arrays;

public class Ex4 
{
	public static void main(String[] args) 
	{
		char alphas [] = {'J', 'a', 'v', 'a', 'B', 'a', 'c', 'k', 'E', 'n', 'd'};

		for(int i = 0; i < alphas.length; i++)
		{
			if(96 < (int)alphas[i] && (int)alphas[i] < 123)
			{
				alphas[i] = (char) (alphas[i] - 32);
			}
			else if(64 < (int)alphas[i] && (int)alphas[i] < 91)
			{
				alphas[i] = (char) (alphas[i] + 32);
			}
		}

		System.out.println(Arrays.toString(alphas));
	}
}
