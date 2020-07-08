import core.data.*;

public class PresidentsObjects {
    public static void main(String[] args) {
        String url = "lec180-arrays/us-presidents.csv";
        DataSource ds = DataSource.connect(url).load();
        ds.printUsageString();

        President[] pres = ds.fetchArray(President.class, "president", "vice", "party", "start");
        
        System.out.println(pres[0]);
        System.out.println(pres[pres.length - 1]);
        System.out.println(pres.length);
    }
}
