package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="";
		String s1="java";
		for(int i=(s1.length()-1);i>=0;i--) {
		s2=s2+s1.charAt(i);
					}
		System.out.println(s2);

	}

}
