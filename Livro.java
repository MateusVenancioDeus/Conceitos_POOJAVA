public class Livro {
    String nome;
    String descricao;
    Double valor;
    String isbn;
    Autor autor;
    //Registro do Livro ISBN!

    //Composição é quando uma classe está dentro de outra classe!

    //Conceito de metodo!
    void mostrarDetalhes() {
        String mensagem ="Detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("------");
        autor.mostrarDetalhes();
    }

}
