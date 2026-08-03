class Solution {
    public int fib(int n) {
        //0 1 1 2 3 5 8 13
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}