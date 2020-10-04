package api;

import java.util.StringTokenizer;

public class Data {
	
	public static String pays = null;
	public static int NewConfirmed = 0;
	public static int TotalConfirmed = 0;
	public static int NewDeaths = 0;
	public static int TotalDeaths = 0;
	public static int NewRecovered = 0;
	public static int TotalRecovered = 0;
	
	public static String input[];
	
	public Data () {
		
		input = new String[8];
		
		printAll();
		
	}
	
	public static void print_values () {
		for (int i=0; i<8; i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void update_values () {
		
		NewConfirmed = Integer.parseInt(input[1].substring(25));
		TotalConfirmed = Integer.parseInt(input[2].substring(17));
		NewDeaths = Integer.parseInt(input[3].substring(12));
		TotalDeaths = Integer.parseInt(input[4].substring(14));
		NewRecovered = Integer.parseInt(input[5].substring(15));
		
		String temp;
		
		temp = input[6].substring(17);
		temp = temp.substring(0, temp.length()-1);
		
		TotalRecovered = Integer.parseInt(temp);
		pays = "Global";
		
	}
	
	public static void printAll () {
		
		System.out.println("---------   Global COVID19 situation\t----------");
		System.out.println("\tNewConfirmed : \t\t"+NewConfirmed);
		System.out.println("\tTotConfirmed : \t\t"+TotalConfirmed);
		System.out.println("\tNewDeaths : \t\t"+NewDeaths);
		System.out.println("\tTotDeaths : \t\t"+TotalDeaths);
		System.out.println("\tNewRecovered : \t\t"+NewRecovered);
		System.out.println("\tTotRecovered : \t\t"+TotalRecovered);
		System.out.println("---------   End of report\t\t----------");
	}

}
