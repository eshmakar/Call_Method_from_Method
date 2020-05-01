public class Test {
    int summa(int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    int avg(int a1, int b1, int c1){
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class Test2{
    public static void main(String[] args) {
        Test t2 = new Test();
        System.out.println(t2.avg(10, 20, 30));
    }
}
