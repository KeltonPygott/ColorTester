import java.util.Scanner;
import java.util.Random;
class Color 
{
  int r;
  int g;
  int b;

     public static void main(String args[]);   
{
     Color obj  = new Color();
     Scanner sc = new Scanner(System.in);
     while(true){ 
            
           System.out.println("To change value, enter V");
           System.out.println("To get random values, enter R");
           System.out.println("To close, enter E")
  
           obj.response=sc.nextLine();

       if (obj.response.equalsIgnoreCase("V"));
           {
           // r
           System.out.println("Change Red.");
           obj.r = sc.nextInt();
           }
           while (obj.r <0 || obj.r >255)
           {
           System.out.println("Input valid values");
           obj.g=sc.nextInt();
           }

           // g 

           System.out.println("Change Green.");
           obj.g = sc.nextInt();
           }
           while (obj.g <0 || obj.g >255)
           {
           System.out.println("Input valid values");
           obj.g=sc.nextInt();
           }

           // b 
 
           System.out.println("Change Blue.");
           obj.b = sc.nextInt();
           }
           while (obj.b <0 || obj.b >255)
           {
           System.out.println("Input valid values");
           obj.b=sc.nextInt();
           }

           System.out.println("Color = " + "(" + obj.r + ","+ obj.g + ","+ obj.b  + ")"); 

           if(obj.response.equalsIgnoreCase("R"));
            {
                obj.randomColor();
            }
            if(obj.response.equalsIgnoreCase("E"));
            {
            	System.out.println("Closing Window, Goodbye.");
                System.exit(0);
            }   
            }     
         
// Base 

public void randomColor()
{ 
  Random rand1 = new Random();

  int max = 255;
  int min = 0 ;

        red = rand1.nextInt(max-min)+ min;   
        green= rand1.nextInt(max-min) + min;
        blue = rand1.nextInt(max-min) + min;
        System.out.println("Color = " + "[" + red + ","+ green + ","+ blue + "]"); 

} 





   



           




          
   
 
} 

}
