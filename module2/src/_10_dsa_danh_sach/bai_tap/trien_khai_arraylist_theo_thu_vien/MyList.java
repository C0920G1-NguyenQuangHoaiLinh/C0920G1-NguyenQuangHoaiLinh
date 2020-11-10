package _10_dsa_danh_sach.bai_tap.trien_khai_arraylist_theo_thu_vien;

import java.util.Arrays;

public class MyList<E> {
    private int size ;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        if (capacity >= 0) {
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity : " + capacity);
        }

    }

    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if (size == elements.length){
            ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index : " + index);
        }else if (size == elements.length){
            ensureCapacity(5);
        }

        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size+1; i >= index;i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);

        }else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }
    }

    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (element.equals(elements[i])){
                return i;
            }
        }
        return index;
    }

}
