package oops_miniproject;
import java.util.ArrayList;
public class VideoStore {

		private ArrayList<Video> store;
		
		public VideoStore() {
			store = new ArrayList<>();
		}
		public void addVideo(String name) {
			store.add(new Video(name));
			System.out.println("Video \""+ name + "\" added successfully");	
		}
		public void doCheckOut(String name) {
			for(Video v: store) {
				if(v.getName().equalsIgnoreCase(name)) {
					if(!v.getCheckout()) {
						v.doCheckout();
						System.out.println("Video \"" +name + "\" checked out.");
						return;
					}
					else {
						System.out.println("Video \"" +name + "\" is already checked out.");
						return;
						
					}
				}
			}
			System.out.println("Video \"" +name + "\" not found.");
		}
		public void doReturn(String name) {
			for(Video v: store) {
				if(v.getName().equalsIgnoreCase(name)) {
					if(v.getCheckout()) {
						v.doReturn();
						System.out.println("Video \"" +name + "\" returned.");
						return;
					}
					else {
						System.out.println("Video \"" +name + "\" is already returned.");
						return;
					}
				}
			}
			System.out.println("Video \"" +name + "\" not found.");
		}
		public void receiveRating(int rating,String name) {
			for(Video v: store) {
				if(v.getName().equalsIgnoreCase(name)) {
					v.receiveRating(rating);
					System.out.println("Rating  of "+ rating + " has been marked to \"" + name +"\" video." );
					return;
				}
			}
			System.out.println("Video \"" +name + "\" not found.");
		}
		public void listInventory() {
			System.out.println("\n Current Inventory: ");
			for(Video v : store) {
				System.out.println(v);
			}
			System.out.println();
		}

}
