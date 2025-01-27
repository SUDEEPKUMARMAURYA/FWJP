import java.util.Scanner;
class Mark
{

  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);

    int getMark=sc.nextInt();
    int totalMark=sc.nextInt();
    double result=(getMark*100/totalMark);
    System.out.println(result)  ; 
  
}
}