public class SmartTv{

    boolean ligada = false;
    int canal = 5;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar() {
        ligada = false; 
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuido volume " + volume);
    }

}