import java.util.Scanner;


public class ContaTerminal {
      

    public static void main (String[]args) throws Exception{
        

        Scanner texto = new Scanner(System.in);
        
          
                 
        

                System.out.println("Digite o Número Da Sua Conta: ");
                //consultar numero da conta
                int numero = texto.nextInt();
                texto.nextLine(); // Consumir a quebra de linha
                 

                 
                System.out.println("Qual Número Da Sua Agencia?:");  
                //pedir numero da agencia
                String agencia = texto.nextLine();                 
                System.out.println("Numero Da Sua Agencia: " + agencia );
                 

                 
                System.out.println("Nós Informe Seu Nome:"); 
                //informar o nome do cliente               
                String cliente = texto.nextLine();                
                System.out.println("Bem-vindo: " + cliente );
                 

                 
                System.out.println("Digite o Saldo De Sua Conta:");  
                //saber o saldo da conta               
                double saldo = texto.nextDouble();                 
                System.out.println("O Saldo da sua conta é de: " + saldo );


                System.out.printf("Olá " + cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
                 
             


            texto.close();
                 
            

        
    }

    
    
    



}
