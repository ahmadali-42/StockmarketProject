
import java.text.DecimalFormat;             // lists for decimal format.
import java.util.ArrayList;                 // list.
import java.util.HashMap;                   // hashmap

public class Linker {
    
    ArrayList<RegisterTemplate> investorList = new ArrayList<RegisterTemplate>();
    ArrayList<RegisterTemplate> companyList = new ArrayList<RegisterTemplate>();            // Memories for holding all temporary to Important transectional data.
    HashMap<Integer,Integer> companyShareSold = new HashMap<Integer,Integer>();
    HashMap<Integer,Integer> investorShares = new HashMap<Integer,Integer>();
    InvestorRepository investorRepository = new InvestorRepository(this);
    CompanyRepository companyRepository = new CompanyRepository(this);    
    DecimalFormat round = new DecimalFormat("0.00");                // creating object for decimal number formating.
    boolean redBudget = false;          // creating check for empty budget..
    boolean sharePriceDeduction = false;
    int sharesSold = 0; 
    int resultStrategy = 0;
    
    public void createRandomInvestors(int count)            // method for creating random investors as you like.
    {
        for(int i=0;i<count;i++)
        {
            RegisterTemplate investor = new Investor(i+1,"Investor-");      // registring template.
            investor.register();
            investorList.add(investor);             // adding to list..
        }
    }
    
    public void createRandomComapnies(int count)            // method fro creating random companies.
    {
        for(int i=0;i<count;i++)
        {
            RegisterTemplate company = new Company(i+1,"Company-");         //registring templete
            company.register();                                     
            companyList.add(company);                               // adding companies to list.
        }
        
    }

}
