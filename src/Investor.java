
public class Investor extends RegisterTemplate{     // extending from register tamplete

    int id;                 // local variables.
    String name;
    
    public Investor(int id, String name)            // constructor.
    {   
        this.id = id;                       // inetializing variable.s
        this.name = name;
    }

    void id()               // inetiating ID's
    {
        investorId = id;       
    }
    void name()         //  inetiating name for investor
    {
        this.investorName = name+investorId;
    }    
    
    void remainingDetails()         // adding up some remaining details unique.
    {
       int precision = 100; // 2 decimals
       this.investorBudget = Math.floor(Math.random() * (10000 * precision - 1000 * precision) + 1 * precision) / (1*precision); // random budget generation.
    }
    
}
