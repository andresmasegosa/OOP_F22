package session1;

class D_IfStatement {
    public static void demo1() {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is less than b");

        if (a == b)
            System.out.println("you won't see this");

        System.out.println();
    }

    public static void demo2() {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is less than b");
        else
            System.out.println("you won't see this");

        System.out.println();
    }

    public static void main(String[] args) {
        D_IfStatement.demo1();
        //D_IfStatement.demo2();
    }
}