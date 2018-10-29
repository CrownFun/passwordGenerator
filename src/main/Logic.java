package main;

// !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}   ASCI board

import java.util.ArrayList;
import java.util.Random;

public class Logic {

    public static final int NumberOfPasswords = 15;


    public static String generateMultiPassword(int lengthOfPassword) {
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(125 - 32) + 32;      // random number between 33 and 122

                znak = (char) result;
                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfSmallLetters(int lengthOfPassword) {
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(122 - 97) + 97;       // generate random number between 97 and 122

                znak = (char) result;
                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfBigLetters(int lengthOfPassword) {
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(90 - 65) + 65;

                znak = (char) result;
                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfNumbers(int lengthOfPassword) {
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(57 - 48) + 48;

                znak = (char) result;
                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfSpecialSigns(int lengthOfPassword) {
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(47 - 33) + 33;

                znak = (char) result;
                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfSmallAndBigLetters(int lengthOfPassword, int smallLettersBegin, int smallLettersEnd, int bigLettersBegin, int bigLettersEnd) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = bigLettersBegin; i <= bigLettersEnd; i++) {

            lista.add(i);
        }
        for (int i = smallLettersBegin; i <= smallLettersEnd; i++) {

            lista.add(i);
        }
        
        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(lista.size());
                int a = lista.get(result);

                znak = (char) a;

                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }

    public static String generatePasswordMadeOfBigLettersNumbersAndSpecialSigns(int lengthOfPassword, int bigLettersBegin, int bigLettersEnd, int numbersBegin, int numbersEnd, int specialSignsBegin, int specialSignsEnd) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = numbersBegin; i <= numbersEnd; i++) {

            lista.add(i);
        }
        for (int i = bigLettersBegin; i <= bigLettersEnd; i++) {
            lista.add(i);
        }
        for (int i = specialSignsBegin; i <= specialSignsEnd; i++) {
            lista.add(i);
        }

        int limit = 0;
        String password = "";
        while (limit < NumberOfPasswords) {

            for (int i = 0; i < lengthOfPassword; i++) {
                char znak;

                int result;
                Random r = new Random();

                result = r.nextInt(lista.size());
                int a = lista.get(result);

                znak = (char) a;

                password = password + znak;

            }
            password = password + "\n";
            limit++;

        }
        return password;
    }


}
