import analyzer.BankStatementAnalyzer;
import analyzer.BankStatementCSVParser;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        String[] files = {"bank-data-simple.csv"};

        final BankStatementAnalyzer bankStatementAnalyzer
                = new BankStatementAnalyzer();

        BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();


        bankStatementAnalyzer.analyze(files, bankStatementCSVParser);
    }
}