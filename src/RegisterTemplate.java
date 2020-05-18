
public abstract class RegisterTemplate{
  
    int companyId;
    String companyName;             // variable that use in all extended templates.
    int companyShares;
    double companySharePrice;
    int investorId;
    String investorName;
    double investorBudget;
    
    abstract void id();         // abstract methods whick must implement on interface child classes.
    abstract void name();
    abstract void remainingDetails();
  
   public final void register(){
       
      id();
      name();                           // calling strategy methods.
      remainingDetails();

   }
   
}
