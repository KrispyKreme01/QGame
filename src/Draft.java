import java.util.Scanner;

public class Draft {
	public static boolean chkAnswer = false;
	public static String[] eRiddles = new String[] {"What doesn't get any wetter, no matter how much rain falls on it?", "Feed me and I live, yet give me a drink and I die. What am I?", 
		                                             "What is easy to get into, but hard to get out of?", "What belongs to you but others use it more than you do?",
		                                             "Fashions change but what can a person wear that is never out of style?", "What kind of key do you use on Thanksgiving?"};
	public static String mRiddles[] = new String[] {"What did the thief get for stealing the calendar?",
													"What is big and yellow and comes in the morning, to brighten mom's day?",
													"I am always in front and never behind. What am I?",
													"You will always find me in the past. I can be created in the present, But the future can never taint me. What am I?",
													"What has many keys but cannot open a single lock",
													"What kind of dog keeps the best time?"};
	public static String hRiddles[] = new String[] {"I pass before the sun, yet make no shadow. What am I?",
													"I can fly but have no wings. I can cry but I have no eyes. Wherever I go, darkness follows me.",
													"The more you take, the more you leave behind. What am I?",
													"You throw away the outside and cook the inside. Then you eat the outside and throw away the inside. What did you eat?",
													"Whats a seven letter word containing thousands of letters",
													"Which word does not belong in the following list: Stop cop mop chop prop shop or crop?"};
	
	public static String eAnswer[] = new String[] {"water", "fire", "trouble", "name", "smile", "turkey"};
	public static String mAnswer[] = new String[] {"12 months", "school bus", "future", "sistory", "keyboard", "watchdog"} ;
	public static String hAnswer[] = new String[] {"wind", "clouds", "footsteps", "corn", "mailbox"};
	public static String userAnswer[] = new String[5];
	public static int dCounter = 0;
	public static int score = 0;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("welcome message goes here\n\n\n");
		chooseDiff();
		switch (dCounter) {
		case 1:
			easydifficulty();
			break;
		case 2:
			easydifficulty();
			break;
		case 3: 
			easydifficulty();
			break;
		default:
			System.out.println("error");
		}
		System.out.println("congrats, youre done: " + score);
		
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
}
