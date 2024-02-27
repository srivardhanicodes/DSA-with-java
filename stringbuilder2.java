import java.util.*;
public class stringbuilder2{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuilder sb=new StringBuilder(str);
int i;
int n=sb.length();
for(i=0;i<sb.length()/2;i++)
{ 
int first=i;
int last=n-1-i;
char fir=sb.charAt(first);
char las=sb.charAt(last);
sb.setCharAt(last,fir);
sb.setCharAt(first,las);
}
System.out.println(sb);
}
}

