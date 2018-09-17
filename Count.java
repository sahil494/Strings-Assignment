import java.util.Scanner;
class Count{
  public static void main(String[] args){
    int i,count=1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter string");
    String str=s.nextLine();
    for (i=0;i<str.length();i++)
    {
      if (str.charAt(i)==' ')
      {
        count++;
      }
    }
    System.out.println("Total no. of words:- "+count);
  }
}