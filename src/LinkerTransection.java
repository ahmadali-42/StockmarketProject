
public class LinkerTransection{         // creating all the transections
     
    public void buyShare(int investorId, int companyId, Linker linker)     // buyShare methos containing
    {
        
      for(int investor=0;investor<linker.investorList.size();investor++)        // looping investors
      {
           if(investorId == linker.investorList.get(investor).investorId)       // checking company
           {
              for(int company=0;company<linker.companyList.size();company++)    // loping comapy
               {
                 if(companyId == linker.companyList.get(company).companyId)     // checking 
                   { 
                    
                   if(linker.companyList.get(company).companyShares >= 1)
                     {
                        
                         if(linker.investorList.get(investor).investorBudget >= linker.companyList.get(company).companySharePrice) // comparing budget and other details
                         {
                             linker.investorList.get(investor).investorBudget = Double.parseDouble(linker.round.format(linker.investorList.get(investor).investorBudget - linker.companyList.get(company).companySharePrice));
                             
                             if(linker.companyShareSold.get(companyId)!=null)
                             {
                                 linker.companyShareSold.replace(companyId, linker.companyShareSold.get(companyId)+1);
                             }
                             else
                             {
                                 linker.companyShareSold.put(companyId, 1);
                             }
                             
                             if(linker.investorShares.get(investorId)!=null)
                             {
                                 linker.investorShares.replace(investorId, linker.investorShares.get(investorId)+1);
                             }
                             else
                             {
                                 linker.investorShares.put(investorId, 1);
                             }                             
                             
                             linker.companyList.get(company).companyShares = linker.companyList.get(company).companyShares - 1;
                         
                             if(linker.companyShareSold.get(companyId)!=null)
                             {
                                    if(linker.companyShareSold.get(companyId) == 10)
                                    {
                                         linker.companyList.get(company).companySharePrice *=2;
                                         
                                         linker.companyShareSold.replace(companyId, 0);

                                    }
                             }
                             
                             linker.sharesSold++;
                             sharePriceDeduction(linker);
                             
                             break;        
                             
                         }
                         else
                         {
                             linker.redBudget = true;
                         }
                     }
                     else
                     {
                         
                     }
                    
                }

                }    
           }
           
      }
      
    }
    
    public void sharePriceDeduction(Linker linker)
    {
        if(linker.sharesSold%10 == 0)
        {
            linker.sharePriceDeduction = true;
            for(int i=0;i<linker.companyList.size();i++)
            {
                if(!linker.companyShareSold.containsKey(linker.companyList.get(i).companyId))
                {  
                    linker.companyList.get(i).companySharePrice = Double.parseDouble(linker.round.format(linker.companyList.get(i).companySharePrice - (linker.companyList.get(i).companySharePrice*2)/100));
                }
            }
            
            linker.sharesSold = 0;
        }
    }
    
}

