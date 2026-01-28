public class Print extends Threads{

    private ReportLab report

    Print(ReportLab report){
	this.report = report;
    }
    

    public void run(){

	private String myname = Thread.currentThread().getName();
	if( report.Flag )
	    {
		report.setText(
			       report.getMember().getName()
			       + "\n   Your new salary is: " +
			       report.getMember().getSalary() + "£\n\n"
			       );
		report.print(myname);
	    }

	}
}
