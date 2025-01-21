package Greedy_Algorithem;

import java.util.Arrays;
import java.util.Comparator;

public class Meeting_Greedy {

    public class Program {
        public int start;
        public int end;

        public Program(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // 比较器
    public class ProgramComparator implements Comparator<Program> {
        @Override
        public int compare(Program o1, Program o2) {
            return o1.end - o2.end;
        }
    }

    public int bestArrange(Program[] programs, int timePoint) {
        Arrays.sort(programs, new ProgramComparator()); // 修正变量名和导入问题
        int result = 0;
        for (int i = 0; i < programs.length; i++) {
            if (timePoint <= programs[i].start) {
                result++;
                timePoint = programs[i].end;
            }
        }
        return result;
    }
}
