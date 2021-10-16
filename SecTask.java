import java.util.Locale;

public class SecTask {
    public static int oppositeHouse(int number, int length){
        return ((2*length+1)-number);
    }
    public static String nameShuffle(String str){
        String[] parts = str.split(" ");
        return parts[1] + " " + parts[0];
    }
    public static int discount(int price, int percent){
        return (price-(price*percent/100));
    }
    public static int differenceMaxMin(int[] sample){
        int max = sample[0];
        int min = sample[0];
        for (int i = 1; i < sample.length - 1; i++){
            if (sample[i] < sample[i + 1]) {
                min = sample[i];
            }
            if (sample[i] > sample[i + 1]) {
                max = sample[i];
            }
        }
        return max - min;
    }
    public static int equal (int a,int b, int c) {
        int k = 1;
        if (a == b){
            k = k+1;
        }
        if ( a==c){
            k = k+1;
        }
        if (b==c){
            k = k+1;
        }
        if (k==4){
            k = k-1;
        }
        return k;
    }
    public static String reverse(String str){
        String result = "";
        for (int i = 0; i< str.length(); i++){
            result = str.charAt(i) + result;
        }
        return result;
    }
    public static  int programmers (int proger1, int proger2, int proger3){
        int maximum = Math.max(proger1, proger2);
        if (proger3 > maximum){
            maximum = proger3;
        }
        int minimum = Math.min(proger1, proger2);
        if (proger3 < minimum){
            minimum = proger3;
        }
        int difference = maximum - minimum;
        return difference;
    }
    public static boolean gerXO(String str){
        int x = 0;
        int o = 0;
        String str1=str.toLowerCase(Locale.ROOT);
        for (int i=0; i<str.length(); i++){
            if (str1.charAt(i) == 'x'){
                x = x+1;
            }
            if (str1.charAt(i) == 'o') {
                o = o+1;
            }
        }
        return x==o;
    }
    public static String bomb(String str){
        String str1=str.toLowerCase(Locale.ROOT);
        int word = str1.indexOf("bomb");
        if(word == -1){
            return ("Relax, there is no bomb.");
        }
        else{
            return ("DUCK!");
        }
    }
    public static boolean sameAscii(String as, String bs){
        int a,b;
        a=0; b=0;
        for (int i=0; i<as.length(); i++){
            a+=as.charAt(i);
        }
        for (int i=0; i<as.length(); i++){
            b+=bs.charAt(i);
        }
        return (a==b);
    }


    public static void main(String[] args) {
        System.out.println(oppositeHouse(5,46) + " дом");
        System.out.println(nameShuffle("Татьяна Портнова"));
        System.out.println(discount(100,25));
        int []sample ={10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(sample));
        System.out.println(equal(1,1,1));
        System.out.println(reverse("Hello world"));
        System.out.println(programmers(147,33,526));
        System.out.println(gerXO("xooxx"));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(sameAscii("EdAbIt", "EDABIT"));
    }
}











