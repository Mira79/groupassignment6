class Shaped{
		 public void shape(){
		        System.out.println("This is a shape!");
		    }
	}
class Rectangle extends Shaped{
	 public void rectangular(){
         System.out.println("This is rectangle! ");
     }
}
class Circular extends Shaped{
	 public void circle(){
		 System.out.println("This is circular! ");
     }
}
class Square extends Rectangle{
    public  void square(){
        System.out.println("Square is a rectangle");
    }
}

/*interface pen{//using interface
	void write();
	void fill();
}
interface pencil{
	void write();
	void sharpen();
}
class Student implements pen,pencil{
	
	public void displayStudent() {
		System.out.println("Student is writing ");
		
	}
	public void sharpen() {
		//System.out.println("This is sharpen method! ");
		
	}
	public void write() {
		//System.out.println("This is write method! ");
		
	}
	public void fill() {
		//System.out.println("This is fill method! ");
		
	}
}*/
public class Q_2 {
	
	public static void main(String[] args) {
		
		/*Student st=new Student();
		st.displayStudent();
		st.write();
		st.fill();
		st.sharpen();*/
		
		 Square sq = new Square();
          sq.shape();
          sq.rectangular();
	}

}
