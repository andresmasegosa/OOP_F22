package session6.a_generics;


/**
 * Exercise:
 *  a) Run the following code and see why the current implementation of a "List" does not provide type safety.
 *  b) Use generics to adapt the following implementation of a "List" to provide type safety.
 */

/**
 * Example solution
 */
public class GenericList<T> {
    private T[] array;
    int count=0;

    public GenericList() {
        array = (T[]) new Object[100];
    }

    public  void add(T o) {
        array[count++]=o;
    }

    public T get(int i) {
        return array[i];
    }

    public static void main(String[] args) {

        //specify type of genericList as Giraff
        GenericList<Giraff> genericList = new GenericList();

        //allows giraffs to be added
        genericList.add(new Giraff());
        //but not books, throws error. uncomment to see
        //genericList.add(new Book());
    }
}
