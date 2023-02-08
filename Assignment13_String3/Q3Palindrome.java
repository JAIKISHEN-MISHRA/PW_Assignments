public class Q3Palindrome {
    public static void main(String[] args)   
{  
int number = 2552, reverse = 0;  
int temp=number;
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse); 
if(temp==reverse)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome"); 
}  
}
