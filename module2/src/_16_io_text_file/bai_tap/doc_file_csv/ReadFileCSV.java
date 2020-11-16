package _16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args){
        File csvFile = new File("src/_16_io_text_file/bai_tap/doc_file_csv/TextReadFileCSV.csv");
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            while ((line = bufferedReader.readLine()) != null){
                String[] country = line.split(",");
                System.out.println("Country :" + country[4] + " name : " + country[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
