package classes;

import java.util.Scanner;

import Jogo.jogo;



public class Jogador{
    //Criar atributos do jogador: nome (ok)
    //vida, icone, dano, defesa, nivel de experiência e as coordenadas dele no mapa
    //Pedir para o jogador informar o nome completo no inicio do jogo (ok). O jogador vai ser representado no mapa pela inicial
    //do nome dele em maiúsculo, a primeira letra e armazena no jogador (ok)
    public String nome;
    public String icone; //tem q ser uma string
    public int escolha;
    public int vida; //coloquei um valor aleatorio para cada para poder montar o "menu"
    public int defesa;
    public int dano;
    public int posicaoX;
    public int posicaoY;
    public int passos;
    jogo jogo = new jogo();
    
    String mapa [][] = {
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"}};
   

    public void status(){
        System.out.println("Vidas: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Defesa: " + defesa);

    }
    public int andar(){
            Scanner sca2 = new Scanner(System.in);
       
            String tecla = sca2.nextLine();

             if(tecla.toUpperCase().equals("A")){
            //diminui 1 da posição do jogador na linha X
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoY = this.posicaoY-1;
            this.posicaoX = this.posicaoX;
            mapa[this.posicaoX ][this.posicaoY] =  "[" + this.icone + "]";
            this.passos++;

            }
            if(tecla.toUpperCase().equals("W")){
            //aumenta 1 da posição do jogador na coluna Y
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX -1;
            this.posicaoY = this.posicaoY;
            mapa[this.posicaoX][this.posicaoY] =  "[" + this.icone + "]";
             this.passos++;      

            }
            if(tecla.toUpperCase().equals("D")){
            //aumenta 1 da posição do jogador na linha X
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX;
            this.posicaoY = this.posicaoY + 1;  
            mapa[this.posicaoX ][this.posicaoY ] =  "[" + this.icone + "]";
             this.passos++;
            }
            if(tecla.toUpperCase().equals("S")){
            //diminui 1 da posição do jogador na coluna Y
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX + 1;
            this.posicaoY = this.posicaoY;
            mapa[this.posicaoX ][this.posicaoY] =  "[" + this.icone + "]";
            this.passos++;

            }
            

            jogo.mostrarMapa();
            jogo.Escolha();
            //vamos precisar tirar o andar() para o loop
            
                
                  
 
        return 0;
    }
    
    

}
