class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int shortestPath = Math.max(Math.abs(sx - fx), Math.abs(sy - fy));
        if(shortestPath > t){
            return false;
        }
        if(sx == fx && sy == fy && t == 1){
            return false;
        }
        return true;
    }



}

