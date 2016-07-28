package solid.isp.segregated;

public class TransferUI extends UI implements TransferTransaction  {

	@Override
	public void transferTransaction() {
		System.out.println(getClass().getSimpleName() + 
		           ": Trasfer transaction complete!");
	}

}
