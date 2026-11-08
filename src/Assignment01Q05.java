public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if(m == null||m.length == 0){
            return -1;}
        int n =m.length;
        if (i==j){
            return 0;
        }
        boolean[] v=new boolean[n];
        return df(m,i,j,v);
    }
    private static int df(int[][] m, int c, int target, boolean[] v) {
        if(c == target){
            return 0;
        }
        v[c]= true;
        int minist =-1;
        for(int i=0;i<m.length;i++){
            if(m[c][i]== 1 && !v[i]){
                int sub = df(m,i,target,v);
                if(sub != -1){
                    int pathlength = sub +1;
                    if(minist == -1 || pathlength < minist){
                        minist = pathlength;
                    }
                }
                }
            }
        v[c] = false;
        return minist;
        }
    

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}