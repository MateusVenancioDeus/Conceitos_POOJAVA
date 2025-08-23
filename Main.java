public class Main {
 public static void main(String[] args) {
 Autor autor = new Autor();
 autor.nome = "Machado de Assis";
 autor.email = "MachadodeAssis@.com.br";
 autor.cpf = "123455675";

 Livro livro = new Livro ();

    livro.nome = "O Senhor dos aneis";
     livro.descricao = "Uma historia de aventura magica!";
     livro.valor = 200.90;
     livro.isbn = "10-20-304";
     livro.autor = autor;
     livro.mostrarDetalhes();

 Autor outroAutor = new Autor();
 outroAutor.nome = "Lady gaga";
 outroAutor.cpf = "04324241";
 outroAutor.email = "LADYGAGA2ASD1@ASF.COM";

 // ponto é puxando atributo da classe!
 Livro outrolivro = new Livro();

 outrolivro.nome = "Pequeno principe";
 outrolivro.descricao = "Uma historia emocionante";
 outrolivro.valor = 100.0;
  outrolivro.isbn = "123-125-26632";
 outrolivro.autor = outroAutor;
outrolivro.mostrarDetalhes();

 }
}