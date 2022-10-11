package session6.a_generics;


/**
 * Exercise:
 *  a) Run the following code and see why the current implementation of a "List" does not provide type safety.
 *  b) Use generics to adapt the following implementation of a "List" to provide type safety.
 */
public class GenericList {
    private Object[] array;
    int count=0;

    public GenericList() {
        array = (Object[]) new Object[100];
    }

    public  void add(Object o) {
        array[count++]=o;
    }

    public Object get(int i) {
        return array[i];
    }

    public static void main(String[] args) {

        GenericList genericList = new GenericList();

        Giraff giraff = new Giraff();
        genericList.add(giraff);

        Book book = (Book) genericList.get(0);

    }
}
