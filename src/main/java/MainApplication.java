import analyzer.BankStatementAnalyzer;
import analyzer.BankStatementCSVParser;
import analyzer.BankStatementParser;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        String[] files = {"bank-data-simple.csv"};

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(files, bankStatementParser);
    }
}