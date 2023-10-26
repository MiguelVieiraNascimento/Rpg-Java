package classes;


public class Jogador{
    //Criar atributos do jogador: nome (ok)
    //vida, icone, dano, defesa, nivel de experiência e as coordenadas dele no mapa
    //Pedir para o jogador informar o nome completo no inicio do jogo (ok). O jogador vai ser representado no mapa pela inicial
    //do nome dele em maiúsculo, a primeira letra e armazena no jogador (ok)
    public String nome;
    public char icone;
    public int escolha;
    public int vida; //coloquei um valor aleatorio para cada para poder montar o "menu"
    public int defesa;
    public int dano;

    public void status(){
        System.out.println("Vidas: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Defesa: " + defesa);
    }

}
