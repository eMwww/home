/*
  Author: Emilio Tuosto
*/


public class Report{

    private String receiver;

    private String text;

	 Report(StaffMember s, String t) {
		  receiver = s.getName();
		  text = t + "\n   Your new salary is: " + s.getSalary() + "£\n\n";
    }

    public void print(String from){
		  System.out.println("From: " + from + "\n   Dear " + receiver + ",\n   " + text);
    }

}

