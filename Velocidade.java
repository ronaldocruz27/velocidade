package velocidade;

//importando a classe Scanner
import java.util.Scanner; 

public class Velocidade {

    
    public static void main(String[] args) {
       //instanciando e criando um objeto Scanner
        Scanner ler = new Scanner(System.in);
       
       int n;
       double p;//declaração da variável para apresentar o resultado do cálculo da multa
       
       System.out.printf("Informe a velocidade:\n");
       
       //entrada de dados, lendo um valor inteiro
       n = ler.nextInt();
       
       //expressão lógica para verificar se o condutor precisa ser multado
       if(n>80){
           // cálculo do valor da multa
           p=(n-80)*5;
           //resultado de saída se o condutor ultrapassar a velocidade permitida.
           System.out.println("Você foi multado!, o valor é R$"+p);
       }else{
           //resultado de saída se o condutor não ultrapassar a velocidade permitida.
           System.out.println("Parabéns!! Você está dirigindo bem");
           
       }
    }
    
}
