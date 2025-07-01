import java.util.*;

class Solution {
    static class Pair implements Comparable<Pair>{
        int st;
        int e;
        Pair(int st,int e){
            this.st = st;
            this.e = e;
        }
        @Override
        public int compareTo(Pair p){
            return this.e - p.e;
        }
    }
    public int activitySelection(int[] start, int[] finish) {
        // code here
        List<Pair> ls = new ArrayList<>();
        for(int i=0;i<start.length;i++){
            ls.add(new Pair(start[i] , finish[i]));
        }
        
        Collections.sort(ls);
        int cnt = 1;
        Pair prev = ls.get(0);
        for(int i=1;i<ls.size();i++){
            Pair curr = ls.get(i);
            if(curr.st > prev.e){
                cnt++;
                prev = curr;
            }
        }
        return cnt;
    }
}
