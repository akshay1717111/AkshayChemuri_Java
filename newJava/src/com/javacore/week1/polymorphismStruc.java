package com.FullStackJava.week1;

class Cricket{
    public void playerPlay(){
        System.out.println("Players will play cricket");
    }
}

class Football extends Cricket{
    public void playerPlay(){
        System.out.println("Players will play football");
    }
}
class Tennis extends Football{
    public void playerPlay(){
        System.out.println("Players will play Tennis");
    }
}


public class polymorphismStruc{
    public static void main(String[] args){
        Cricket c=new Cricket();
        Cricket c1=new Football();
        Cricket c2=new Tennis();
        c.playerPlay();
        c1.playerPlay();
        c2.playerPlay();

    }
}
