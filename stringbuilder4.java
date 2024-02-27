import java.util.*;
public class stringbuilder4{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
StringBuilder sb=new StringBuilder(str);
int i;
int n=sb.length();
for(i=0;i<sb.length();i++) {
if(sb.charAt(i)=='@'){
sb.delete(i,n);
break;
}
}
System.out.println(sb);
}
}

