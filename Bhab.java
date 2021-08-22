package snippet;
import java.util.Scanner;
public class Bhab {
	
	public static void readGear() {
		Scanner gr=new Scanner(System.in);
		System.out.println("Enter 4 Letters");
		char ch1=gr.next().charAt(0);
		char ch2=gr.next().charAt(0);
		char ch3=gr.next().charAt(0);
		char ch4=gr.next().charAt(0);
		performGear(ch1,ch2,ch3,ch4);
		
	}
	
	public static void performGear(char ch1,char ch2,char ch3,char ch4)
	{
		if(ch1=='a')
		{
		System.out.println("The Gear Word is \t "+ch1+ch3+ch4+ch1+ch1+ch2);
		}
		else if(ch2=='a')
		{
			System.out.println("The Gear word is \t "+ ch2+ch3+ch3+ch1+ch2+ch1);
		}
		else if(ch3=='a')
		{
			System.out.println("The Gear Word is \t "+ ch3+ch4+ch4+ch4+ch1+ch1+ch3+ch2);
		}
		else if(ch4=='a')
		{
			System.out.println("The Gear Word is \t "+ ch1+ch1+ch4+ch3+ch1+ch3+ch4+ch2+ch1);
		}
		else
		{
			System.out.println("The Gear word is \t " +ch1+ch2+ch3+ch4);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gear\n");
		readGear();
		
	}
	

}
