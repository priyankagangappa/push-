package project;

public class datatype3 {

	public static void main(String[] args) {
		char ch='C';
		if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			if (ch<='a' && ch>='z'){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+"is a lowercase vowel");
			}
			else
			{
					System.out.println(ch+"is a lowercase consonant");
				}
			}
			else if (ch>='A' && ch<='Z') {	
				if(ch=='A'||ch=='B'||ch=='I'||ch=='O'||ch=='U') {
					System.out.println(ch+"is uppercase vowel");
				}
				else
				{
						System.out.println(ch+"is a uppercase consonant");
					}
				}
			}
		else if (ch>='0' && ch<='9') {
			System.out.println("it is a number");
		}
		else {
			System.out.println("it is a special character");
		}
		}

	}


