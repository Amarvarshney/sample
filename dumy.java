public class dumy
{
	public static void main(String[] args) {
		String s = "!122amdf::$#%#3kf";
		System.out.println(s);
		s = s.replaceAll("[a-z A-Z 0-9]", "");
		System.out.println(s);
	}
}
