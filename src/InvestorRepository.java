
public class InvestorRepository implements IteratorContainer {          // Iterator design patter ninvestor repository details

   Linker investor;             // creating object variable.
   
   public InvestorRepository(Linker investor)           // constructor.
   {
       this.investor = investor;            // inetializing.
   }
   
   @Override
   public Iterator getIterator() {          // returning new object for investor list.
      return new InvestorListIterator();
   }

   private class InvestorListIterator implements Iterator {         // iterating investor list details,

      int index;            // creating new variable for indexing.

      @Override
      public boolean hasNext() {        // method to return index for the lists of investorz.
      
         if(index < investor.investorList.size()){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {        // iterating next to get appropriate investor.
      
         if(this.hasNext()){
            return investor.investorList.get(index++);          // returning investor.
         }
         return null;
      }		
   }
}