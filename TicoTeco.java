/*1- Escreva um programa que imprima os números de 1 a 100. Mas para múltiplos de três imprima 'Tico'
em vez do
número e para os múltiplos de cinco imprima 'Teco'. Para números que são
múltiplos de três e cinco imprimir 'TicoTeco'.
Exemplo, para o caso de 1 a 5, o programa nos daria '1, 2, Tico, 4, Teco'. Utilize o
esqueleto a seguir para implementar seu código: public void ticoTeco() { // Seu código } */

public class TicoTeco {
    public void ticoTeco() {

        for(int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TicoTeco");
            } else if (i % 3 == 0) {
                System.out.println("Tico");
            } else if (i % 5 == 0) {
                System.out.println("Teco");
            } else {
                System.out.println(i);
            }
        }
    }
}
