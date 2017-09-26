package exam;

import java.util.Scanner;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
public class e {
	
	public static void change(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input change: ");
		int counter = 0;
		double b = sc.nextDouble();
		int a = (int)b;
		double c = b-a;
		System.out.println("1000-baht banknotes = "+ a/1000);
		counter += a/1000;
		a = a-a/1000*1000;
		System.out.println("500-baht banknotes = "+ a/500);
		counter += a/500;
		a=a-a/500*500;
		System.out.println("100-baht banknotes = "+ a/100);
		counter += a/100;
		a=a-a/100*100;
		System.out.println("50-baht banknotes = "+ a/50);
		counter += a/50;
		a=a-a/50*50;
		System.out.println("20-baht banknotes = "+a/20);
		counter += a/20;
		a=a-a/20*20;
		System.out.println("10-baht coins = "+a/10);
		counter += a/10;
		a=a-a/10*10;
		System.out.println("5-baht coins = "+a/5);
		counter += a/5;
		a=a-a/5*5;
		System.out.println("1-baht coins = "+a/1);
		counter += a/1;
		a=a-a/1*1;
		System.out.println("50-satang coins = "+(int)(c/0.5));
	        counter += (int)(c/0.5);
	        c=c-(int)(c/0.5)*0.5;
		System.out.println("25-satang coins = "+(int)(c/0.25));
		counter += (int)(c/0.25);
		c=c-c/0.25*0.25;
		System.out.print("Total number of banknotes and coins = "+ counter);
	}
	 public static void menu(){
		 System.out.println("*--------- Welcome to SKE Restaurant ---------*");
			System.out.printf("|  1.) Pizza\t %5d Bath.                  |\n",250);
			System.out.printf("|  2.) Chickens\t %5d Bath.                  |\n",120);
			System.out.printf("|  3.) Coke\t %5d Bath.                  |\n",45);
			System.out.printf("|  4.) Total                                  |\n");
			System.out.printf("|  5.) Exit                                   |\n");
			System.out.println("*---------------------------------------------*");
	 }
	 public static void total(int pizza,int chickens,int coke){
		 System.out.println("*------ Menu ------+-- Qty --+-- Price --*");
		 int piz= pizza*250;
		 int chi=chickens*120;
		 int cok=coke*45;
		 if(piz>0){
			 System.out.printf("| Pizza\t\t   |   %5d |  %5d    |\n",pizza,piz);
		 }
		 if(chi>0){
			 System.out.printf("| Chickens\t   |   %5d |  %5d    |\n",chickens,chi);
		 }
		 if(cok>0){
			 System.out.printf("| Coke\t\t   |   %5d |  %5d    |\n",coke,cok);
		 }
		 System.out.println("+------------------+---------+-----------+");
		 System.out.printf("| Total\t\t             |  %5d    |\n",(piz+chi+cok));
		 System.out.println("*------------------+---------+-----------*");
	 }
	 
	 public static void recepit1(int pizza,int chickens,int coke){
		 
		 int piz= pizza*250;
		 int chi=chickens*120;
		 int cok=coke*45;
		 double z = (piz+chi+cok)-(piz+chi+cok)*0.95;
		 double x = (piz+chi+cok)-(piz+chi+cok)*0.9;
		 double y = (piz+chi+cok)*0.85;
		 System.out.println("+----------------------------------------+");
		 System.out.println("|                                        |");
		 System.out.println("+                RECEIPT                 +");
		 System.out.println("|                                        |");
		 System.out.println("+----------------------------------------+");
		 System.out.println("| Menu             | Quantity|  Price    |  ");
		 if(piz>0){
			 System.out.printf("| Pizza\t\t   |   %5d |  %5d    |\n",pizza,piz);
		 }
		 if(chi>0){
			 System.out.printf("| Chickens\t   |   %5d |  %5d    |\n",chickens,chi);
		 }
		 if(cok>0){
			 System.out.printf("| Coke\t\t   |   %5d |  %5d    |\n",coke,cok);
		 }
		 System.out.println("+------------------+---------+-----------+");
		 System.out.printf("| vat 5%%                            %.2f|\n",z);
		 System.out.printf("| member discount 10%%               %.2f|\n",x);
		 System.out.printf("| Total\t\t             |    %.2f |\n",y);
		 System.out.println("*------------------+---------+-----------*");
		 change();
	 }
 public static void receipt(int pizza,int chickens,int coke){
		 
		 int piz= pizza*250;
		 int chi=chickens*120;
		 int cok=coke*45;
		 
		 System.out.println("+----------------------------------------+");
		 System.out.println("|                                        |");
		 System.out.println("+                RECEIPT                 +");
		 System.out.println("|                                        |");
		 System.out.println("+----------------------------------------+");
		 System.out.println("| Menu             | Quantity|  Price    |  ");
		 if(piz>0){
			 System.out.printf("| Pizza\t\t   |   %5d |  %5d    |\n",pizza,piz);
		 }
		 if(chi>0){
			 System.out.printf("| Chickens\t   |   %5d |  %5d    |\n",chickens,chi);
		 }
		 if(cok>0){
			 System.out.printf("| Coke\t\t   |   %5d |  %5d    |\n",coke,cok);
		 }
		 System.out.println("+------------------+---------+-----------+");
		 System.out.printf("| vat 5%%                            %.2f|\n",(piz+chi+cok)-(piz+chi+cok)*0.95);
		 System.out.printf("| Total\t\t             |  %.2f   |\n",(piz+chi+cok)*0.95);
		 System.out.println("*------------------+---------+-----------*");
		 change();
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pizza = 0;
		int chickens = 0;
		int coke = 0;
		
		menu();
		while(true){
			System.out.printf("\nEnter your Choice: ");
			int num =sc.nextInt();
			if(num==5){
				System.out.print("Do you have a member card?(yes/no): ");
				String card = sc.next();
				if(card.equals("yes")){
					recepit1( pizza, chickens, coke);
					System.out.print("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
					System.out.println("============== Thank you =================");
					System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				}
				if(card.equals("no")){
					receipt(pizza,chickens,coke);
					System.out.printf("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
					System.out.println("============== Thank you =================");
					System.out.print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				}
				
				
				break;
			}
			else if(num==4){
				
				total(pizza,chickens,coke);
				
			}
			else {
				System.out.print("Enter Quantity:");
				int num1=sc.nextInt();
				if(num==3){
					coke=coke+num1;	
				}
				else if(num==2){
					chickens=chickens+num1;
				}
				else if(num==1){
					pizza=pizza+num1;
				}
				
			}
		}
		
		
	}
}

