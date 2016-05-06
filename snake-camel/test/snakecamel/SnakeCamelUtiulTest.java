package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtiulTest {
	
	@Test
	public void snakeToCamelcaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String expected1 = "College";
		String actual1 = scu.snakeToCamelcase("college");
		
		String expected2 = "TsudaCollege";
		String actual2 = scu.snakeToCamelcase("tsuda_college");
		
		String expected3 = "KodairaTokyoJapan";
		String actual3 = scu.snakeToCamelcase("kodaira_tokyo_japan");
		
		assertThat(actual1, is(expected1));
		assertThat(actual2, is(expected2));
		assertThat(actual3, is(expected3));
	}
	
	@Test
	public void camelToSnakecaseTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String expected1 = "college";
		String actual1 = scu.camelToSnakecase("College");
		
		String expected2 = "tsuda_college";
		String actual2 = scu.camelToSnakecase("TsudaCollege");
		
		String expected3 = "kodaira_tokyo_japan";
		String actual3 = scu.camelToSnakecase("KodairaTokyoJapan");
		
		assertThat(actual1, is(expected1));
		assertThat(actual2, is(expected2));
		assertThat(actual3, is(expected3));
	}
	
	@Test
	public void capitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String expected = "College";
		String actual = scu.capitalize("college");
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		
		String expected = "college";
		String actual = scu.uncapitalize("College");
		
		assertThat(actual, is(expected));
	}
}	

