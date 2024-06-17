package btsession11.bt07;

import java.util.Arrays;

public class QuangTranList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public QuangTranList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    //add
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    //get
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }
    // add in index
    public void add(int index,E e){
        if(size == elements.length){
            ensureCapa();
        }

        for(int i = size; i >index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }
    //increase arrays size
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //remove
    public E remove(int index){
        for(int i = index; i < size; i++){
                elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];
    }
    //size
    public int size(){
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
        }
        return count;
    }
    //contains
    public boolean contains(E o){
        for(int i = 0; i < size; i++){
            if(elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            if(i == size-1){
                str.append(elements[i]);
            }else{
                str.append(elements[i]).append(", ");
            }
        }
        str.append("]");
       return str.toString();
    }
}
