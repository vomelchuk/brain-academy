package solid.isp;

/*
 *     The Interface Segregation Principle - means that interfaces can be 
 * segregated into abstract base classes that break the unwanted coupling 
 * between clients. 
 */
public class InterfaceSegregationPrincipleMain {

	public static void main(String[] args) {
		notSegregatedDemo();
		//segregatedDemo();
	}
	
	/* Not native implemented by abstract class methods are allowed for derived
	 * classes */
	private static void notSegregatedDemo() {
		solid.isp.not_segregated.UI depositUI = 
                new solid.isp.not_segregated.DepositUI();
		((solid.isp.not_segregated.DepositUI) depositUI).transferTransaction();
		
		solid.isp.not_segregated.UI withdrawlUI = 
                new solid.isp.not_segregated.WithdrawlUI();
		((solid.isp.not_segregated.WithdrawlUI) withdrawlUI).depositTransaction();
		
		solid.isp.not_segregated.UI trasferUI = 
                new solid.isp.not_segregated.TransferUI();
		((solid.isp.not_segregated.TransferUI) trasferUI).withdrawlTransaction();
	}
	
	/* Segregated to abstract classes interface methods isolates not its native 
	 * methods for their derived classes */
	private static void segregatedDemo() {
		solid.isp.segregated.UI depositUI = 
				                           new solid.isp.segregated.DepositUI();
		((solid.isp.segregated.DepositUI) depositUI).depositTransaction();
		
		solid.isp.segregated.UI withdrawlUI = 
				                         new solid.isp.segregated.WithdrawlUI();
		((solid.isp.segregated.WithdrawlUI) withdrawlUI).withdrawlTransaction();
		
		solid.isp.segregated.UI trasferUI = 
				                          new solid.isp.segregated.TransferUI();
		((solid.isp.segregated.TransferUI) trasferUI).transferTransaction();
	}
}
