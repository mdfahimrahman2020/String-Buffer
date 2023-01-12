public class stringBuffer
{
	public static void main(String[] args)
	{
	  StringBuffer sb = new StringBuffer("Fahim");
	  System.out.println(sb);

	  //Adding String
	  sb.append(" Rahman ");
	  sb.append(21);

	  System.out.println(sb);

	  

	  //String length
	  sb.setLength(5);
	  System.out.println(sb);

	  //Reverse String
	  sb.reverse();
	  System.out.println(sb);

	  //Delete String
	  sb.delete(0,3);
	  System.out.println(sb);
	}
}