package main.java;

import java.util.List;

public interface IBankStatementParser
{
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
