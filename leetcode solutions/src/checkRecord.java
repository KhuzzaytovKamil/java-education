public class checkRecord {
    checkRecord(String s) {
        System.out.println(solution(s));
    }

    private boolean solution(String s) {
        int totalAbsentDays = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                totalAbsentDays += 1;
                if (totalAbsentDays > 1) {
                    return false;
                }
            }
            else if (s.charAt(i) == 'L' && i < s.length() - 2) {
                if (s.substring(i, i + 3).equals("LLL")) {
                    return false;
                }
            }
        }

        return true;
    }
}
