package thi_thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;

    public static void writeFile(String[] content){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(StringUtils.concat(content,", "));
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> readFile(){
        List<String> arrContent = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                arrContent.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrContent;
    }

    public static void setPath(String fileName){
        StringBuffer path = new StringBuffer("src/thi_thuc_hanh/data/");
        path.append(fileName);
        path.append(".csv");

        FileUtils.path = path.toString();
    }

}
