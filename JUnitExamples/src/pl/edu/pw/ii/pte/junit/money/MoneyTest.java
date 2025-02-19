package pl.edu.pw.ii.pte.junit.money;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testSimpleAdd() {
		Money m12CHF = new Money(12, "CHF"); //
		Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(25, "CHF");
		Money result = m12CHF.add(m14CHF); //
	}
	@Test
	public void testEquals() {
		Money m12CHF = new Money(12, "CHF");
		Money m14CHF = new Money(14, "CHF");

		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
		}
	
	@Test
	public void testMultiply() {
		Money m2PLZ= new Money(2, "PLZ");
		int x = 4;
		Money expected= new Money(8, "PLZ");
		Money result = m2PLZ.multiply(x);
		assertTrue (expected.equals(result));

		
	}
	@Test
	public void testaddPlzToPlzIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m13PLZ = new Money(13, "PLZ");
		Money expected = new Money(25, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m13PLZ);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddPlzToPlzIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m13PLZ = new Money(12, "PLZ");
		Money expected = new Money(50, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m13PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddPlzToPlzIsFalse1(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m13PLZ = new Money(13, "USD");
		Money expected = new Money(25, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m13PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddPlzToUsdIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(36, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12USD);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddPlzToUsdIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(50, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12USD);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddPlzToChkIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(48, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12CHK);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddPlzToChkIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(50, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12CHK);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddPlzToGbpIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(72, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12GBP);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddPlzToGbpIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(50, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12GBP);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddPlzToEurIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(60, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12EUR);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddPlzToEurIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(50, "PLZ");
		Money result = m12PLZ.addDiffrentCurrency(m12EUR);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddEurToPlzIsTrue(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(15, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12PLZ);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddEurToPlzIsFalse(){
		Money m12PLZ = new Money(12, "PLZ");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(50, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddEurToChkIsTrue(){
		Money m12EUR = new Money(12, "EUR");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(21, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12CHK);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddEurToChkIsFalse(){
		Money m12EUR = new Money(12, "EUR");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(50, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12CHK);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddEurToGbpIsTrue(){
		Money m12EUR = new Money(12, "EUR");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(27, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12GBP);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddEurToGbpIsFalse(){
		Money m12EUR = new Money(12, "EUR");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(50, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12GBP);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddEurToUsdIsTrue(){
		Money m12EUR = new Money(12, "EUR");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(18, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12USD);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddEurToUsdIsFalse(){
		Money m12EUR = new Money(12, "EUR");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(50, "EUR");
		Money result = m12EUR.addDiffrentCurrency(m12USD);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddUsdToPlzIsTrue(){
		Money m12USD = new Money(12, "USD");
		Money m12PLZ = new Money(12, "PLZ");
		Money expected = new Money(18, "USD");
		Money result = m12USD.addDiffrentCurrency(m12PLZ);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddUsdToPlzIsFalse(){
		Money m12USD = new Money(12, "USD");
		Money m12PLZ = new Money(12, "PLZ");
		Money expected = new Money(50, "USD");
		Money result = m12USD.addDiffrentCurrency(m12PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddUsdToChkIsTrue(){
		Money m12USD = new Money(12, "USD");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(30, "USD");
		Money result = m12USD.addDiffrentCurrency(m12CHK);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddUsdToChkIsFalse(){
		Money m12USD = new Money(12, "USD");
		Money m12CHK = new Money(12, "CHK");
		Money expected = new Money(50, "USD");
		Money result = m12USD.addDiffrentCurrency(m12CHK);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddUsdToGbpIsTrue(){
		Money m12USD = new Money(12, "USD");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(42, "USD");
		Money result = m12USD.addDiffrentCurrency(m12GBP);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddUsdToGbpIsFalse(){
		Money m12USD = new Money(12, "USD");
		Money m12GBP = new Money(12, "GPB");
		Money expected = new Money(50, "USD");
		Money result = m12USD.addDiffrentCurrency(m12GBP);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddUsdToEurIsTrue(){
		Money m12USD = new Money(12, "USD");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(36, "USD");
		Money result = m12USD.addDiffrentCurrency(m12EUR);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddUsdToEurIsFalse(){
		Money m12USD = new Money(12, "USD");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(50, "USD");
		Money result = m12USD.addDiffrentCurrency(m12EUR);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddChkToPlzIsTrue(){
		Money m12CHK = new Money(12, "CHK");
		Money m12PLZ = new Money(12, "PLZ");
		Money expected = new Money(16, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12PLZ);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddChkToPlzIsFalse(){
		Money m12CHK = new Money(12, "CHK");
		Money m12PLZ = new Money(12, "PLZ");
		Money expected = new Money(50, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddChkToUsdIsTrue(){
		Money m12CHK = new Money(12, "CHK");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(20, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12USD);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddChkToUsdIsFalse(){
		Money m12CHK = new Money(12, "CHK");
		Money m12USD = new Money(12, "USD");
		Money expected = new Money(50, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12USD);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddChkToGbpIsTrue(){
		Money m12CHK = new Money(12, "CHK");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(32, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12GBP);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddChkToGbpIsFalse(){
		Money m12CHK = new Money(12, "CHK");
		Money m12GBP = new Money(12, "GBP");
		Money expected = new Money(50, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12GBP);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddChkToEurIsTrue(){
		Money m12CHK = new Money(12, "CHK");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(28, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12EUR);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddChkToEurIsFalse(){
		Money m12CHK = new Money(12, "CHK");
		Money m12EUR = new Money(12, "EUR");
		Money expected = new Money(50, "CHK");
		Money result = m12CHK.addDiffrentCurrency(m12EUR);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddGbpToPlzIsTrue(){
		Money m12GBP = new Money(12, "GBP");
		Money m10PLZ = new Money(10, "PLZ");
		Money expected = new Money(14, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10PLZ);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddGbpToPlzIsFalse(){
		Money m12GBP = new Money(12, "GBP");
		Money m10PLZ = new Money(10, "PLZ");
		Money expected = new Money(50, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10PLZ);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddGbpToChkIsTrue(){
		Money m12GBP = new Money(12, "GBP");
		Money m10CHK = new Money(10, "CHK");
		Money expected = new Money(18, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10CHK);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddGbpToChkIsFalse(){
		Money m12GBP = new Money(12, "GBP");
		Money m10CHK = new Money(10, "CHK");
		Money expected = new Money(50, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10CHK);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddGbpToUsdIsTrue(){
		Money m12GBP = new Money(12, "GBP");
		Money m10USD = new Money(10, "USD");
		Money expected = new Money(16, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10USD);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddGbpToUsdIsFalse(){
		Money m12GBP = new Money(12, "GBP");
		Money m10USD = new Money(10, "USD");
		Money expected = new Money(50, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10USD);
		assertFalse(expected.equals(result));
	}
	@Test
	public void testaddGbpToEurIsTrue(){
		Money m12GBP = new Money(12, "GBP");
		Money m10EUR = new Money(10, "EUR");
		Money expected = new Money(20, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10EUR);
		assertTrue(expected.equals(result));
	}
	@Test
	public void testaddGbpToEurIsFalse(){
		Money m12GBP = new Money(12, "GBP");
		Money m10EUR = new Money(10, "EUR");
		Money expected = new Money(50, "GBP");
		Money result = m12GBP.addDiffrentCurrency(m10EUR);
		assertFalse(expected.equals(result));
	}
}
