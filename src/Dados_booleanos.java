//Tipos booleanos
public class Dados_booleanos {
    public static void main(String[] args) {
        //Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //Tipos não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);
        System.out.println("V " + v); 
        System.out.println("F " + f);

        //boolean/Boolean -> 0 ou 1 (não possui o SIZE nem o Min e o Max)

        if (verdadeiro) {
            System.out.println("É verdadeiro");
        } else {
            System.out.println("É falso");
        }
    }    
}

/*
if (realiza uma veiuficaçao que no final retorna true ou false)
*/
