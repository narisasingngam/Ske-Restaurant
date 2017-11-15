import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Narisa Singngam
 */

public class Resterant {
	
//	private String[] menuItems;
//	private double[] prices;
	
	static private RestaurantManager restaurant = new RestaurantManager();
	static  Scanner console = new Scanner(System.in);
	
	static Food[] menu = new Food[buildMenu(restaurant.readFile()).size()];

	public static ArrayList<Food> buildMenu(String menu){
		Scanner sc = new Scanner(menu);
		String collect = "";
		int price = 0;
		ArrayList<Food> food = new ArrayList<Food>();
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			collect = line.split(";")[0];
			price = Integer.parseInt(line.split(";")[1].trim());
			food.add(new Food(collect,price));
		}
		return food;
	}
	
	public static void printmenu() {
		for (int h = 0; h < menu.length; h++) {
		System.out.printf("|  %d.) %s\t %5d Bath.                  |\n", h + 1, menu[h].getMenuItems(), menu[h].getPrices());
		}
		System.out.printf("|  %d.) Total                                  |\n",menu.length+1);
		System.out.printf("|  %d.) Exit                                   |\n",menu.length+2);
	}
	//use print menu() to print whole menu
	public static void menu() {
		System.out.println("*--------- Welcome to SKE Restaurant ---------*");
		printmenu();
		System.out.println("*---------------------------------------------*");
	}
//calculate total price
	public static int total(){
		int sum = 0;
		for(int i =0;i<menu.length;i++){
			sum = sum+menu[i].getQuantity()*menu[i].getPrices();
		}
		return sum;
	}
	
	public static void printTotal(){
		for(int i =0;i<menu.length;i++){
			if (menu[i].getQuantity()*menu[i].getPrices() > 0) {
				System.out.printf("| %-14s   |   %5d |  %5d    |\n",menu[i].getMenuItems(),menu[i].getQuantity(),menu[i].getQuantity()*menu[i].getPrices());
			}
		}
		
	}
	
	public static void totalMenu() {

		System.out.println("*------ Menu ------+-- Qty --+-- Price --*");
		printTotal();
		System.out.println("+------------------+---------+-----------+");
		System.out.printf("| Total\t\t             |  %5d    |\n",total() );
		System.out.println("*------------------+---------+-----------*");
	}

	public static void receipt(String card) {


		System.out.println("+----------------------------------------+");
		System.out.println("|                                        |");
		System.out.println("+                RECEIPT                 +");
		System.out.println("|                                        |");
		System.out.println("+----------------------------------------+");
		System.out.println("| Menu             | Quantity|  Price    |  ");
		printTotal();
		System.out.println("+------------------+---------+-----------+");
		System.out.printf("| vat 5%%                            %.2f|\n", total()-total() * 0.95);
		
		if(card.equals("yes")){
			System.out.printf("| member discount 10%%               %.2f|\n", total()-total()*0.9);
		}
		
		System.out.printf("| Total\t\t             |  %.2f   |\n", total()* 0.95);
		System.out.println("*------------------+---------+-----------*");
		
	}

	public static void card() {
		System.out.print("Do you have a member card?(yes/no): ");
		String card = console.next();
		
			receipt(card);
			System.out.printf("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
			System.out.println("============== Thank you =================");
			System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
	}

	public static void main(String[] args) {
		menu = buildMenu(restaurant.readFile()).toArray(menu);
		menu();
		while (true) {
			System.out.printf("\nEnter your Choice: ");
			int num = console.nextInt();
			if (num == menu.length+2) {

				card();
				break;
			} else if (num == menu.length+1) {

				totalMenu();

			} else {
				System.out.print("Enter Quantity:");
				int num1 = console.nextInt();
				menu[num-1].addQuantity(num1);


			}
		}

	}
}

