package ipod;

public class ReprodutorMusica {

    public void tocar() {
        selecionarMusica();
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    private void selecionarMusica() {
        System.out.println("Musica selecionada");
    }



}
