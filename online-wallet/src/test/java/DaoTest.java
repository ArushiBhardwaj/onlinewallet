import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.onlinewallet.dao.SaveRegisterUserData;
import com.capgemini.onlinewallet.service.AddAmountValidation;
import com.capgemini.onlinewallet.service.ShowBalanceValidation;

public class DaoTest {
	//Test cases of SaveRegisterUserData class
	ShowBalanceValidation obj=new ShowBalanceValidation();
	AddAmountValidation obj1=new AddAmountValidation();
	@Test
	public void validateLoginName()
	{
		assertEquals(true,new SaveRegisterUserData().validateLoginName("walletarushi"));
		
	}
	@Test
	public void validateLoginNameTest()
	{
		assertEquals(false,new SaveRegisterUserData().validateLoginName("wallet"));
	}
	@Test
	public void saveUserData()
	{
		assertEquals(true,new SaveRegisterUserData().saveUserData("Arushi", "1234", "Arushi1234", "8728925856"));
	}
	//Test cases of Connection class
	/*@Test
	public void showBalanceTest()
	{
		double d=obj.showBalance(111002);
		assertEquals(0.0,d);
	}
	@Test
	public void addAmountTest()
	{
		double d1=obj1.addAmount(111001, 20000.0);
		assertEquals(20000.0,d1);
	}*/


}
