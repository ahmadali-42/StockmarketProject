
public class CompanyRepository implements IteratorContainer{            // Iterator company repository.
    
   Linker company;          // object variable.
   
   public CompanyRepository(Linker company)         // constructor.
   {
       this.company = company;          // inetializing company variable.
   }
   
   @Override   
   public Iterator getIterator() {          // returning new list of iteration.
      return new CompanyListIterator();
   }

   private class CompanyListIterator implements Iterator {          // new class Listing iterator details.

      int index;            // creating index variabel for company indexing

      @Override
      public boolean hasNext() {            // has next method for checking next content
      
         if(index < company.companyList.size()){            // comaring with index
            return true;
         }
         return false;
      }

      @Override
      public Object next() {                // checking on next
      
         if(this.hasNext()){
            return company.companyList.get(index++);            // returnung company ist.
         }
         return null;
      }		
   }    
}
