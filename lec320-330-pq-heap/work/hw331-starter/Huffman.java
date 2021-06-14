import java.io.IOException;

public class Huffman {

    public static void main(String[] args) throws IOException {

        FrequencyTable ft = new FrequencyTable("test.txt");
        HuffmanCode hc = new HuffmanCode(ft);

        for (char ch = 0; ch < 256; ch++) {
            if (ft.freqOf(ch) > 0) {
                System.out.println( ch + ": " + ft.freqOf(ch) );
                System.out.println( ch + ": " + hc.encode(ch) );
            }
        }

    }

}
