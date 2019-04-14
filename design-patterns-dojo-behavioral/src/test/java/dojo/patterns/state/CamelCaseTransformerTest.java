package dojo.patterns.state;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CamelCaseTransformerTest {

	private CamelCaseTransformer transformer = new CamelCaseTransformer();
	
	@Test
	public void should_return_empty_string_for_empty_string() throws Exception {
		String result = transformer.transform("");
		assertThat(result).isEmpty();
	}
	
	@Test
	public void should_return_single_word() throws Exception {
		String result = transformer.transform("word");
		assertThat(result).isEqualTo("word");
	}
	
	@Test
	public void should_transform_characters_to_lowercase() throws Exception {
		String result = transformer.transform("complexWord");
		assertThat(result).isEqualTo("complexword");
	}
	
	@Test
	public void should_transform_multiple_words() throws Exception {
		String result = transformer.transform("complex_word_example");
		assertThat(result).isEqualTo("complexWordExample");
	}
	
}
