package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println("TsudaCollege -> " + scu.camelToSnakecase("TsudaCollege"));
		System.out.println("tsuda_college -> " + scu.snakeToCamelcase("tsuda_college"));
		System.out.println("college -> " + scu.capitalize("college"));
		System.out.println("College -> " + scu.uncapitalize("College"));
	}

}
