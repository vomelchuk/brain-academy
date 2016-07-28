package solid.isp.not_segregated;

public abstract class UI implements Transaction {
	
	@Override
	public void depositTransaction() {
		System.out.println(getClass().getSimpleName() + 
				           ": Deposit transaction complete!");
	}

	@Override
	public void withdrawlTransaction() {
		System.out.println(getClass().getSimpleName() + 
		                   ": Withdrawl transaction complete!");
	}

	@Override
	public void transferTransaction() {
		System.out.println(getClass().getSimpleName() + 
		                   ": Trasfer transaction complete!");
	}
}
