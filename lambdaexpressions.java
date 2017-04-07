interface Number{  
    public void num();  
}  
public class LambdaExpression{  
    public static void main(String[] args) {  
        int a=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Number d=new Number(){  
            public void draw(){System.out.println("Number "+a);}  
        };  
        a.num();  
    }  
}  
