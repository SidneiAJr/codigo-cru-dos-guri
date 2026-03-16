using System;
namespace Teste
{
    class Program
    {
        static void Main()
        {
        int n1,n2;

        Console.Write("Digite A Primeira nota:");
        n1=Convert.ToInt16(Console.ReadLine());
        Console.Write("Digite A Segunda Nota:");
        n2=Convert.ToInt16(Console.ReadLine());
        var res = n1+n2;
        var res2 = n1>n2;
        var res3 = n2>n1;
        var res4 = n2=n1;
        var res5 = n2=n2;
        var res6 = n2<=n2;
        
        Console.WriteLine("A soma e:{0}",res);
        Console.WriteLine("A soma e:{0}",res2);
        Console.WriteLine("A soma e:{0}",res3);
        Console.WriteLine("A soma e:{0}",res4);
        Console.WriteLine("A soma e:{0}",res5);
        Console.WriteLine("A soma e:{0}",res6);
        
      

        }
        
    }
}
