import java.util.Scanner;

public class BaseballStats {

		private static String Name;
		private static int hits;
		private static int AB;
		private static int BB;
		private static int dbl;
		private static int triple;
		private static int HR;
		private static int runs;
		private static int HBP;
		private static int SF;
		
		

		public static void main(String[] args) {
		 
			setStats();
			
			System.out.println("Batting Average: "+ BA());
			System.out.println("On Base Percentage: "+OBP());
			System.out.println("Slugging percentage: "+SLG());
			System.out.println("On Base + Slugging percentage: "+OBS());
			System.out.println("Total Bases: "+ TB());
		
		}
		
		
		public static void setStats() {
			
			Scanner input= new Scanner(System.in);
			
			System.out.println("Enter player name: ");
			Name=input.next();
			
			System.out.println("Enter number of hits here: ");
			hits=input.nextInt();
			
			System.out.println("Enter number of at bats here: ");
			AB=input.nextInt();
			
			System.out.println("Enter the number of walks here: ");
			BB=input.nextInt();
			
			System.out.println("Enter the number of doubles here: ");
			dbl=input.nextInt();
			
			System.out.println("Enter the number of triples here: ");
			triple=input.nextInt();
			
			System.out.println("Enter the number of home runs here: ");
			HR=input.nextInt();
			
			System.out.println("Enter the number of runs scored here: ");
			runs=input.nextInt();
			
			System.out.println("Enter the number of times hit by pitch: ");
			HBP=input.nextInt();
			
			System.out.println("Enter the number sacrifice flies here: ");
			SF=input.nextInt();
			
		}
		
		public static double BA()
		{
			
			return (double) hits/AB;
			 
		}
		public static double OBP()
		{
			return  (((double) hits+BB+HBP)/(AB+BB+HBP+SF));
			
		}
		
		public static double SLG()
		{
			return  (((double) hits+dbl+(triple*2)+(HR*3))/AB);
			
		}
		
		public static double OBS()
		{
			return (double) OBP()+SLG();
				
		}
		public static int TB()
		{
			return (int) (hits+dbl+(triple*2)+(HR*3));
			
		}
		
}