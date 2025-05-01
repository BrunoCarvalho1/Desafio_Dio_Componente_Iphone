public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        //Testando Funcionalidade
        meuIphone.selecionarMusica("Artic Monkeys");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}