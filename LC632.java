class LC632 {
    // multi-pointers TLE
    public int[] smallestRange(List<List<Integer>> nums) {
        int len = Integer.MAX_VALUE;
        int[] res = new int[2];
        int k = nums.size();
        int[] arraylen = new int[k];
        for (int i=0; i<k; i++) {
            arraylen[i] = nums.get(i).size();
        }
        int[] pointer = new int[k];
        
        while (!endCheck(pointer, arraylen)) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i=0; i<k; i++) {
                int item = nums.get(i).get(pointer[i]);
                if (item<min)
                    min = item;
                if (item>max)
                    max = item;
            }
            if (max - min < len) {
                len = max - min;
                res[0] = min;
                res[1] = max;
            }
            move(pointer, arraylen, nums);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<k; i++) {
                int item = nums.get(i).get(pointer[i]);
                if (item<min)
                    min = item;
                if (item>max)
                    max = item;
            }
        if (max - min < len) {
                len = max - min;
                res[0] = min;
                res[1] = max;
        }
        return res;
        
        
        
        
        
        
    }
    
    private boolean endCheck(int[] pointer, int[] arraylen) {
        int flag = 0;
        for (int i = 0; i<pointer.length; i++) {
            if (pointer[i] == arraylen[i]-1)
                flag++;
        }
        return flag == pointer.length;
        
    }
    private void move(int[] pointer, int[] arraylen, List<List<Integer>> nums) {
        int k = pointer.length;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i=0; i<k; i++) {
            if (pointer[i] < arraylen[i]-1 && nums.get(i).get(pointer[i]) < min) {
                min = nums.get(i).get(pointer[i]);
                index = i;
                
            }
        }
        
        pointer[index]++;       
        
    }

    class Element {
        int val;
        int index;
        int row;
        
        public Element(int val, int index, int row) {
            this.val = val;
            this.index = index;
            this.row = row;
        }
    }
    
    // Optimize: Use Priority Queue
    public int[] smallestRange(List<List<Integer>> nums) {
        int len = Integer.MAX_VALUE;
        int[] res = new int[2];
        int k = nums.size();
        int[] arraylen = new int[k];
        for (int i=0; i<k; i++) {
            arraylen[i] = nums.get(i).size();
        }
        
        
        PriorityQueue<Element> q = new PriorityQueue<>(new Comparator<Element>() {
            public int compare(Element a, Element b) {
                return a.val - b.val;
            }
            
        });
        
        int max = Integer.MIN_VALUE;
        for (int i=0; i<k; i++) {
            q.offer(new Element(nums.get(i).get(0), 0, i));
            max = Math.max(max, nums.get(i).get(0));
        }
        
        while (true) {
            Element minelt = q.poll();
            
            if (max - minelt.val < len) {
                len = max - minelt.val;
                res[0] = minelt.val;
                res[1] = max;
            }
            if (minelt.index == arraylen[minelt.row]-1) {
                break; // end loop
            }
            
            q.offer(new Element(nums.get(minelt.row).get(minelt.index+1), minelt.index+1, minelt.row));
            if (nums.get(minelt.row).get(minelt.index+1)>max)
                max = nums.get(minelt.row).get(minelt.index+1);
            
        }     
        
        return res;
        
    }

}