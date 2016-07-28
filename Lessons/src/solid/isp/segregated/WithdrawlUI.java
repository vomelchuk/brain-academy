package solid.isp.segregated;

public class WithdrawlUI extends UI implements WithdrawlTransaction  {

	@Override
	public void withdrawlTransaction() {
		System.out.println(getClass().getSimpleName() + 
		                   ": Withdrawl transaction complete!");
	}

}
