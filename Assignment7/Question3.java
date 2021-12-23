package Assignment;




	
	import static java.lang.annotation.ElementType.METHOD;
	import static java.lang.annotation.RetentionPolicy.RUNTIME;
	import java.lang.annotation.Retention;
	import java.lang.annotation.Target;@Retention(RUNTIME)

 @Target(METHOD)

 @interface Test{}
   public class Question3{
	public void display() {
	System.out.println("Tes display( )");
	}
	public static void main(String[] args) {
	Question3 obj = new Question3();
	obj.display();
	}

}

