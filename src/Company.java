
public class Company extends RegisterTemplate{          // company extending with register template.

    int id;
    String name;                // local variables.
    
    public Company(int id, String name)         // constructor
    {
        this.id = id;           // inetializing
        this.name = name;
    }
    
    void id()           // setting id methd
    {
        this.companyId = id;
    }
    void name()
    {                   // setting name method.
        this.companyName = name+companyId;
    }    
    
    void remainingDetails()         // setting remaining details.
    {
       this.companyShares = (int)(Math.random()*((1000-500)+1))+500;            // applied formulas for company shares.
       int precision = 100; // 2 decimals    
       this.companySharePrice = Math.floor(Math.random() * (100 * precision - 10 * precision) + 1 * precision) / (1*precision);     // applying formulas for calculating share price.
    }
    
}
