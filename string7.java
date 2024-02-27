import java.util.*;
public class string7{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int len=str.length();
int i;
for(i=len-1;i>=0;i--)
{
System.out.print(str.charAt(i));
}
}
}