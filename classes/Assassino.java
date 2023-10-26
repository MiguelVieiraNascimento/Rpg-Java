package classes;

public class Assassino extends Jogador{
    public int vida = 5;
    public int defesa = 7;
    public int dano = 9;

    public void status(){
        System.out.println("Vidas: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Defesa: " + defesa);
    }
}