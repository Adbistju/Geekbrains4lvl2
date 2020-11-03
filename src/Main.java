import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        new MyTestWindow();
        Main a=new Main();
        a.testRomanConversion();
    }
    public void testRomanConversion() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "\t =\t " + RomanNumber.toRoman(i));
        }
    }
}
