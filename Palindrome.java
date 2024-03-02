/*2- Um palíndromo é uma palavra que pode ser lida da esquerda
para a direita e vice-versa. Escreva uma função que verifica se
a palavra dada é um palíndromo. Caracteres em caixa alta devem ser
ignorados. Por exemplo, isPalindrome ("Deleveled") deve retornar True,
já que é um palíndromo por ser possível ser lido nos dois sentidos.
Utilize o esqueleto a seguir para implementar seu código: public boolean
isPalindrome(String s) { // Seu código }*/

public class Palindrome {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("\\s", ""); // Remove espaço em branco na String
        s = s.replaceAll("[^a-zA-Z]", ""); // Permite apenas caracteres do alfabeto
        String reversedString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i); // Copia os elementos da String s para a reversedString na ordem inversa
        }

        return s.equals(reversedString);
    }
}
