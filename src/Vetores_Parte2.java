//Vetores parte 2
public class Vetores_Parte2 {
    public static void main(String[] args) {
        //Declaração e definição de tamanho do vetor
        int numeros[] = new int[11];

        System.out.println("Tamanho do vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            //Numeros[0] = i + 3
            numeros[i] = i + 3;
            //Numeros[10] = i + 3
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[10]);//ultimo elemento

        //0...10
        // numeros[11] = 42;
        // System.out.println(numeros[10]);
        /*
        * Os vetores/arrays possuem tamanho fixo e não podem ser alterados (aumentar ou diminuir)
        */

        numeros[0] = 7;
        System.out.println(numeros[0]); //primeiro elemento

        //numeros[0] = 23.4f
        /*
        * Os vetores/arrays possuem tipos de dados fixos e não aceitam tipos variados.
        */        

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.round(Math.random() * 11);
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[10]);//ultimo elemento

        //0...1 double
        System.out.println(Math.random());

        System.out.println(Math.random() * 10);

        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}