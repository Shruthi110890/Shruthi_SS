
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shruthi";
		String s3="Shruthi";
		
		//using stringbuffer
		StringBuffer s1= new StringBuffer("Shruthi");
		s1.reverse();
		
		System.out.println(s1);
		StringBuffer s2= new StringBuffer("Shruthi");
		s2.reverse();
		System.out.println(s2);
		
		if(s.equals(s3))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("unequal");
		}
		
		//using string function
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		//s1.append("333");
		//System.out.println(s1);
		//s1.delete(0, 2);
		if (s1.equals(s))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("un equal");
		}
		System.out.println(s1);
		

	}

}
