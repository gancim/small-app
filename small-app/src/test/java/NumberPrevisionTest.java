import org.junit.Test;

import static org.junit.Assert.*;

import com.mg.small.obj.NumberPrevision;

public class NumberPrevisionTest {

	@Test
	public void number() {
		NumberPrevision np = new NumberPrevision();
		boolean isNumber = true;
		try{
			Integer.parseInt(np.getPrevision());
		} catch(Exception e) {
			isNumber = false;
		}
		assertTrue(isNumber);
	}

}
