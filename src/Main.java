import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws Exception {
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int N = Integer.parseInt(bufferedReader.readLine());
        int maxCount = 0;
        String maxLine = null;
        for (int i = 0; i < N; i++) {
            String text = bufferedReader.readLine();
            char[] line = text.toCharArray();
            if (maxCount<getUniq(line)) {
                maxCount = getUniq(line);
                maxLine = text;
            }
        }
        System.out.println(maxLine);
    }

    public static int getUniq(char[] line) {
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < line.length; i++) {
            countUnique++;
            for (int j = i + 1; j < line.length; j++) {
                if (line[j] == line[i]) {
                    count++;
                }
            }
        }
        return countUnique - count;
    }
}
