package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);

		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	/*@Test
	public void getBalance() 
	{
		GiftCard card = new GiftCard(1337,100.00);
		assertEquals("getBalance()", 100.00, card.getBalance(), 0.001);
	}*/
	
	@Test
	public void deduct() 
	{
		double amount = 52.97;
		GiftCard card = new GiftCard(1337,100.00);
		card.deduct(amount);
	}
}
