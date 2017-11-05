package exam;

import java.io.InputStream;
import java.util.Scanner;

public class RestaurantManager {

	static final String MENU_FILE = "exam/Menu.txt";

	public String readFile() {
		

		
		ClassLoader loader = RestaurantManager.class.getClassLoader();
		InputStream input = loader.getResourceAsStream(MENU_FILE);
		
		Scanner sc = new Scanner(input);
		
		String munu = "";
		
		while(sc.hasNextLine()){
			munu += sc.nextLine() + "\n";
			
		}
		return munu;
	}
	

}
