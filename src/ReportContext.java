
public class ReportContext {
    
   private ReportStrategy reportStrategy;               // creating private variable of strategy.

   public ReportContext(ReportStrategy reportStrategy){         // class constructor for strategy context.
      this.reportStrategy = reportStrategy;                 // assigning the data.
   }

   public int executeStrategy(){                        // executing strategy methos which return state.
      return reportStrategy.execute();
   } 
   
}
