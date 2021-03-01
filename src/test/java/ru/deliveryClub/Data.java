package ru.deliveryClub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Data {
    public static void main(String[] args) throws IOException {
        Map<String, String> arr = addCard();

        for (Map.Entry<String, String> pair : arr.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " : " + value);
        }
        int a = arr.size();
        System.out.println(a);
    }
        public static Map<String, String>addCard() throws IOException {
        ArrayList<String> english = addEnglish("/home/siil/Desktop/english");
        ArrayList<String> russian = addEnglish("/home/siil/Desktop/russian");
        int lengthEng = english.size();
        english.remove(lengthEng-1);
        int lengthRus = russian.size();
        russian.remove(lengthRus-1);
        Map<String, String> data = new HashMap<String, String>();
        for (int i = 0; i < english.size(); i++) {
            data.put(english.get(i), russian.get(i));
        }
        return data;
    }


        // построчное считывание файла
        public static ArrayList<String> addEnglish(String path) throws IOException {
                File file = new File(path);
                //создаем объект FileReader для объекта File
                FileReader fr = new FileReader(file);
                //создаем BufferedReader с существующего FileReader для построчного считывания
                BufferedReader reader = new BufferedReader(fr);
                // считаем сначала первую строку
            ArrayList<String> english = new ArrayList<String>();
                String line = reader.readLine();
                english.add(line);

                while (line != null) {
                   // System.out.println(line);
                    // считываем остальные строки в цикле
                    line = reader.readLine();
                    english.add(line);
                }
                return english;
            }

}
