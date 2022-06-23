import java.util.Scanner;
public Switchcase
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int a,b,n;
   System.out.println("enter any case");
    n=sc.nextInt();
   
   switch(n)
   {
       case 1:
       {
           System.out.println("Enter the two number");
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println("addition="+(a+b));
           break;
       }
   
          case 2:
       {
           System.out.println("Enter the two number");
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println("substraction="+(a-b));
           break;
       }
       
         case 3:
       {
           System.out.println("Enter the two number");
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println("multiplication="+(a*b));
           break;
       }
         case 4:
       {
           System.out.println("Enter the two number");
           a=sc.nextInt();
           b=sc.nextInt();
           System.out.println("division="+(a/b));
           break;
       }
         default:
         {
             System.out.println("please enter the valid input");
             break;
         }
     }
   }
}