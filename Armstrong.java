public class Armstrong
{
 public static int computePower(int a, int l)
{
  int c=1;
  for(int i=0; i < l; i++)
   {
    c = c * a;
   }
   return c;
}
  public static void main(String args[])
  {
    int  n = 153;

    int temp = n;

    int output = 0;

    int length = 0;

    while(temp > 0)
     {
      temp = temp / 10;
      length++;
     }
  temp = n;
  while(temp>0)
   {
     output = output + computePower(temp%10,length);
     
     temp = temp / 10;
   }
   if(n==output)
      System.out.println("The given number is Arm Strong Number");
   else
      System.out.println("The given number is not an Arm Strong Number");

  }
}