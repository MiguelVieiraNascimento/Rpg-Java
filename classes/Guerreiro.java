package classes;

public class Guerreiro extends Jogador  {
  public int vida = 10;
  public int dano = 5;
  public int defesa = 10;
  
  public void status(){
    System.out.println("Vidas: " + vida);
    System.out.println("Dano: " + dano);
    System.out.println("Defesa: " + defesa);
}
}