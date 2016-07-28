package solid.isp.segregated;

public class DepositUI extends UI implements DepositTransaction {

	@Override
	public void depositTransaction() {
		System.out.println(getClass().getSimpleName() + 
		                   ": Deposit transaction complete!");
	}

}
