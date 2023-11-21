package Jogo;
import classes.Assassino;
import classes.Guerreiro;
import classes.Jogador;
import classes.Mago;
import inimigo.Bruxa;
import inimigo.ElfoNegro;
import inimigo.Inimigo;
import inimigo.orc;

import java.util.Scanner;

public class jogo  {
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
    
        Scanner sca1 = new Scanner(System.in);
         
        System.out.println("Bem-vindo(a)!");
        System.out.println("Está preparado(a) para uma experiência nova? Antes de tudo... informe seu nome completo:");

        this.jogador.nome = sca1.nextLine();
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

            mapainicial();
    }

    public int mapainicial(){

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

           
             
          
  
             
        
        return 0;
    }
    
    public String mostrarMapa(){
         for(int i = 0; i < this.mapa.length; i++){
            for(int j = 0; j < this.mapa.length; j++){
                System.out.print(this.mapa[i][j]);

            }
            System.out.println();
        }
        return "";
    }

    public int aparecerinimigos(){
        Jogador jogador = new Jogador();
        Bruxa inimigo1 = new Bruxa();
        inimigo1.nome = "Bruxa";
        orc inimigo2 = new orc();
        inimigo2.nome = "Orc";
        ElfoNegro inimigo3 = new ElfoNegro();
        inimigo3.nome = "ElfoNegro";

        //icone -> inimigos
        inimigo1.icone = String.valueOf(inimigo1.nome.charAt(0));
        inimigo2.icone = String.valueOf(inimigo2.nome.charAt(0));
        inimigo3.icone = String.valueOf(inimigo3.nome.charAt(0));

        int numDeInimigo = 0;
        int contador = 1;
        int randomNum = (int)(Math.random() *3);
        if(this.jogador.passos == 3 * contador ){
            if(randomNum == 1){
                
            }
            // aparecer icone no mapa
            
            contador++;

        }
        
        //para quando ele der 3 passos aparecer um inimigo 
      return 0;
      
    }

   

    public int batalha(){
     this.inimigo.vida = this.jogador.vida - this.inimigo.dano;

     if(this.inimigo.vida == 0){
        // inimigo morreu
     }
     if(this.inimigo.vida > 0){
        // o inimigo continua vivo
     }

    

        
        return 0;
    }
    //luta -> jogador.vida - inimigo.dano
    //luta -> inimigo.vida - jogador.dano 

    public void limpaTela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

     public String Escolha(){
        
        Scanner sca = new Scanner(System.in);
        System.out.println("1 - Continuar andando ");
        System.out.println("2 - Abrir inventário");
        System.out.println("3 - atacar o inimigo");
        
        int escolha = sca.nextInt();
        
        if(escolha == 1){
            mostrarMapa();
            //andar();
        }
        if(escolha == 2){
            // função inventário
        }
        //if(){
           if(escolha == 3){
            // função atacar
            }
        //}
        return "";
    }
    public String Inventario(){
        
        
        
        return "";
    }
}

