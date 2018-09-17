import java.util.Scanner;
class RevString{
  public static void main(String[] args)
  {
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("enter string");
    String inp=s.nextLine();
    String out=" ";
    for (i=inp.length()-1;i>=0;i--)
    {
      out=out+inp.charAt(i);
    }
    System.out.println("Reverse string is:- "+out);
  }
}