package Final;
import java.util.ArrayList;
public class COSC314FinalExam {
     static ArrayList<String> PowerSet(char[] set, int set_size) {
         long power_set_size = (long) Math.pow(2, set_size);
         int j;
        int counter;
        ArrayList<String> result = new ArrayList<>();

        for (counter = 0; counter < power_set_size; counter++) {
            StringBuilder temp_result = new StringBuilder();
            for (j = 0; j < set_size; j++) {
                if ((counter & (1 << j)) > 0)
                    temp_result.append(set[j]);
            }
            result.add(temp_result.toString());
        }

        for (String s : result) {
            System.out.println(s);
        }
        return result;
    }
}