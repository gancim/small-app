import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mg.small.obj.NumberPrevision;
import com.mg.small.obj.Prevision;
import com.mg.small.obj.StringPrevision;

public class PrevisionTest {

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
	
	@Test
	public void string() {
		Prevision np = new StringPrevision();
	
		assertTrue(np.getPrevision().equals(StringPrevision.msg));
	}

}
