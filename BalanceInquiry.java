import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BalanceInquiry extends Transaction
{
   
   public BalanceInquiry(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase)
   {
      super(userAccountNumber, atmScreen, atmBankDatabase);
   } 


   @Override
   public void execute()
   {
      
      BankDatabase bankDatabase = getBankDatabase();
      Screen screen = getScreen();

            double availableBalance = 
         bankDatabase.getAvailableBalance(getAccountNumber());

      
      double totalBalance = 
         bankDatabase.getTotalBalance(getAccountNumber());
      
      
      
      
      screen.creatBalanceGUI();
      screen.messageJLabel2.setText("Avaliable Balance: " + availableBalance);
      screen.messageJLabel3.setText("Total Balance: " + totalBalance);
      screen.Mainframe.revalidate();
      
   } 
   
  
}