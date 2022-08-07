public class MyList <E>{
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    public MyList(){
        this(DEFAULT_CAPACITY);
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    public void add (int i, E e){
        ensureCapacity(size);
        System.arraycopy(elements, i, elements, i + 1, elements.length - i - 1);
        elements[i] = e;
        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if (size >= elements.length){
            Object[] temp = new Object[size + minCapacity];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
    }
    public E remove(int i){
        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);

        }else {
            System.arraycopy(elements, i+ 1, elements, i, elements.length - i - 1);
            elements[size - 1] = null;
            size --;
            return (E) elements[i];
        }
    }
    public int size(){
        return size;
    }
    public Object[] clone(){
        Object[] clone = new Object[size];
        System.arraycopy(elements, 0, clone, 0, size);
        return clone;
    }
    public boolean contains(E o){
        boolean contain = false;
        for (Object element:
                elements) {
            if (element.equals(o)){
                contain = true;
                break;
            }
        }
        return contain;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                return i;
            }

        }
        return -1;
    }
    public E get(int i){
        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " +size);

        }else {
            return (E) elements[i];
        }
    }
    public void clear(){
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
    public boolean add(E o){
        ensureCapacity(size);
        elements[size++] = o;
        return true;
    }


}