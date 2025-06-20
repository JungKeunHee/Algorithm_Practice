package algorithm_practice.third_week;

import java.util.Arrays;

public class Hash_03 {

    public static String getAbsentStudent(String[] all, String[] present) {
        Arrays.sort(all);
        Arrays.sort(present);

        for (int i = 0; i < present.length; i++) {
            if (!all[i].equals(present[i])) {
                return all[i];
            }
        }

        // 마지막 남은 사람 (끝까지 도달했으면 마지막 사람이 결석자)
        return all[all.length - 1];
    }


    public static void main(String[] args) {
        String[] allStudents = {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"};
        String[] presentStudents = {"정연", "모모", "채영", "쯔위", "사나", "나연", "미나", "다현"};

        System.out.println(getAbsentStudent(allStudents, presentStudents)); // 예상 출력: 지효

        System.out.println("정답 = 예지 / 현재 풀이 값 = " + getAbsentStudent(
                new String[]{"류진", "예지", "채령", "리아", "유나"},
                new String[]{"리아", "류진", "채령", "유나"}));

        System.out.println("정답 = RM / 현재 풀이 값 = " + getAbsentStudent(
                new String[]{"정국", "진", "뷔", "슈가", "지민", "RM"},
                new String[]{"뷔", "정국", "지민", "진", "슈가"}));
    }
}
