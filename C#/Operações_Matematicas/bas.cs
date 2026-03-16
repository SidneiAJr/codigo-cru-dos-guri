// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        Console.WriteLine ("=========");
        Console.WriteLine ("Digite um Numero");
        double a = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine ("Digite um Numero");
        double b = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine ("Digite um Numero");
        double c = Convert.ToDouble(Console.ReadLine());
        double res = b*b-4*a*c;
        if(res>0){
            double x1 =(-b+Math.Sqrt(res)/(2*a));
            double x2 =(-b+Math.Sqrt(res)/(2*a));
            Console.WriteLine($"As raizes são x1={x1}e x1={x2}");
        }else if(res == 0){
            double x = -b/(2*a);
            Console.WriteLine($"A raiz x={x}");
        }else{
            double parteReal = -b /(2*a);
            double parteImaginaria = Math.Sqrt(-res)/(2*a);
            Console.WriteLine($"As raizes sao complexas:x1 = {parteReal}+{parteImaginaria}i e x2 {parteReal}-{parteImaginaria}i");
        }
    }
}
