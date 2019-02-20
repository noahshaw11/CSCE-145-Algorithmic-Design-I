/*
 * Created by Noah Shaw
 */
public class StringHelper {
	//Methods
	public static String meshStrings(String firstString, String secondString)
	{
		System.out.println("Meshing "+firstString+" with "+ secondString+".");
		int counter = 0;
		if(firstString.length() < secondString.length())
		{
			counter = secondString.length();
		}
		else if(secondString.length() < firstString.length())
		{
			counter = firstString.length();
		}
		else
		{
			counter = secondString.length();
		}
		String newString = "";
		char firstC = '\0';
		char secondC = '\0';
		for(int i = 0; i < counter; i++)
		{
			if(i < firstString.length())
			{
				firstC = firstString.charAt(i);
				newString = newString + firstC;
			}
			if(i < secondString.length())
			{
				secondC = secondString.charAt(i);
				newString = newString + secondC;
			}
		}
		return newString;
	}
	public static String replaceVowelsWithOodle(String aString)
	{
		System.out.println("Replacing vowels with oodle in the word "+aString+".");
		String newString = "";
		for(int i = 0; i < aString.length(); i++)
		{
			char c = aString.charAt(i);
			c = Character.toLowerCase(c);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				newString += "oodle";
			}	
			else
			{
				newString += c;
			}
		}
		return newString;
	}
	public static double weight(String aString)
	{
		System.out.println("The weight of the word "+aString+" is:");
		double weight = 0;
		for(int i = 0; i < aString.length(); i++)
		{
			char c = aString.charAt(i);
			c = Character.toLowerCase(c);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				weight = weight + 2.5;
			}
			else
			{
				weight = weight + 3.4;
			}
		}
		return weight;
	}

}
