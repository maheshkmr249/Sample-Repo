package Sample_Programs;

public class ReversANumber {

public static void main(String[] args) {

int num = 111;
int org_num=num;
int rev=0;

while(num>0)
{
rev = rev*10+num%10;
num = num/10;
}
System.out.println("Reverse of a no is "+rev);

if(org_num == rev)
{
System.out.println("Given no is palindrome");	
}
else
{
System.out.println("Given no is not a palindrome");
}
}
}
