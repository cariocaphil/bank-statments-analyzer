import analyzer.BankStatementAnalyzer;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        String[] files = {"bank-data-simple.csv"};
        BankStatementAnalyzer.main(files);
    }
}