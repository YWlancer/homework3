package tju.scs;

import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
    private PrintPrimes pp;
    
	public PrintPrimesTest() {
		
	}
    @Before
    public void setUp(){
    	 pp=new PrintPrimes();
    }
    @Test
    public void testPrintPrimes(){
         pp.printPrimes(5);
         pp.printPrimes(1);
         
        
    }
    
}
