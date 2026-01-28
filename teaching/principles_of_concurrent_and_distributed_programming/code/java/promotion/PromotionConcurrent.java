/*
  Author:  Emilio Tuosto
  WARNING: This program is *NOT* correct!  For instance, try to
           execute it by permuting the elements of the 'staff' array.
           Why are the executions different?  (Hint: first, figure out
           what the intended result should be...)
			  
			  Questions:
			  1. how many processes are created for execution of main?
			  2. how many threads are created during the whole execution of
           main?
			  3. how many threads at most are in execution at a time for main?
*/


public class PromotionConcurrent{

    static Report tmpReport;
    static boolean printFlag;

    static StaffMember staff[] = {
		  new StaffMember( "Lai Chang",     1,  150 ),
		  new StaffMember( "Arun Kumar",    1,  70  ),
		  new StaffMember( "John Smith",    0,  10  ),
		  new StaffMember( "Arun Surinder", 1,  70  ),
		  new StaffMember( "Guido Rossi",   3,  350 ),
		  new StaffMember( "Henning Woolf", 2,  180 )
    };

	 private static class Promotion implements Runnable{
		  // Where are the constructors?
		  public void run(){
				for(int i = 0 ; i < staff.length ; i++){
					 printFlag = staff[i].getPromotion();
					 if ( printFlag ){
						  tmpReport = new Report(staff[i], "you've got a promotion! Congraturations");
						  new Thread( new Print("printer") ).start();
					 }
				}
		  }
    }
	 
	 private static class Print implements Runnable{
		  private String myname = "";
		  public Print(String name){ myname = name; }
		  public Print(){ myname = Thread.currentThread().getName(); }
		  public String getName(){ return myname;	}
		  public void run(){
				if( printFlag )
					 tmpReport.print(getName());
		  }
    }


	 public static void main(String args[]){
		  // This is a costructor of Thread taking a Runnable and a string
		  Thread prt =  new Promotion()
		  Thread checkPromotion =  new Thread( prt, "promoting" );
		  checkPromotion.start();
    }
}
