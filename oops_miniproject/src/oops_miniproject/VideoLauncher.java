package oops_miniproject;
import java.util.Scanner;
public class VideoLauncher {
		public static void main(String[] args) {
			VideoStore vs = new VideoStore();
			Scanner sc = new Scanner(System.in);
			int choice;
			
			do {
				System.out.println("MAIN MENU ");
				System.out.println("\n===========");
				System.out.println("1.Add Videos : ");
				System.out.println("2.Check Out Video : ");
				System.out.println("3.Return Video : ");
				System.out.println("4.Receive Rating : ");
				System.out.println("5.List Inventory : ");
				System.out.println("6.Exit : ");
				System.out.println("Enter your choice(1-6) : ");
				choice = sc.nextInt();
				sc.nextLine();
				
				switch(choice) {
				case 1:
					System.out.println("Enter your Video name to add: ");
					String nameAdd = sc.nextLine();
					vs.addVideo(nameAdd);
					break;
				case 2:
					System.out.println("Enter video name check out: ");
					String nameCheckout = sc.nextLine();
					vs.doCheckOut(nameCheckout);
					break;
				case 3:
					System.out.println("Enter video name to return: ");
					String nameReturn = sc.nextLine();
					vs.doReturn(nameReturn);
					break;
				case 4:
					System.out.println("Enter video name to rate: ");
					String nameRate = sc.nextLine();
					System.out.println("Enter rating(1-10): ");
					int rating = sc.nextInt();
					vs.receiveRating(rating, nameRate);
					break;
				case 5:
					vs.listInventory();
					break;
				case 6:
					System.out.println("Exiting.... Thank you!");
					break;
				default:
					System.out.println("Inavlid choice, Please enter valid choice from 1-6.");
				}
			}while(choice != 6);
			sc.close();
			
		}
	}
