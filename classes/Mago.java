package classes;

public class Mago extends Jogador  {
  public int vida = 8;
  public int dano = 6;
  public int defesa = 8;
    
  public void status(){
    System.out.println("Vidas: " + vida);
    System.out.println("Dano: " + dano);
    System.out.println("Defesa: " + defesa);
}
}