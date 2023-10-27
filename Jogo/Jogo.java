package Jogo;
import classes.Assassino;
import classes.Guerreiro;
import classes.Jogador;
import classes.Mago;
import inimigo.Inimigo;

import java.util.Scanner;

public class Jogo  {
    //Fazer o jogador colocar o nome dele completo (ok) e transformar isso em um ícone para representar ele na arena (ok)
    //Ícone = inicial do nome dele (ok)
    //Para fazer os inimigos vamos precisar de herança -> extends etc (ok)
        Jogador jogador = new Jogador();
        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();
        Assassino assassino = new Assassino();
        Inimigo inimigo = new Inimigo();

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
         
        System.out.println("Bem-vindo(a)!");
        System.out.println("Está preparado(a) para uma experiência nova? Antes de tudo... informe seu nome completo:");

        this.jogador.nome = sca.nextLine();
        this.jogador.icone = String.valueOf(this.jogador.nome.charAt(0));


        limpaTela();

        System.out.println("Ótimo, " + this.jogador.nome + ". Precisamos de mais algumas coisas.");
        System.out.println("Ah! E Sua representação na arena vai ser: " + this.jogador.icone);
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

            mapa();
    }

    public int mapa(){

        Scanner sca = new Scanner(System.in);

                System.out.println("Digite sua coordenada de onde deseja começar o jogo:");
                int colunaY = sca.nextInt() -1;
                int linhaX = sca.nextInt() -1;
                
                this.jogador.posicaoY = colunaY;
                this.jogador.posicaoX = linhaX;


                mapa[linhaX][colunaY] = "[" + this.jogador.icone + "]";

        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){
                System.out.print(mapa[i][j]);

            }
            System.out.println();
        }
            System.out.println("Para se movimentar:");
            System.out.println("A- para ir para a direita;");
            System.out.println("W- para ir para cima;");
            System.out.println("D- para ir para a esquerda;");
            System.out.println("S- para ir para baixo.");

            andar();
        
        return 0;
    }
    public int andar(){
                Scanner sca2 = new Scanner(System.in);
                
        //         // System.out.println("Digite sua coordenada de onde deseja começar o jogo:");
        //         int  colunaY = sca2.nextInt();
        //         int linhaX = sca2.nextInt();


            //mapa[linhaX][colunaY] = "[" + this.jogador.icone + "]";
                
        //         for(int i = 0; i < mapa.length; i++){
        //             for(int j = 0; j < mapa.length; j++){
        //         System.out.print(mapa[i][j]);
        //     }
        //          System.out.println();
        // }

            // System.out.println("Para se movimentar:");
            // System.out.println("A- para ir para a direita;");
            // System.out.println("W- para ir para cima;");
            // System.out.println("D- para ir para a esquerda;");
            // System.out.println("S- para ir para baixo.");

            String tecla = sca2.nextLine();

            if(tecla.equals("A")){
            //diminui 1 da posição do jogador na linha X
                this.jogador.posicaoX = this.jogador.posicaoX -1;
            }
            if(tecla.equals("W")){
            //aumenta 1 da posição do jogador na coluna Y
                this.jogador.posicaoY = this.jogador.posicaoY + 1;
            }
            if(tecla.equals("D")){
            //aumenta 1 da posição do jogador na linha X
                this.jogador.posicaoX = this.jogador.posicaoX + 1;
            }
            if(tecla.equals("S")){
            //diminui 1 da posição do jogador na coluna Y
                this.jogador.posicaoY = this.jogador.posicaoY - 1;
            }

            for(int i = 0; i < mapa.length; i++){
                    for(int j = 0; j < mapa.length; j++){
                System.out.print(mapa[i][j]);
            }
                 System.out.println();
        }


                andar();
                return 0;
                  
    }

    public int batalha(){
        int luta = this.jogador.vida - this.inimigo.dano;

    

        
        return 0;
    }
    //luta -> jogador.vida - inimigo.dano
    //luta -> inimigo.vida - jogador.dano 

    public void limpaTela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
