package case_study.bai_tap_3.common;

public class StringUtils {
    public static String concat(String[] content, String s){
        StringBuffer outStr = new StringBuffer(content[0]);

        for (int i = 1; i < content.length; i++){
            outStr.append(s);
            outStr.append(content[i]);
        }
        return outStr.toString();
    }
}
