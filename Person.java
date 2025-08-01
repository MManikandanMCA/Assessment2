package Assessment1;

public class Person {
	String name;  
    int age;
    //constructor with name only with default age
	public Person(String name) {   
		this.name=name;
		this.age=18;
	}
	//constructor with 2 arguments name and age
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	// method for print 
	public void  display() {
		System.out.println("Name is " +name);
		System.out.println("Age is "+age);
	}
	public static  void main(String args[]) {
		Person obj1=new Person("Manikandan");  //create a object1 with pass a parameter
		Person obj2= new Person("Manikandan" , 25);  //create a object2 with pass a 2 parameter
		obj1.display();  //call a display method
		obj2.display();
}
}