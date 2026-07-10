class Solution {
    public int fib(int n) {
       if (n==0){
        return 0;
       }else if(n==1){
        return 1;
       }
       int firstterm = 0;
       int secoundterm = 1;
       for (int i=0; i<n; i++){
        int thirdterm = firstterm+secoundterm;

        firstterm = secoundterm;
        secoundterm = thirdterm;
       }
       return firstterm;
    }
}
