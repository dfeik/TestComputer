package com.company;

public class Computer {

    public static void main(String[] args) {
	// write your code here
        Count a = new Count();
        a.increment();
        a.increment();
        a.increment();
        a.pub();
        a.decrement();
        a.pub();
        a.rest();
        a.pub();
    }
}
class Count{
    private int num=10;
    public void Count(int num){
        this.num=num;
    }
    public void increment(){
        num++;
    }
    public void decrement(){
        num--;
    }
    public void rest(){
        num=0;
    }
    public void pub(){
        System.out.println(num);
    }
}
