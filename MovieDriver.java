import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner mv=new Scanner(System.in);
		
		String movie, rating, cont;
		int sales;
		
		do {
		System.out.println("Name of Movie: ");
		movie=mv.next();
		System.out.println("Rating for "+movie+": ");
		rating=mv.next();
		System.out.println("Number of tickets sold for "+movie+": ");
		sales=mv.nextInt();
		mv.nextLine();
		
		Movie user=new Movie(movie, rating, sales);
		System.out.println(user.toString());
		
		System.out.println("Do you want to continue?(Y/N): ");
		cont=mv.next();
		System.out.print("\n");
		}while(cont.equals("Y") || cont.equals("y"));
		
		System.out.println("Goodbye");
		
		
	}		
}

