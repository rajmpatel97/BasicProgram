public class Palindrome {
		public static void main(String[] args)
		{
			String string = "354";
			String revs = "";
			for (int i=string.length()-1;i>=0; i--)
			{
				revs = revs + string.charAt(i);
			}
			if(string.equals(revs))
				System.out.println("Palindrom String");
			else
				System.out.println("Not Palindrom String");
		}
	}
