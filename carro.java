public class carro{
    String modelo;
    String ano;
    String placa;
    String cor;
    motor motor;

    void mostrarDetalhes() {
        String mensagem ="SEU CARRO: \n ";
        System.out.println(mensagem);
        System.out.println("Nome: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Sua placa: " + placa);
        System.out.println("Cor do carro: " + cor);
        System.out.println("------");
    }

}