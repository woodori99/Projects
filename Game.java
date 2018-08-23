import java.util.*;
public class Game {
	public static Map<Integer, String> map = new HashMap<Integer, String>();
	public static int score = 0;
	public static void main(String[] args) {
		setMap();
		for (int count = 0; count < 3; count++) {
			Random r = new Random(); //creates new Random class
			int i = (r.nextInt(26) + 'a');
			char c = (char)i; //creates a random letter from the alphabet
			System.out.println(c); //prints out random character.
			correct(i);
		}
		System.out.println(score);

	}

	public static void setMap() {
		map.put(97, "Alpha");
		map.put(98, "Bravo");
		map.put(99, "Charlie");
		map.put(100, "Delta");
		map.put(101, "Echo");
		map.put(102, "Foxtrot");
		map.put(103, "Golf");
		map.put(104, "Hotel");
		map.put(105, "India");
		map.put(106, "Juliett");
		map.put(107, "Kilo");
		map.put(108, "Lima");
		map.put(109, "Mike");
		map.put(110, "November");
		map.put(111, "Oscar");
		map.put(112, "Papa");
		map.put(113, "Quebec");
		map.put(114, "Romeo");
		map.put(115, "Sierra");
		map.put(116, "Tango");
		map.put(117, "Uniform");
		map.put(118, "Victor");
		map.put(119, "Whiskey");
		map.put(120, "X-Ray");
		map.put(121, "Yankee");
		map.put(122, "Zulu");
	} 

	public static void correct(int i) {
		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		String k = map.get(i);
		if(k.equalsIgnoreCase(t)) {
			System.out.println("Correct!");
			score++;
		}
		
		else {
			System.out.println("Incorrect!");
		}
		return;
	}
 
}