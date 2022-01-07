public class PosPreFixado {
    public static void main(String[] args) {//exemplo de pré-fixado
        System.out.println("Pré-Fixado: ");
        int a = 10;//atribuindo valor 10 à variável "a"
        System.out.println("Sem alteração: " + a);
        int b = ++a;//atribuindo 1 à variável "a", então primeiro atribuímos a soma e depois ela guardou na memória atualizado
        // o valor da variável "a" + 1 e como a variável "b" é igual a variável "a" depois da ação de incremento/decremento ela é o mesmo valor
        // isso ocorre por conta da regra da precedência, ou seja,primeiro se executa o pós-fixado, pré-fixado, multiplicação, divisão, porcentagem, soma, subtração e por último as atribuições =, +=, -=, *=, /=, %=.
        System.out.println("Com alteração: " + a);
        System.out.println("Com alteração: " + b);

        System.out.println("Pós-Fixado: ");
        int c = 10;//atribuindo valor à variável "c"
        System.out.println("Sem alteração: " + c);
        int d = c++;//atribui primeiro o valor a variável "c" retornado o número alterado,
        // e depois realiza a atribuição de "d" à "c" sem o valor modificado da incrementação ou decrementação
        System.out.println("Com alteração: " + c);
        System.out.println("Com alteração: " + d);
    }
}
