class Q1{
    public static void main(String[] args) {
        test_b();
    }

    private static void test_a(){
        final int ARRAY_SIZE = 5;
        //ARRAY_SIZE = 10;
        // cannot assign a value to final variable ARRAY_SIZE
    }

    private static void test_b(){
        int b[] = new int [10];
        for (int i=0; i <= b.length; i++)
            b[i] = 1;
            // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    }

    private static void test_c(){
        int a[][] = {{1,2},{3,4}};
        //a[1,1] = 5;
        a[1][1] = 5;
    }
}