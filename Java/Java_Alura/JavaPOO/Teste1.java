class Main {
    public static void main(String[] args) {
        Gerente Gerente1 = new Gerente("Pedro Antonio",20,4000);
        Estagiario estagiario1 = new Estagiario("Pedro Jr",17,1000);
        MenorAprendiz menoraprendiz = new MenorAprendiz("Gabriel Silva",14,500);
        CEO ceo = new CEO("Pedro Alcantara Junior",55,25000);
        estagiario1.VerificarSalario();
        menoraprendiz.VerificarSalario();
        ceo.VerificarSalario();
        Gerente1.VerificarSalario();
    }
}
interface Verificadora{
    void VerificarIdade();
    void VerificarSalario();
}

abstract class Pessoa{
    public String NomePessoa;
    public int IdadePessoa;
    public double Salario;

    Pessoa(String MomePessoa,int IdadePessoa,double Salario){
        this.NomePessoa = MomePessoa;
        this.IdadePessoa = IdadePessoa;
        this.Salario = Salario;
    }
}

class Gerente extends Pessoa{
    Gerente(String NomePessoa, int IdadePessoa,double Salario){
        super(NomePessoa,IdadePessoa,Salario);
    }
    public void VerificarSalario(){
        if(Salario>=4000){
            Salario-=0.27;
             System.out.printf("Salario ajustado: R$ %.2f | Nome: %s%n", Salario, NomePessoa);
        }else{
            System.out.println("Salario Sem desconto");
        }
    }
}

class Estagiario extends Pessoa{
    Estagiario(String NomePessoa, int IdadePessoa,double Salario){
         super(NomePessoa, IdadePessoa,Salario);
    }
    public void VerificarSalario(){
     if(Salario<=1000){
        Salario+=100;
         System.out.printf("Salario ajustado: R$ %.2f | Nome: %s%n", Salario, NomePessoa);
    }else{
        System.out.printf("Salario R$",Salario);
    }
    }
    
}

class MenorAprendiz extends Pessoa{
    MenorAprendiz(String NomePessoa, int IdadePessoa,double Salario){
        super(NomePessoa, IdadePessoa,Salario);
    }
    public void VerificarSalario(){
     if(Salario<=500){
        Salario+=70;
         System.out.printf("Salario ajustado: R$ %.2f | Nome: %s%n", Salario, NomePessoa);
    }else{
        System.out.printf("Salario R$",Salario);
    }
    }
}

class CEO extends Pessoa{
    CEO(String NomePessoa, int IdadePessoa,double Salario){
        super(NomePessoa, IdadePessoa,Salario);
    }
    public void VerificarSalario(){
     if(Salario<=50000){
        Salario+=1000;
         System.out.printf("Salario ajustado: R$ %.2f | Nome: %s%n", Salario, NomePessoa);
    }else{
        System.out.printf("Salario R$",Salario);
    }
    }
}
