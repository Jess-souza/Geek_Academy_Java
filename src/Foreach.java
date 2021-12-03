//Foreach
public class Foreach {
    public static void main(String[] args) {
        String nome = "Jéssica Souza";

        //Para cada um dos caracteres da string, imprima um caractere
        for (char letra : nome.toCharArray()) {
            //System.out.println(letra);
            System.out.print(letra);
        }
    }
}
