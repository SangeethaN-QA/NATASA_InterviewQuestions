package javaInterviewQuestions.com;

public class ParametersClassMethod {
	
	public void passStudentName(String name,String age)
	{
		System.out.println("-- passStudentName --- '"+name+"'  and '"+age+"' ");
	}
	
	public int getStudentMarks(int tamilMark,int sciencemark)
	{
		//System.out.rintln("-- getStudentMarks --- '"+tamilMark+"'  and '"+tamilMark+"' ");
		if(tamilMark>90 )
		{
			System.out.println("---tamlMark--- " +tamilMark);
			return tamilMark;
		}else if(sciencemark>95)
		{
			System.out.println("---sciencemark--- " +sciencemark);
			return sciencemark;
		}else {
			System.out.println("no mark matched for conditions");
		}
		
		System.out.println("--both marks---'"+tamilMark+"' and '"+sciencemark+"' ");
		return sciencemark;
		
	}
	
	public static void main(String[] args) {
		ParametersClassMethod para = new ParametersClassMethod();
		para.passStudentName("natasatech", "23");
		para.getStudentMarks(80, 99);
		
		
	}

}
