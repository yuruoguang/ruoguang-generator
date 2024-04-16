package com.ruoguang.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.*;

@Command(name = "ASCIIArt", version = "ASCIIArt 1.0", mixinStandardHelpOptions = true)
public class ASCIIArt implements Runnable{

    @Option(names = {"-s", "--font-size"}, description = "Font size")
    int fontSize = 19;

    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli", description = "Words to be translated into ASCII art.")
    private String[] words = {"Hello", "Picocli"};

    @Override
    public void run() {
        // 实现自己的约为逻辑
        System.out.println("fontSize = " + fontSize);
        System.out.println("words = " + String.join(",", words));
    }

    public static void main(String[] args) {
        int execute = new CommandLine(new ASCIIArt()).execute(args);
        System.exit(execute);
    }
}
