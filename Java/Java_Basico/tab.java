import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Favor Insira um numero");
    int num = Integer.parseInt(br.readLine());
    System.out.println("Tabuada do"+num+":");
    for(int i =0; i<=10; i++){
        System.out.println(num + " x " + i + " = " + (num * i));
    }
    }
}
