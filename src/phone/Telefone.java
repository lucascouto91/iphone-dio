package phone;

public class Telefone {

    public void ligar() {
        System.out.println("Ligando");
    }

    public void desligar() {
        System.out.println("Desligando ligação");
    }

    public void atender() {
        tocando();
        System.out.println("Atendendo Ligação");
    }

    private void tocando() {
        System.out.println("Telefone tocando!!");
    }


}
