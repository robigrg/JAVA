package com.company;
import java.util.Scanner;
// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
{
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayIns(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void oddevensort(){
        boolean sort = false;
        while(!sort){
            sort=true;
            for(int i=1;i<=nElems-2;i=i+2) {
                if (a[i] > a[i + 1]) {
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sort = false;
                }
            }
            for(int i=0;i<=nElems-2;i=i+2){
                if (a[i] > a[i + 1]) {
                    long temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sort = false;
                }
            }

        }
    }
    public long Median()
    {
        if(nElems %2 == 0)
        {
            return a[nElems/2];
        }
        else
        {
            return (a[(nElems-1)/2] + a[nElems/2])/2;
        }
    }
//--------------------------------------------------------------
}  // end class ArrayIns
////////////////////////////////////////////////////////////////
class Insertsort
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        ArrayIns arr;                 // reference to array
        arr = new ArrayIns(maxSize);  // create the array

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        System.out.println("Array Before Sorting: ");
        arr.display();
        System.out.println("Array After Sorting using the OddEvenSort: ");
        arr.oddevensort();
        arr.display();
        System.out.println("Median is "+arr.Median());
        arr.insert(109);
        arr.insert(85);
        System.out.println("Array After Inserting 109 & 85:");
        arr.oddevensort();
        arr.display();
        System.out.println("Median after inserting 109 & 85: "+arr.Median());

    }  // end main()
}  // end class InsertSortApp






