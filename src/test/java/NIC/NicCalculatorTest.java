/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NIC;

/**
 *
 * @author Nazick Ahamed
 */
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class NicCalculatorTest{
    NicCalculator NicCalculator;
    @BeforeClass
	public void setUp() {
		NicCalculator = new NicCalculator();
	}

	
}
