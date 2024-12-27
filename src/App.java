import internet.Navegador;
import ipod.ReprodutorMusica;
import phone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Telefone telefone = new Telefone();
        ReprodutorMusica ipod = new ReprodutorMusica();
        Navegador browser = new Navegador();

        telefone.ligar();
        telefone.desligar();
        
        ipod.tocar();
        ipod.pausar();

        browser.exibirPagina();
        browser.adicionarNovaAba();
        browser.exibirPagina();
        browser.atualizarPagina();
        browser.fecharNavegador();







    }
}
