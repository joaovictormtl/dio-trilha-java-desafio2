import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro parâmetro: ");
        int parametroUm = input.nextInt();

        System.out.print("Informe o segundo parâmetro: ");
        int parametroDois = input.nextInt();
        
        try{
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e){
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
        input.close();
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
