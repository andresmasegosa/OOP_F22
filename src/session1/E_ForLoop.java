package session1;

class E_ForLoop {

    public static void forDemo1() {
        int i;
        for (i = 0; i < 10; i++)
            System.out.println(i);

        System.out.println(i*i);
    }

    public static void forDemo2() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);

        //System.out.println(i*i);
    }


    public static void forDemo3() {
        //int i;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(i*i);
        }
    }



    public static void main (String args[]){
        E_ForLoop.forDemo1();
        //E_ForLoop.forDemo2();
        //E_ForLoop.forDemo3();
    }

}