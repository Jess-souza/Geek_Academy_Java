//Tipos de dados alfanuméricos
//Caracteres e strings
public class Dados_alfanumericos {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra1 = 'a'; //Aspas simples, pois é caracter, aspas duplas é strings
        char letra2 = 97; //97 em decimal == 'a'
        //string nome = não existe o tipo primitivo de string em java

        System.out.println("Letra2 " + letra2);

        letra2 = (char) (letra2 + 1); //cast é colocar entre () para indicar o tipo

        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);

        //Tipos não primitivos
        Character letra3 = 'A';
        String nome = "Jéssica Souza";

        System.out.println("Letra3 " + letra3);
        System.out.println("Nome " + nome);
        System.out.println("Tamanho da String " + nome.length());

        System.out.println("char/Character " + Character.SIZE + " bits");
        System.out.println("String " + Character.SIZE * nome.length() + " bits");


        System.out.println("Valor Min char/Character " + Character.MIN_VALUE); // 0
        System.out.println("Valor Max char/Character " + Character.MAX_VALUE); // 65535

    }

}
