package com.company;

import java.util.Scanner;

class highArray
{
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //-----------------------------------------------------------
    public HighArray(int max)         // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-----------------------------------------------------------
    public boolean find(long searchKey)
    {                              // find specified value
        int j;
        for(j=0; j<nElems; j++)            // for each element,
            if(a[j] == searchKey)           // found item?
                break;                       // exit loop before end
        if(j == nElems)                    // gone to end?
            return false;                   // yes, can't find it
        else
            return true;                    // no, found it
    }  // end find()
    //-----------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j;
        for(j=0; j<nElems; j++)        // look for it
            if( value == a[j] )
                break;
        if(j==nElems)                  // can't find it
            return false;
        else                           // found it
        {
            for(int k=j; k<nElems; k++) // move higher ones down
                a[k] = a[k+1];
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    //-----------------------------------------------------------
    public static int getMax(int[] a)
    {
        int maxValue = a[0];
        for(int i=1;i < a.length;i++)
        {
            if(a[i] > maxValue)
            {
                maxValue = a[i];
                System.out.print("The max value is" + a[i]);
            }
        }
        return maxValue;
    }
    //------------------------------------------------------------
    public void removeMax()
    {                        // set value for comparison starting from the beginning of the array
        int arrayMax = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < nElems; i++) {
            if (arr[i] > arrayMax) {
                arrayMax = arr[i];
                maxIndex = i;
            }
        }

        arr.remove(maxIndex);
    }
    public static void reverse(int[] data) {
        int left = 0;
        int right = data.length - 1;

        while( left < right ) {
            // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }
    }
}  // end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array

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

        arr.display();//display items
        arr.getMax();// display max
        arr.removeMax();//remove max

        int searchKey = 35;           // search for item
        if( arr.find(searchKey) )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);               // delete 3 items
        arr.delete(55);
        arr.delete(99);

        System.out.println("array items after delete some values: "+ arr.display());// display items again
        System.out.println("the Max is "+arr.getMax());
        System.out.println("the array after calling max method: "+arr.display());
        arr.removeMax();
        System.out.println("the array after calling remove max method: "+arr.display());
        System.out.println("the new max is "+arr.getMax());
        arr.revevrse();
        System.out.println("the array after calling reverse method "+arr.display());
    }  // end main()
}  // end class HighArrayApp
