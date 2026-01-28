/*
  Author: Emilio Tuosto
*/

public class StaffMember{

    public static final int threshold = 100;

    private String memberName;
    private int    yearsOfService;
    private int    credit;
    private double salary;

    StaffMember(String name, int ys, int initialcredit){
	memberName = name;
	yearsOfService = ys;
	credit = initialcredit;
	salary = yearsOfService*200 + 1000.00;
	
    }

    public String getName(){ return memberName; }

    public double getSalary(){ return salary; }

    public boolean getPromotion(){
	/*
           A promotion is granted only if the member
	   1. has been working for more than one year and
	   2. has enough credits with respect to her/his years of service
        */
	boolean flag = yearsOfService > 0
	    && credit > threshold * yearsOfService;
	if(flag)
	    salary = salary + credit * .5;
	return flag;
    }

    public void addCredit(int c){ credit += c; }

    public void subCredit(int c){ credit -= c; }

    public double getSalay(){ return salary; }
}
