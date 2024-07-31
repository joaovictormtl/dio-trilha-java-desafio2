import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i < contagem; i++){
                System.out.println("Imprimindo o número "+(i+1));
            }
        }
    }
}
