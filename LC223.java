class LC223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = Math.abs(C-A)*Math.abs(D-B);
        int area2 = Math.abs(G-E)*Math.abs(H-F);
        if (!isOverlap(A, B, C, D, E, F, G, H))
            return area1 + area2;
        int x1 = Math.max(A, E);
        int y1 = Math.max(B, F);
        int x2 = Math.min(C, G);
        int y2 = Math.min(D, H);
        int areaoverlap = Math.abs(x2-x1)*Math.abs(y2-y1);
        return area1+area2-areaoverlap;
        
        
        
    }
    
    public boolean isOverlap(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (C<=E || A>=G || B>=H || D<=F)
            return false;
        else
            return true;
        
        
    }
}