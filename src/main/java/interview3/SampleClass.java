package interview3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SampleClass {

    public static void main(String[] args) {
        List<Integer> marks  = new ArrayList<>();
        marks.add(21);
        marks.add(22);
        marks.add(20);
        marks.add(24);
        marks.add(19);

        sortArray(marks);
        //getHighestMarks(marks);
        System.out.println(getHighestMarksAccordingTOIndex(marks, 2));
    }

    private static int getHighestMarks(List<Integer> marks) {
        return marks.get(marks.size()-1);
    }

    private static int getHighestMarksAccordingTOIndex(List<Integer> marks, int index) {
        int size = marks.size();
        if(index > size) {
            throw new RuntimeException("sorry wrong index " + index);
        }
        return marks.get(size-index);
    }

    private static void sortArray(List<Integer> marks) {
        Collections.sort(marks);

    }
}
