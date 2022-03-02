
  
interface Drawable{  
    public void draw();  
}  
public class LambdaExpression {  
    public static void main(String[] args) {  
        int width=15;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  