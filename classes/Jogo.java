package classes;

import java.util.Scanner;

public class Jogo  {
    //Fazer o jogador colocar o nome dele completo (ok) e transformar isso em um ícone para representar ele na arena (ok)
    //Ícone = inicial do nome dele (ok)
    //Para fazer os inimigos vamos precisar de herança -> extends etc
        Jogador jogador = new Jogador();
       
    public void menu(){
        Scanner sca = new Scanner(System.in);
        Scanner sca1 = new Scanner(System.in);
        //limpaTela();
        //nome 
        System.out.println("Bem-vindo(a)!");
        System.out.println("Está preparado(a) para uma experiência nova? Antes de tudo... informe seu nome completo:");

        this.jogador.nome = sca.nextLine();
        char icone = this.jogador.nome.charAt(0);
        limpaTela();

        System.out.println("Ótimo, " + this.jogador.nome + ". Precisamos de mais algumas coisas.");
        System.out.println("Ah! E Sua representação na arena vai ser: " + icone);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Escolha em que classe deseja jogar:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Assassino");
        System.out.println("------------------------------------------------------------------");
        //this.jogador.escolha = sca1.nextInt();

    
        
    }

    public void limpaTela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
