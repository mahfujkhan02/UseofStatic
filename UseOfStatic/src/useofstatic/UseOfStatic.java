package useofstatic;

public class UseOfStatic 
{
    public UseOfStatic()
    {
        
    }
    
    public static class MyWorld
    {
        
    }
    
    private static int x = 10;
    
    static 
    {
       System.out.println("Hello World"); 
    }
    
    public static void hello()
    {
        System.out.println(x);        
    }
    
    public static void main(String[] args) 
    {
        UseOfStatic abc = new UseOfStatic();
        UseOfStatic xyz = new UseOfStatic();
        
        hello();
        
        abc.x = 12;
        System.out.println(abc.x);
        System.out.println(xyz.x);
        
        //abc.hello();
        //xyz.hello();
    }    
}