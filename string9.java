import java.util.*;
public class string9{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String []a=new String[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextLine();
}
int len=0;
for(i=0;i<n;i++)
{
len+=a[i].length();
}
System.out.println(len);
}
}
