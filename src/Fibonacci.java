public class Fibonacci {
		public static void main(String[] args)
		{
			int j=0;
			int k=1;
			int result;
			System.out.print(j + " " + k);
			for (int i = 2; i < 6; i++)
			{
				result = j + k;
				j = k;
				k = result;
				System.out.print(" " + result);
			}			
		}
	}
