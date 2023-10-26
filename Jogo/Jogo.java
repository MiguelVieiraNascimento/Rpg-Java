package Jogo;
import classes.Assassino;
import classes.Guerreiro;
import classes.Jogador;
import classes.Mago;

import java.util.Scanner;

public class Jogo  {
    //Fazer o jogador colocar o nome dele completo (ok) e transformar isso em um ícone para representar ele na arena (ok)
    //Ícone = inicial do nome dele (ok)
    //Para fazer os inimigos vamos precisar de herança -> extends etc
        Jogador jogador = new Jogador();
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();
        Assassino assassino = new Assassino();

        String mapa [][] = {
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"}};
   
     public void menu(){
        limpaTela();
        Scanner sca = new Scanner(System.in);
        Scanner sca1 = new Scanner(System.in);
        //limpaTela();
        //nome 
        System.out.println("Bem-vindo(a)!");
        System.out.println("Está preparado(a) para uma experiência nova? Antes de tudo... informe seu nome completo:");

        this.jogador.nome = sca.nextLine();
        char icone = this.jogador.nome.charAt(0);
        //String s = String.valueOf(icone);

        limpaTela();

        System.out.println("Ótimo, " + this.jogador.nome + ". Precisamos de mais algumas coisas.");
        System.out.println("Ah! E Sua representação na arena vai ser: " + icone);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Escolha em que classe deseja jogar:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Assassino");
        System.out.println("------------------------------------------------------------------");

        this.jogador.escolha = sca1.nextInt();

        if(this.jogador.escolha == 1){
            System.out.println("Status:");
           this.guerreiro.status();
           this.jogador.vida = this.guerreiro.vida;
           this.jogador.dano = this.guerreiro.dano;
           this.jogador.defesa = this.guerreiro.defesa;

           System.out.println("Vamos começar o jogo!");

        } if(this.jogador.escolha == 2){
            System.out.println("Status: ");
            this.mago.status();
            this.jogador.vida = this.mago.vida;
            this.jogador.dano = this.mago.dano;
            this.jogador.defesa = this.mago.defesa;

            System.out.println("Vamos começar o jogo!");

        } if(this.jogador.escolha == 3){
            System.out.println("Status:");
            this.assassino.status();
            this.jogador.vida = this.assassino.vida;
            this.jogador.dano = this.assassino.dano;
            this.jogador.defesa = this.assassino.defesa;

            System.out.println("Vamos começar o jogo!");
  
        } 

            andar();
    }

    public int Mapa(){
        
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){
                System.out.print(mapa[i][j]);

            }
            System.out.println();
        }
        
        return 0;
    }
    public int andar(){
                Scanner sca = new Scanner(System.in);

                System.out.println("Digite sua coordenada para jogar:");
                int  colunaY = sca.nextInt();
                int linhaX = sca.nextInt();


                mapa[linhaX][colunaY] = "[x]";
                
                for(int i = 0; i < mapa.length; i++){
                    for(int j = 0; j < mapa.length; j++){
                System.out.print(mapa[i][j]);

            }
                 System.out.println();
        }
                andar();
                return 0;
                  
    }


    public void limpaTela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
