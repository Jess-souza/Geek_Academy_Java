//Operações Matemáticas
public class Operações_Matemáticas {

    public static void main(String[] args) {
        int num1 = 6, num2 = 9, res;
        float res2;

        //Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " +  num2 + " resulta em: " + res);

        //Subtração
        res = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " +  num2 + " resulta em: " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " +  num2 + " resulta em: " + res);

        //Divisão (inteira)
        res = num2 / num1;
        System.out.println("A divisão de " + num2 + " / " +  num1 + " resulta em: " + res);

        //Divisão (real)
        res2 = (float) num2 / (float) num1; // cast
        System.out.println("A divisão de " + num2 + " / " +  num1 + " resulta em: " + res2);

        //Módulo
        /*
        *Se o resto do módulo da variável por 2 for 0, a variável é par. Se o resto for 1 a variável é ímpar.
        */
        res = num1 % 2;
        System.out.println("O resto da divisão de " + num1 + " por 2 resulta em: " + res);

        res = num1 % 3;
        System.out.println(num2 + " é divisivel por 3? "  + res); //Se resultado for 0 é divisível se for 1 não é divisível

    }
    
}
