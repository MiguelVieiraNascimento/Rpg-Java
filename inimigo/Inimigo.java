package inimigo;
public class Inimigo {
    //extends para cada inimigo criado 
    //a cada 3 movimentos do jogador aparece um inimigo (sem ser onde o jogador está)
    //se estivem lado a lado por exemplo começam um combate 
    //bruxa, elfo negro, orc
    public String nome;
    public int vida;
    public int dano;
    public int posicaoX;
    public int posicaoY;
    public String icone;
    
    String mapa [][] = {
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
        {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"}};
   
    //andar inimigo aqui
    //assim as classes de inimigos vão herdar, e aí a gente só puxa no loop como por ex.:
    //inimigo1.andar();

    public void inimigof(){
        
        int randomNum = (int)(Math.random() * 41);  // 0 to 100
        
        if(randomNum > 0 && randomNum < 10){
            //diminui 1 da posição do jogador na linha X
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoY = this.posicaoY-1;
            this.posicaoX = this.posicaoX;
            mapa[this.posicaoX ][this.posicaoY] =  "[" + this.icone + "]";
           

            }
            if(randomNum > 10 && randomNum < 20){
            //aumenta 1 da posição do jogador na coluna Y
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX -1;
            this.posicaoY = this.posicaoY;
            mapa[this.posicaoX][this.posicaoY] =  "[" + this.icone + "]";
             

            }
            if(randomNum > 20 && randomNum < 30){
            //aumenta 1 da posição do jogador na linha X
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX;
            this.posicaoY = this.posicaoY + 1;  
            mapa[this.posicaoX ][this.posicaoY ] =  "[" + this.icone + "]";
             
            }
            if(randomNum > 30 && randomNum < 40){
            //diminui 1 da posição do jogador na coluna Y
            mapa[this.posicaoX][this.posicaoY] = "[ ]";
            this.posicaoX = this.posicaoX + 1;
            this.posicaoY = this.posicaoY;
            mapa[this.posicaoX ][this.posicaoY] =  "[" + this.icone + "]";
            }

       
    }
    
}
