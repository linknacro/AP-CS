/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06;

/**
 *
 * @author 19502
 */
public class IntegerList
{

    int[] list;
    int size;
    int numInts = 0;
    int numElement;

    public IntegerList(int size)
    {
        list = new int[size];
        this.size = size;
        numElement = size;
    }

    public void randomize()
    {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
            numInts++;
        }
    }

    public void print()
    {
        for (int i = 0; i < numElement; i++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }

    public void increaseSize(int size)
    {
        int[] temp = new int[list.length + size];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
        numElement++;
    }

    public int getNumInts()
    {
        return numInts;
    }

    public void addElement(int newVal)
    {
        if (numInts == list.length) {
            increaseSize(1);
        }
        list[numInts] = newVal;
        numInts++;
    }

    public void removeFirst(int newVal)
    {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < list.length; j++) {
                    if (j == list.length - 1) {
                        list[j] = 0;
                    }
                    else {
                        list[j] = list[j + 1];
                    }
                }
                numElement--;
                break;
            }
        }
    }

    public void removeAll(int newVal)
    {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == newVal) {
                count++;
            }
        }
        for (int k = 0; k < count; k++) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == newVal) {
                    for (int j = i; j < list.length; j++) {
                        if (j == list.length - 1) {
                            
                        }
                        else {
                            list[j] = list[j + 1];
                        }
                    }
                    numElement--;
                    break;
                }
            }
        }
    }
}
