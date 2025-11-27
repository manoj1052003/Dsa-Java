package com.arrayList;

class MyArrayList {
    int[] data;  
    int size;    

    MyArrayList() {
        data = new int[5]; 
        size = 0;
    }

    void add(int value) {
        if (size == data.length) {
            resize(); 
        }
        data[size] = value;
        size++;
    }

    void resize() {
        int[] newData = new int[data.length * 2]; 
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData; 
    }

    int get(int index) {
        return data[index];
    }

    int size() {
        return size;
    }
}

class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

