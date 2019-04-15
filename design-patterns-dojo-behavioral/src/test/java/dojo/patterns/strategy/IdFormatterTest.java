package dojo.patterns.strategy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IdFormatterTest {

	private IdFormatter formatter = new IdFormatter();
	
	@Test
	public void should_format_words_in_camel_case() throws Exception {
		// TODO CamelCaseFormatterStrategy beállítása a formatter példányban
		assertThat(formatter.format("")).isEqualTo("");
		assertThat(formatter.format("word")).isEqualTo("word");
		assertThat(formatter.format("two words")).isEqualTo("twoWords");
		assertThat(formatter.format("UPPER case")).isEqualTo("upperCase");
	}
	
	@Test
	public void should_format_words_in_snake_case() throws Exception {
		// TODO SnakeCaseFormatterStrategy beállítása a formatter példányban
		assertThat(formatter.format("")).isEqualTo("");
		assertThat(formatter.format("word")).isEqualTo("word");
		assertThat(formatter.format("two words")).isEqualTo("two_words");
		assertThat(formatter.format("UPPER case")).isEqualTo("upper_case");
	}
	
}
