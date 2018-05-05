public class LC151 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" +");
        String space = "";
        for (int i = arr.length-1; i>=0; i--) {
            if (arr[i].equals(" "))
                continue;
            sb.append(space);
            sb.append(arr[i]);
            space = " ";
        }
        String res = sb.toString();
        return res;
    }
}