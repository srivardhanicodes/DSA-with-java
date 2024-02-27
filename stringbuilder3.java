import java.util.*;
public class stringbuilder3{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuilder sb=new StringBuilder(str);
int i;
int n=sb.length();
for(i=0;i<n;i++)
{
if(sb.charAt(i)=='i'){
sb.setCharAt(i,'o');
}
}
System.out.println(sb);
}
}
