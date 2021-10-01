import java.util.ArrayList;
import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Compagnies A = new Compagnies("Company A","apartment or house, and property insurance");
		 Compagnies B = new Compagnies("Company B","5 door car or 4 door car, and a driver's license and car insurance.");
		 Compagnies C = new Compagnies("Company C","social security number and a work permit");
		 Compagnies D = new Compagnies("Company D","apartment or a flat or a house");
		 Compagnies E = new Compagnies("Company E","driver's license and a 2 door car or a 3 door car or a 4 door car or a 5 door car");
		 Compagnies F = new Compagnies("Company F","scooter or a bike, or a motorcycle and a driver's license and motorcycle insurance");
		 Compagnies G = new Compagnies("Company G","massage qualification certificate and a liability insurance");
		 Compagnies H = new Compagnies("Company H","storage place or a garage");
		 Compagnies I = new Compagnies("Company I","doesn't require anything, you can come and start working immediately");
		 Compagnies J = new Compagnies("Company J","requires a PayPal account");

		 
		 ArrayList<Compagnies> allCompagnies = new ArrayList<Compagnies>();
		 allCompagnies.add(A);
		 allCompagnies.add(B);
		 allCompagnies.add(C);
		 allCompagnies.add(D);
		 allCompagnies.add(E);
		 allCompagnies.add(F);
		 allCompagnies.add(G);
		 allCompagnies.add(H);
		 allCompagnies.add(I);
		 allCompagnies.add(J);
		// System.out.println(allCompagnies);
		 Scanner sc = new Scanner(System.in);
	        System.out.printf("To search a Job, please enter thing you have:");
	        String requirement = sc.nextLine();
		 for(Compagnies element : allCompagnies) {
			 if(element.getRequirement().contains(requirement)) {
				 System.out.println(element.getNom()+", but requires "+ element.getRequirement());
			 }
		 }
	        System.out.println("Company I is good for you but they require anything, you can come and start working immediately");

		 
			//System.out.println(jordan.getNom());
			
	}

}
