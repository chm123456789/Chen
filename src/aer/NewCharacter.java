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
      public static void main(String[] args)
      {
    	  
      }
      
}