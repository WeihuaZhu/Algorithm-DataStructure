public class LC38 {
    // note here: should use StringBuilder instead of "+"
    // since this will save running tim
    public String countAndSay(int n) {
        if (n<1)
            return null;
        if (n==1)
            return "1";
        String x = countAndSay(n-1);
        String y = "";
        int i = 0;
        int count = 1;
        while (i<x.length()) {
            String temp = x.substring(i,i+1);
            if (i<x.length()-1) {
                if (x.charAt(i + 1) == x.charAt(i))
                    count++;
                else {
                    y = y + String.valueOf(count) + temp;
                    count = 1;
                }
            }
            else
                y = y + String.valueOf(count) + temp;
            i++;
        }
        return y;

    }


    public String countAndSay2(int n) {
        if (n<1)
            return null;
        if (n==1)
            return "1";
        String x = countAndSay(n-1);
        StringBuilder y = new StringBuilder();
        int i = 0;
        int count = 1;
        while (i<x.length()) {
            String temp = x.substring(i,i+1);
            if (i<x.length()-1) {
                if (x.charAt(i + 1) == x.charAt(i))
                    count++;
                else {
                    y.append(String.valueOf(count));
                    y.append(temp);
                    count = 1;
                }
            }
            else {
                y.append(String.valueOf(count));
                y.append(temp);
            }
            i++;
        }
        String res = y.toString();
        y = new StringBuilder();
        return res;
    }




    public static void main(String[] args) {
        int n = 50;
        LC38 p = new LC38();
        //runtime comparison
        double t1 = System.currentTimeMillis();
        System.out.println(p.countAndSay(n));
        System.out.format("Runtime is %.2f ms\n",(System.currentTimeMillis()-t1));

        double t2 = System.currentTimeMillis();
        System.out.println(p.countAndSay2(n));
        System.out.format("Runtime is %.2f ms\n",(System.currentTimeMillis()-t2));

    }
}
