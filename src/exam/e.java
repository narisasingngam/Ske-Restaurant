package exam;

import java.util.Scanner;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
public class e {
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static int n = rand.nextInt(999)+0;
	static int count = 0;
	static String choice = "";
	
	public static void ran(int n ,int num,int count){
		if(num>n){
			System.out.printf("More than (trise:%d)",count);
		}
		else if(num<n){
			System.out.printf("Less than (trise:%d)",count);
		}
		else if(num==n){
			System.out.println("Correct! Well done!");
			System.out.printf("Total tries = %d\n",count);
			System.out.println("--------");
			System.out.print("Play again ,quit :");
			choice = sc.next();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Note:the random number is"+n);
		while(true){
			choice = "";
			System.out.printf("\nGress a number(0-999): ");
			int num = sc.nextInt();
			count++;
			ran( n , num,count);
			if(choice.equals("P")){
				n = rand.nextInt(999)+0;
				System.out.println("Note:the random number is"+n);
				count=0;
			}
			else if(choice.equals("Q")){
				System.out.print("bye ");
				break;
			}
		}
	}
}
// public static void table(int pizzas, int chickens, int coke) {
//  System.out.print("+------ Menu ------+-- Qty --+-- Price --+\n");
//  int pizpr = pizzas * 250;
//  int chkpr = chickens * 120;
//  int cokpr = coke * 45;
//  if (pizzas > 0) {
//   System.out.printf("| Pizza\t\t   |   %5d |     %5d |\n", pizzas, pizpr);
//  }
//  if (chickens > 0) {
//   System.out.printf("| Chickens\t   |   %5d |     %5d |\n", chickens, chkpr);
//  }
//  if (coke > 0) {
//   System.out.printf("| Coke\t\t   |   %5d |     %5d |\n", coke, cokpr);
//  }
//  System.out.print("+----------------------------+-----------+\n");
//  System.out.printf("| Total\t\t\t     |     %5d |\n", pizpr + chkpr + cokpr);
//  System.out.print("+----------------------------+-----------+\n");
// }
//
// public static void receipt(int p, int c, int cc) {
//  int pizpr = p * 250;
//  int chkpr = c * 120;
//  int cokpr = cc * 45;
//  int sum = pizpr + chkpr + cokpr;
//  int vat = (sum * 10) / 100;
//  LocalDate date = LocalDate.now();
//  LocalTime time = LocalTime.now();
//  System.out.println("()---------------------------------------------()");
//  System.out.println("|-----------------------------------------------|");
//  System.out.println("|                    RECEIPT                    |");
//  System.out.println("|-----------------------------------------------|");
//  System.out.println("|                          |   QTY |      TOTAL |");
//  System.out.println("|                          |-------|------------|");
//  if (p > 0) {
//   System.out.printf("| PIZZA                    | %5d |      %5d |\n", p, pizpr);
//  }
//  System.out.println("|                          |       |            |");
//  if (c > 0) {
//   System.out.printf("| CHICKENS                 | %5d |      %5d |\n", c, chkpr);
//  }
//  System.out.println("|                          |       |            |");
//  if (cc > 0) {
//   System.out.printf("| COKE                     | %5d |      %5d |\n", cc, cokpr);
//  }
//  System.out.println("|                          |       |            |");
//  System.out.println("|                          |       |            |");
//  System.out.println("|                          |       |            |");
//  System.out.printf("| VAT 10%%                  |       |      %5d |\n", vat);
//  System.out.println("|----------------------------------|------------|");
//  System.out.printf("| Included VAT                     |      %5d |\n", sum + vat);
//  System.out.println("|-----------------------------------------------|");
//  System.out.println("|================= Thank You! ==================|");
//  System.out.println("|-----------------------------------------------|");
//  System.out.printf("|                       %s  %s|\n", date, time);
//  System.out.println("|-----------------------------------------------|");
//  System.out.println("()---------------------------------------------()");
// }
//
// public static void menu() {
//  System.out.println("()------- Welcome to SKE Restaurant -------()");
//  System.out.printf("| 1.) Pizza\t%d Baht.\t\t    |\n", 250);
//  System.out.printf("| 2.) Chickens\t%d Baht.\t\t    |\n", 120);
//  System.out.printf("| 3.) Coke\t%d  Baht.\t\t    |\n", 45);
//  System.out.print("| 4.) Cancel Order\t\t\t    |\n");
//  System.out.print("| 5.) Total\t\t\t\t    |\n");
//  System.out.println("| 6.) Exit\t\t\t\t    |");
//  System.out.println("()-----------------------------------------()");
// }
//
// public static void main(String[] args) {
//  Scanner bd = new Scanner(System.in);
//  menu();
//  int pizzas = 0;
//  int chickens = 0;
//  int coca = 0;
//  while (true) {
//   System.out.println("+------------------+");
//   System.out.print("Enter your choice: ");
//   int choice = bd.nextInt();
//   if (choice == 6) {
//    receipt(pizzas, chickens, coca);
//    break;
//   } else if (choice == 5) {
//    // System.out.printf("%d %d %d", pizzas, chickens, coca);
//    table(pizzas, chickens, coca);
//    System.out.println();
//   } else if (choice == 4) {
//    System.out.println("1.) Pizza");
//    System.out.println("2.) Chicken");
//    System.out.println("3.) Coke");
//    System.out.print("Choose a menu to cancel: ");
//    int choice2 = bd.nextInt();
//    System.out.print("Enter Quantity: ");
//    int deamount = bd.nextInt();
//    System.out.println();
//    if (choice2 == 1) {
//     pizzas = pizzas - deamount;
//    } else if (choice2 == 2) {
//     chickens = chickens - deamount;
//    } else if (choice2 == 3) {
//     coca = coca - deamount;
//    }
//
//   } else {
//    System.out.print("Enter Quantity:    ");
//    int amount = bd.nextInt();
//    System.out.println();
//    if (choice == 1) {
//     pizzas = pizzas + amount;
//    } else if (choice == 2) {
//     chickens = chickens + amount;
//    } else if (choice == 3) {
//     coca = coca + amount;
//    }
//   }
//
//  }
// }
//}



//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String menu = "";
//		int x=0;
//		System.out.print("Enter a number : ");
//        int num =sc.nextInt();
//        System.out.printf("Factor of %d are : \n",num);
//        for(int i =1 ;i<=num;i++){
//        	x=i+1;
//        
//        		if(num%i==0){
//        			
//            		System.out.println(i);
//            		if(x%i==0){
//                		System.out.printf("%d<----Prime Number",x);
//        			}
//            	
//        	}
//        	
//        }
//		while(!menu.equals("Q")){
//			System.out.print("(A)gain or (Q)uit :");
//			menu=sc.nextLine();
//			if(menu.equals("A")){
//				System.out.print("Enter a number : ");
//		        int m =sc.nextInt();
//		        System.out.printf("Factor of %d are : \n",m);
//		        for(int i =1 ;i<=m;i++){
//		        	if(m%i==0){
//		        		System.out.println(i);
//		        	}
//		        }
//			}
//			else if(menu.equals("Q")){
//				break;
//			}
//			
//			
//		}
//        System.out.print("Bye Bye");
		
		
		
		
		
//	
//		Scanner sc = new Scanner(System.in);
//		String menu = "";
//		System.out.print("Enter a number : ");
//        int num =sc.nextInt();
//        System.out.printf("Factor of %d are : \n",num);
//        for(int i =1 ;i<=num;i++){
//        	if(num%i==0){
//        		System.out.println(i);
//        	}
//        }
//		while(!menu.equals("Q")){
//			System.out.print("(A)gain or (Q)uit :");
//			menu=sc.next();
//			if(menu.equals("A")){
//				System.out.print("Enter a number : ");
//		        int m =sc.nextInt();
//		        System.out.printf("Factor of %d are : \n",m);
//		        for(int i =1 ;i<=m;i++){
//		        	if(m%i==0){
//		        		System.out.println(i);
//		        	}
//		        }
//			}
//			else if(menu.equals("Q")){
//				break;
//			}
//			
//			
//		}
//        System.out.print("Bye Bye");
        
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int num =sc.nextInt();
//        System.out.printf("Factor of %d are : \n",num);
//        for(int i =1 ;i<=num;i++){
//        	if(num%i==0){
//        		System.out.println(i);
//        	}
//        }
//        
        
//	}
//
//}
