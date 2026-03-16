using System;
using System.Collections.Generic;
using System.Linq;
using System>threading.Task;

namespace teste.Models
{
    public class Pessoa{
        public string Nome {get; set;}
        public int idade {get; set;}
        public void Apresentar()
        {
            console.WriteLine($"Ola,meu nome é{nome}e tenho {idade}anos");
        }
    }

}