class Employee<T>
{
	T Ename;
	int Id;

	public int getId() {
		return Id;
	}
	public void set(int id,T ename) {
		Id = id;
		Ename = ename;

	}
	public void show() {
	     System.out.println(Id+" "+ Ename);

	}
	
public class GenericExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee<String >obj=new Employee<String>();
     obj.set(105,"Shahzad");
     obj.show();
	}

}
}
