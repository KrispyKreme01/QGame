import java.util.Scanner;
public class QGame {
	public static String eRiddles[] = new String[5];
	public static String mRiddles[] = new String[5];
	public static String hRiddles[] = new String[5];
	public static Scanner sc = new Scanner(System.in);
	public static int dCounter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome message goes here\n\n\n");
		chooseDiff();
		switch (dCounter) {
		case 1:
			diffE();
			break;
		case 2:
			diffM();
			break;
		case 3: 
			diffH();
			break;
		default:
			System.out.println("error");
		}
		
		
	}
	
	public static void chooseDiff() {
		boolean flag = false;
		while (!flag) {
			System.out.println("please select your difficulty (e=easy, m=medium, h=hard");
			String diff = sc.nextLine();
			diff = diff.toLowerCase();
			if (diff.length() < 2 && diff.length() > 0) {
				switch(diff.charAt(0)){
				case 'e': 
					dCounter = 1;
					flag = true;
					break;
				case 'm':
					dCounter = 2;
					flag = true;
					break;
				case 'h':
					dCounter = 3;
					flag = true;
					break;
				default: 
					System.out.println("invalid input");
					flag = false;
					break;		
				}
			}
			else {
				System.out.println("invalid input");
				flag = false;
			}
		}
	}
	public static void diffE() {
		System.out.println("you have chosen easy");
		
	}
	public static void diffM() {
		System.out.println("you have chosen medium");
		
	}
	public static void diffH() {
		System.out.println("you have chosen hard");
		
	}

}
