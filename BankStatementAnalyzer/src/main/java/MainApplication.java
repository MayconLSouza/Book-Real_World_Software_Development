import main.java.BankStatementAnalyzer;
import main.java.BankStatementCSVParser;
import main.java.IBankStatementParser;

void main(String[] args) throws IOException
{
    final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
    final IBankStatementParser bankStatementParser = new BankStatementCSVParser();

    bankStatementAnalyzer.analyze(args[0], bankStatementParser);
}
