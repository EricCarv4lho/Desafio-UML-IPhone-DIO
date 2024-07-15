public class App {
    public static void main(String[] args) throws Exception {
       Iphone meuIphone =  new Iphone();

       meuIphone.ligar();
       meuIphone.atender();
       meuIphone.iniciarCorreioVoz();

       meuIphone.selecionarMusica();
       meuIphone.tocar();
       meuIphone.pausar();

       meuIphone.adicionarNovaAba();
       meuIphone.atualizarPagina();
       meuIphone.exibirPagina();
    }
}
