package problems;

public class StringToInt {
    public static void main(String[] args) {
        String s=
                "00000-42a1234";
        System.out.println(new StringToInt().myAtoi(s));
    }

    public int myAtoi(String s) {

        char[] sc = s.toCharArray();
        int parsedLength = 0;
        int[] parsed = new int[sc.length];
        boolean isStarted = false;
        boolean isNegative = false;
        for (int i = 0; i < sc.length; i++) {
            char ci = sc[i];
            if (ci == ' ' && !isStarted) continue;
            if (ci == ' ' && isStarted) break;

            if (ci == '-') {
                isNegative = true;
                if (isStarted) break;
                else {
                    isStarted = true;
                    continue;
                }
            }
            if (ci == '+') {
                if (isStarted) break;
                else {
                    isStarted = true;
                    continue;
                }
            }
            isStarted = true;
            try {
                int nc = Integer.parseInt(String.valueOf(ci));
                if(nc==0 && parsedLength==0)
                {

                }else {
                    parsed[parsedLength] = nc;
                    parsedLength++;
                }
            } catch (Exception ex) {
                break;
            }
        }
        if (parsedLength == 0) return 0;
        long result = 0;
        long base = 1;
        for (int i = parsedLength - 1; i >= 0; i--) {
            result = result + parsed[i] * base;
            base = base * 10;
        }


        if (!isNegative && (parsedLength>10 || result > Math.pow(2, 31) - 1)) {
            result = (int) Math.pow(2, 31);
        } else if (isNegative && (parsedLength>10 ||result > Math.pow(2, 31))) {
            result = (int) Math.pow(2, 31) + 1;
        }
        if (isNegative) result = result * -1;
        return (int) result;
    }
}
