package ScreenshotFrom20210123;

import lombok.Data;

import java.util.*;

public class DuplicateCheckerEx2 {

    public static void main(String[] args) {

        if (checkDuplicates()) {
            System.out.println("There are no duplicates.");
        } else {
            System.out.println("There are duplicates.");
        }
    }

    private static boolean checkDuplicates() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter letters: ");
        String line = scanner.nextLine();

        String[] letters = line.split("");
        List<String> lettersList = new ArrayList<>(Arrays.asList(letters));
        Set<String> lettersSet = new HashSet<>(lettersList);

        if (lettersList.size() == lettersSet.size()) {
            return true;
        } else {
            return false;
        }
    }

}

