import interfacesiphone.AparelhoTelefonico;
import interfacesiphone.NavegadorInternet;
import interfacesiphone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    public void exibirPagina() {
       System.out.println("Exibindo página");
    }

    
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

   
    public void ligar() {
       System.out.println("Ligando...");
    }

    
    public void atender() {
       System.out.println("Atendendo...");
    }

    
    public void iniciarCorreioVoz() {
       System.out.println("Iniciando correio de voz");
    }

    
    public void tocar() {
       System.out.println("Tocando...");
    }

    
    public void pausar() {
       System.out.println("Pausando");
    }

    
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }



}
