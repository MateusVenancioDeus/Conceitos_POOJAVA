# POO-JAVA: Fundamentos de Programação Orientada a Objetos

Bem-vindo ao repositório `POO-JAVA`! Este projeto é uma coleção de exemplos práticos desenvolvidos em Java para ilustrar os conceitos fundamentais da Programação Orientada a Objetos (POO). O objetivo é fornecer um material claro e conciso para quem deseja entender e aplicar os pilares da POO.

## 🎯 Conceitos de POO Abordados

Os exemplos neste repositório demonstram os seguintes princípios da Programação Orientada a Objetos:

*   **Classes e Objetos:** Definição de classes como moldes e criação de objetos como instâncias dessas classes.
*   **Atributos e Métodos:** Representação de características (atributos) e comportamentos (métodos) de objetos.
*   **Encapsulamento:** Proteção de dados internos de um objeto e exposição de interfaces controladas.
*   **Herança:** Reutilização de código e estabelecimento de hierarquias entre classes.
*   **Polimorfismo:** Capacidade de objetos de diferentes classes responderem ao mesmo método de formas distintas.
*   **Associação e Composição:** Relações entre diferentes classes (ex: um `Carro` possui um `Motor`, um `Livro` possui um `Autor`).

## 🛠️ Tecnologias Utilizadas

*   **Java:** Linguagem de programação orientada a objetos.
*   **JDK (Java Development Kit):** Ambiente de desenvolvimento necessário para compilar e executar os programas Java.

## 📂 Estrutura do Projeto

O repositório está organizado com arquivos `.java` que representam diferentes classes e cenários de aplicação dos conceitos de POO:

```
. 
├── Atividades POO/  # Possível diretório com exercícios adicionais
├── Autor.java       # Classe que representa um autor
├── Livro.java       # Classe que representa um livro, possivelmente associada a um Autor
├── Main.java        # Ponto de entrada principal para execução de exemplos
├── carro.java       # Classe que representa um carro
└── motor.java       # Classe que representa um motor, possivelmente associada a um Carro
```

### Descrição dos Arquivos Principais:

*   `Autor.java`: Define a estrutura e o comportamento de um autor.
*   `Livro.java`: Define a estrutura e o comportamento de um livro, demonstrando como um livro pode ter um autor.
*   `carro.java`: Define a estrutura e o comportamento de um carro.
*   `motor.java`: Define a estrutura e o comportamento de um motor, ilustrando a relação de composição ou agregação com a classe `Carro`.
*   `Main.java`: Contém o método `main` para testar e demonstrar a interação entre as classes, criando objetos e chamando seus métodos.

## 🚀 Como Executar os Exemplos

Para compilar e executar os exemplos Java, siga os passos abaixo:

1.  **Certifique-se de ter o JDK instalado:**

    Você pode baixar e instalar a versão mais recente do JDK no site oficial da Oracle ou usar um gerenciador de pacotes como o `sdkman`.

2.  **Clone este repositório:**

    ```bash
    git clone https://github.com/SEU-USUARIO/POO-JAVA.git
    cd POO-JAVA
    ```

3.  **Compile os arquivos Java:**

    Abra o terminal na raiz do projeto e compile os arquivos `.java`:

    ```bash
    javac Autor.java Livro.java carro.java motor.java Main.java
    ```

    *Nota: Se houver um diretório `Atividades POO`, você precisará navegar até ele e compilar os arquivos individualmente ou usar um comando mais abrangente, dependendo da estrutura interna.*

4.  **Execute o programa principal:**

    Após a compilação, execute a classe `Main`:

    ```bash
    java Main
    ```

    A saída dos exemplos será exibida no terminal.

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais.
