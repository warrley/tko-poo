import java.util.ArrayList;

public class draft {
    public static void main(String args[]) {

        // Array
        int[] num = new int[5];

        num[0] = 52;
        num[1] = 100;
        num[2] = 57;
        num[3] = 578;
        num[4] = 02;

        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        
        int[] num2 = {52, 100, 57, 587, 0};
        
        for(int n:num2) {
            System.out.println(n);
        }

        //ArrayList -> addiciona automaticamente, sem se preocupar com o tamanho dele
        //tem que passar uma Classe como tipo do array
        //Primitimos int -> Integer, float -> Float, double -> Double, char -> Character
        ArrayList<String> str = new ArrayList<String>();
        str.add("guilherme");
        str.add("warley");
        str.add("brito");
        str.add("farias");

        for(String s:str) {
            System.out.println(s);
        }

        //metodos -> .size() = tamanho do array, .get(index) = pega o elemento passado, .remove(index) = remove o elemento passado, .clear() = limpa


    }
}

