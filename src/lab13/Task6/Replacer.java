package lab13.Task6;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Replacer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String fileContent = Files.readString(Path.of(args[0]));
            String[] words = fileContent.split("\\s+");

            String result = getLine(words);
            System.out.println("Сформированная цепочка:");
            System.out.println(result);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        if (wordList.size() == 1) {
            return wordList.get(0);
        }

        StringBuilder result = new StringBuilder();
        boolean chainFound = false;

        for (int i = 0; i < wordList.size() && !chainFound; i++) {
            Collections.swap(wordList, 0, i);
            chainFound = buildChain(result, wordList);
            if (!chainFound) {
                result.setLength(0);
            }
        }

        return result.toString();
    }

    private static boolean buildChain(StringBuilder result, List<String> words) {
        result.append(words.get(0));
        List<String> usedWords = new ArrayList<>();
        usedWords.add(words.get(0));

        while (usedWords.size() < words.size()) {
            boolean found = false;
            String lastWord = usedWords.get(usedWords.size() - 1);
            char lastChar = Character.toLowerCase(lastWord.charAt(lastWord.length() - 1));

            for (String word : words) {
                if (!usedWords.contains(word) &&
                        Character.toLowerCase(word.charAt(0)) == lastChar) {
                    result.append(" ").append(word);
                    usedWords.add(word);
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}
