package Patterns;

public class Alpha_rat {

	public static void main(String[] args) {
		  byte a=65;
				for(int i=1;i<=4;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print((char)a++ +" ");
							//a++;
					}
					System.out.println();
									}
	}

}
