
package rpg.trials.of.apolo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
public class RPGTrialsOfApolo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */  
    
    
   
    public static void main(String[] args) throws IOException  {
        int opc=1;
        int cont=0;
           Scanner ler = new Scanner(System.in);
    
        System.out.println("Welcome to Game ");   
        System.out.println(" --> Trials of Apolo <-- ");
        System.out.println("\n");
        
         /* FileWriter arq = new FileWriter("d:\\historia.txt");
    PrintWriter gravarArq = new PrintWriter(arq);
         gravarArq.printf("Apolo um dos doze deuses do Olimpo está preso na forma mortal, "
                  "depois de decpcionar seu pai zeus que o puniu com o castigo de ser um "
                  "mero humano. Para que ele volte a ser novamente imortal ele precisa "
                  "realizar várias missões e derrotar vários monstros.");
         arq.close();
    } */
        System.out.println("Apolo um dos doze deuses do Olimpo está preso na forma mortal, \n"
                + "depois de decepcionar seu pai Zeus que o puniu com o castigo de ser um \n "
                + "mero humano. Para que ele volte a ser novamente imortal ele precisa \n "
                + "realizar várias missões e derrotar vários monstros. ");
        System.out.println("________________________________________________________");
        
        System.out.println("Escolha um ajudante para Apolo ");
        System.out.println(" |1 Heraclés|  ");
        System.out.println(" |2 Jasão|  ");
        System.out.println(" |3 Cirene| ");
        System.out.println(" |4 Filho de Hades|  ");
         opc = ler.nextInt();
        
        Ajudante a1 = new Ajudante ();
        a1.nome = "Heraclés";
        a1.hp=100;
        
        Ajudante a2 = new Ajudante ();
        a2.nome = "Jasão";
        a2.hp=100;
        
        Ajudante a3 = new Ajudante ();
        a3.nome ="Cirene ";
        a3.hp= 100; 
        
        Ajudante a4 = new  Ajudante ();
        a4.nome= "Filho de Hades";
        a4.hp=100; 
        
        
        Apolo  apolo = new Apolo ();
        apolo.hp = 100;
        
       
        
        Monstro karpoi = new Monstro ();
        karpoi.ataque=90;
        
        
        

         
        
      switch  ( opc ) { 
          
          case 1: { 
              System.out.println("Seu ajudante é o semideus irmão de Apolo,  "+a1.nome);  
              
              break;
          }
          
          
          case 2: {
          
             System.out.println("Seu ajudante é o semideus irmão de Apolo,  "+a2.nome); 
          break;
          
      }
              
          case 3: {
                 System.out.println("Seu ajudante é a caçadora mortal,  "+a3.nome); 
                 break;
          }
        
          case 4: {
                 System.out.println("Seu ajudante é um filho do submundo, ele é misterioso e é conhecido como,  "+a4.nome); 
                 break;
          }
          default : 
              System.out.println("Opção inválida escolha um ajudante pressionando seu número"); 
              
        
}
      switch ( cont) {
          case 0: 
         System.out.println("_____________________________________________________________________________________________"); 
            System.out.println("Pressione qualquer tecla para continuar \n"); 
          cont = ler.nextInt();
            if ( cont != 0) {
              
            
      } 
        System.out.println("Apolo caiu na terra e não sabe o que aconteceu com ele, \n "
                + "até que ele olha seu reflexo na água  e percebe que não está na  \n"
                + "sua forma imortal, quando ele percebe seu corpo todo machucado \n"
                + " e ensaguentado o que seria impossível pois deuses tem icor não sangue.\n "
                + "Desesperado ele parte em procura de ajuda, percebendo que está em  \n"
                + "uma floresta completamente desarmado nessa hora aparece alguns \n"
                + " karpois ( espíritos ) e ataca \n ");
        
   
        System.out.println("Estado de HP  "+apolo.ataquekarpoi() ); 
        System.out.println("___________________________________________________________________________");
        System.out.println(" o ajudante chega e salva Apolo derrotando os espíritos, ele estava na floresta caçando quando ouviu os gritos de dor. ");
              System.out.println("_____________________________________________________________________");
        System.out.println("Apolo está sendo levado incondciente para a cidade de Sparta.");
              System.out.println("\n");
        System.out.println("  (   Bem vindo a cidade de Sparta )       "); 
        
              System.out.println(" pressione qualquer tecla para acordar Apolo ");
         int acorda;
       acorda = ler.nextInt();
       if ( acorda != 0 ) {
           
           System.out.println("Apolo acorda e vê seu ajudate ao seu lado, pergunta quem é ele, depois de conversarem Apolo está preparado para seguir sua missão");
       }
        
              System.out.println(" (  Sua Primeira missão é achar uma arma, na floresta tem um ciclope  e pode roubar o  arsenal dele"
                      + "mas precisa matar ele primeiro  )           "); 
              
              System.out.println(" Consulte seu level e hp \n HP:  "+ apolo.VoltaHP() );
              System.out.println("lvl   "+apolo.Level());
}
   
        System.out.println("Seguindo para a floresta, encontre a casa do ciclope  ");
        System.out.println(" digite 1 para vasculhar a floresta  2 para desistir");
        int variaveldeprocura;
        variaveldeprocura=ler.nextInt();
        if (variaveldeprocura == 1 ) {
            System.out.println("Apolo e seu ajudante estão procurando a toca do mosntro");  
            
             /* if ( gerador.nextInt(7)= 7) {
                  System.out.println("Ainda procurando");
                
            }*/
                      
                
                System.out.println("Acharam a casa, estão entrando sem serem notados");
            
            
            
        } else {
            System.out.println(" >>>>>>>>>>>>>>Missão falhada<<<<<<<<<<<<<");
            System.out.println(" O CICLOPE OS ACHARAM PRIMEIRO  ");
            System.out.println(" BEM VINDOS AO TÁRTARO \n GAME OVER ");
        }
        
              
      
      
    
    } 
}
