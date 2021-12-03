//Tipos de dados
//Numéricos (Inteiros e Reais)
public class Dados_Numericos_Reais {

    public static void main(String[] args) {    
    //Tipos primários/primitivos
    //Por padrão os números reais em java são considerados double
    float preco1 = 23.4f; //Ocupa mnenos espaço 23.40
    double preco2 = 23.4; //Para números maiores 23.44444451651561651521056215


    //Tipos não primários/primitivos
    //Normalmente são usados para realizar conversões
    Float preco3 = 44.6f;
    Double preco4 = 44.7;

    System.out.println("float -> preco1 = " + preco1);
    System.out.println("double -> preco2 = " + preco2);
    System.out.println("Float -> preco3 = " + preco3);
    System.out.println("Double -> preco4 = " + preco4);
    }
}
