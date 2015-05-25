import org.junit.Test;
import java.math.BigDecimal;
import junit.framework.TestCase;
public class caculate_test extends TestCase {
	private Caculator ca = new Caculator();
	protected void setUp() throws Exception {
		super.setUp();
	}
	@Test
	public void test_Add() {
		ca.setNum1(1);
		ca.setNum2(2);
		ca.Add();
		assertEquals("3.0", ca.getResult());
		ca.setNum1(2.4);
		ca.setNum2(1.2);
		ca.Add();
		assertEquals("3.6", ca.getResult());
		ca.setNum1(Double.MAX_VALUE);
		ca.setNum2(2);
		ca.Add();
		assertEquals("ERROR", ca.getResult());
		}
	@Test
	public void test_Sub() {
		ca.setNum1(1);
		ca.setNum2(2);
		ca.Sub();
		assertEquals("-1.0", ca.getResult());
		ca.setNum1(2.4);
		ca.setNum2(1.2);
		ca.Sub();
		assertEquals("1.2", ca.getResult());
		ca.setNum1(-Double.MAX_VALUE);
		ca.setNum2(2);
		ca.Sub();
		assertEquals("ERROR", ca.getResult());
		}
	@Test
	public void test_Mul() {
		ca.setNum1(1);
		ca.setNum2(2);
		ca.Mul();
		assertEquals("2.0", ca.getResult());
		ca.setNum1(2.4);
		ca.setNum2(1.2);
		ca.Mul();
		assertEquals("2.88", ca.getResult());
		ca.setNum1(1.3);
		ca.setNum2(0);
		ca.Mul();
		assertEquals("0.0", ca.getResult());
		ca.setNum1(Double.MAX_VALUE);
		ca.setNum2(2);
		ca.Mul();
		assertEquals("ERROR", ca.getResult());
		}
	@Test
	public void test_Div() {
		ca.setNum1(1);
		ca.setNum2(2);
		ca.Div();
		assertEquals("0.5", ca.getResult());
		ca.setNum1(2.4);
		ca.setNum2(1.2);
		ca.Div();
		assertEquals("2.0", ca.getResult());
		ca.setNum1(1.3);
		ca.setNum2(0);
		ca.Div();
		assertEquals("ERROR", ca.getResult());
		}
}
