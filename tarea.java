public class Area{
    public static void main(String args[]){
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=Addition(a,b);
        int divByTwo=division(sum);
        int result=multiply(divByTwo);
        System.out.println("The Area of the Trapezoid is:",+ result);
    }
}