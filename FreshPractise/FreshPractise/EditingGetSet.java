package FreshPractise;

public class EditingGetSet {

	private int EmpID;
	private String EmpName;
	private char Grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap();
	}
	public int getid(){
		return EmpID;
	}
	public String getName(){
		return EmpName;
	}
	public char getgrade(){
		return Grade;
	}
	public void setid(int newId ){
		newId = EmpID;
	}
	public void setName(String newName){
		newName = EmpName;
	}
	public void setGrade(char NewGrade){
		NewGrade = Grade;
	}
	
	public static void encap(){
		EditingGetSet obj = new EditingGetSet();
		
		obj.setGrade('A');
		obj.setid(1124);
		obj.setName("Mohan S");
		
		System.out.println(obj.EmpName+ "with ID "+obj.EmpID);
	}
}
