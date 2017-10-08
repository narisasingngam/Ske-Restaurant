package exam;

import java.util.Scanner;


public class restaurant {
	static Scanner console = new Scanner(System.in);
	static String[] menuE = { "Pizza", "Chickens", "Coke"};
	static int[] price = { 250, 120, 45};
	static int[] quantity = {0,0,0};



	public static void printmenu() {
		for (int h = 0; h < menuE.length; h++) {
		System.out.printf("|  %d.) %s\t %5d Bath.                  |\n", h + 1, menuE[h], price[h]);
		}
		System.out.printf("|  %d.) Total                                  |\n",menuE.length+1);
		System.out.printf("|  %d.) Exit                                   |\n",menuE.length+2);
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
		for(int i =0;i<quantity.length;i++){
			sum = sum+quantity[i]*price[i];
		}
		return sum;
	}
	
	public static void printTotal(){
		for(int i =0;i<quantity.length;i++){
			if (quantity[i]*price[i] > 0) {
				System.out.printf("| %-14s   |   %5d |  %5d    |\n",menuE[i],quantity[i],quantity[i]*price[i]);
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

		menu();
		while (true) {
			System.out.printf("\nEnter your Choice: ");
			int num = console.nextInt();
			if (num == 5) {

				card();
				break;
			} else if (num == 4) {

				totalMenu();

			} else {
				System.out.print("Enter Quantity:");
				int num1 = console.nextInt();
				if (num == 3) {
					quantity[2]+=num1;
				} else if (num == 2) {
					quantity[1]+=num1;
				} else if (num == 1) {
					quantity[0]+=num1;
				}

			}
		}

	}
}