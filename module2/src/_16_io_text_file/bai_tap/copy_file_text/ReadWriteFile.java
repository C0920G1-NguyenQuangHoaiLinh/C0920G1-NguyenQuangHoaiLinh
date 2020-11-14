package _16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File fileCopyTextRead = new File("src/_16_io_text_file/bai_tap/copy_file_text/read copy file text.txt");
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader(fileCopyTextRead));
        String line = null;
        File fileCopyTextWrite = new File("src/_16_io_text_file/bai_tap/copy_file_text/write copy file text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/_16_io_text_file/bai_tap/copy_file_text/write copy file text.txt")));

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

//        File fileCopyTextWrite = new File("src/_16_io_text_file/bai_tap/copy_file_text/write copy file text.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/_16_io_text_file/bai_tap/copy_file_text/write copy file text.txt")));
//        bufferedWriter.write(string);
//        bufferedWriter.close();
    }
}

