import java.util.*;
public class switchcase{
public static void main(String[] args)
{
System.out.println("enter number");
Scanner n=new Scanner(System.in);
int num=n.nextInt();
Switch(num) {
case 1:
System.out.println("hello");
break;
case 2:
System.out.println("namaste");
break;
case 3:
System.out.println("vanakam");
break;
default:
System.out.println("the number is invalid");
}
}
}

