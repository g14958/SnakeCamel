package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println("capitalize()");
		System.out.println(" -> " + scu.capitalize(""));
		System.out.println("c -> " + scu.capitalize("c"));
		System.out.println("college -> " + scu.capitalize("college"));
		System.out.println();
		
		System.out.println("unzcapitalize()");
		System.out.println(" -> " + scu.uncapitalize(""));
		System.out.println("C -> " + scu.uncapitalize("C"));
		System.out.println("College -> " + scu.uncapitalize("College"));
		System.out.println();
		
		System.out.println("snakeToCamelcase()");
		System.out.println("college -> " + scu.snakeToCamelcase("college"));
		System.out.println("tsuda_college -> " + scu.snakeToCamelcase("tsuda_college"));
		System.out.println("kodaira_tokyo_japan -> " + scu.snakeToCamelcase("kodaira_tokyo_japan"));
		System.out.println("kodaira__tokyo___japan -> " + scu.snakeToCamelcase("kodaira__tokyo___japan"));
		System.out.println("_tsuda_college -> " + scu.snakeToCamelcase("_tsuda_college"));
		System.out.println();
		
		System.out.println("camelToSnakecase()");
		System.out.println("TsudaCollege -> " + scu.camelToSnakecase("TsudaCollege"));
		System.out.println("KodairaTokyoJapan -> " + scu.camelToSnakecase("KodairaTokyoJapan"));
		
	}

}
