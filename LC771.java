class LC771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jew = new HashSet<>();
        for (char c: J.toCharArray())
            jew.add(c);
        int count = 0;
        for (char d: S.toCharArray())
            if (jew.contains(d))
                count++;
        return count;
    }
}