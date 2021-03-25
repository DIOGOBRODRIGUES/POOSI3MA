import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String palavra;
        char car;

        System.out.println("Digite uma palavra: ");
        palavra = ler.nextLine();
        System.out.println("Digite uma letra: ");
        car = ler.next().charAt(0);

        manipulaString(palavra, car);
    }

    public static void manipulaString(String s, char c){
        System.out.println(s);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==c){
                System.out.print(s.charAt(i));
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();

        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) != c){
                System.out.print(s.charAt(j));
            }else{
                System.out.print(" ");
            }
        }
    }
}
