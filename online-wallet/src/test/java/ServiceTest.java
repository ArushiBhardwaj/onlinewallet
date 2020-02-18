
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.capgemini.onlinewallet.exception.*;
import org.junit.Test;

import com.capgemini.onlinewallet.dao.Connection;
import com.capgemini.onlinewallet.dao.SaveRegisterUserData;
import com.capgemini.onlinewallet.service.AddAmountValidation;
import com.capgemini.onlinewallet.service.ShowBalanceValidation;
import com.capgemini.onlinewallet.service.Transaction;
import com.capgemini.onlinewallet.service.UserDataValidation;

public class ServiceTest {
		//Test cases for RegisterUser Module
	//Test cases for Service package
		@Test
	public void checkIdEntryTest()
	{
		assertEquals(true,new Connection().checkIDEntry(111003));
	}
	@Test
	public void checkIdEntryTest1()
	{
		assertEquals(false,new Connection().checkIDEntry(111005));

	}
	@Test
	public void checkLoginIdEntryTest()
	{
		assertEquals(true,new Connection().checkLoginEntry("walletarushi"));
	}
	@Test
	public void checkLoginIdEntryTest1()
	{
		assertEquals(false,new Connection().checkLoginEntry("wallet"));
	}
    @Test
    public void deductAmountTest()
    {
    	//assertEquals(new Double(),new Connection().deductAmount(111002,200.0));
    }
    @Test
    public void checkBalanceTest()
    {
    	assertEquals(false,new Connection().checkBalance(111003,2000.0));
    }
    @Test
    
    	public void checkNullTest()
    {
    		assertThrows(NullValueException.class,()->{new UserDataValidation().checkNull(null);});
    	}
    @Test
    public void checkNumberTest()
    {
    	assertThrows(ValidationException.class,()->{new UserDataValidation().checkNumber("12345678");});
    	
    	
    }
    @Test
    public void checkNumberTest1()
    {
    	//assertEquals(true,new UserDataValidation().checkNumber("1234567890"));

    }
    	@Test
    	public void checkPasswordTest()
    	{
    		assertThrows(ValidationException.class,()->{new UserDataValidation().checkNumber("1234");});
    		
    	}
    	@Test
    	public void checkPasswordTest1()
    	{
    		//assertEquals(true,new UserDataValidation().checkPassword("1234567"));
    	}
    	@Test
    	public void checkAmountTest()
    	{
    		assertEquals(true,new Transaction().checkAmount(2000.0));
    	}
    	@Test
    	public void checkAmountTest1()
    	{
    		assertEquals(false,new Transaction().checkAmount(0.0));
    	}
    	
    	
    
    
}
