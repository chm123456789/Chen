package aer;

import java.util.function.Consumer;


class Apple
 {
	 String color;
	 int weight;
	 public Apple(String color,int weight)
	 {
		 super();
		 this.color=color;
		 this.weight=weight;
	 }
	 public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
		 
	 }
 }
public class NewCharacter {
      public static void ConsumerApple(Apple[] apps,Consumer<Apple> c)
      {
    	  for(@SuppressWarnings("unused") Apple app:apps)
    	  {
    		  c.accept(app);
    	  }
      }
      @SuppressWarnings("unused")
	public static void main(String[] args)
      {
    	  
		  Apple app1=new Apple("红色",1);
    	  Apple app2=new Apple("绿色",2);
    	  Apple app3=new Apple("粉色",3);
    	  Apple[] Apples= {app1,app2,app3};
          System.out.println("lambda表达式");
          ConsumerApple(Apples, apple ->{
        					System.out.println(apple.toString());
        	  			});
		
      }
      
}