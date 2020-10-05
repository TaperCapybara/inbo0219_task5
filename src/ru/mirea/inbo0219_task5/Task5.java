package ru.mirea.inbo0219_task5;

public class Task5 {
    public int n;

    public int Rec(int n){
        if (n==0){
            return 0;
        }
        return Rec(n/10) + (n%10);
    }

    public Task5(int n){
        System.out.println(Rec(n));
    }

}
