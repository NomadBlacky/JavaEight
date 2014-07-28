import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;


public class Java8EightTest {

	
	@Test
	public void a2zIntStreamTest() throws Exception {
		
		StringBuilder sb = new StringBuilder();
		IntStream.rangeClosed('a', 'z').forEach(i -> (sb.append((char) i) ));
		
		assertThat(sb.toString(), is("abcdefghijklmnopqrstuvwxyz"));
	}

}
