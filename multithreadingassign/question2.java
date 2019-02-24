package com.multithreading;
class question2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        question2 t1=new question2();
        question2 t2=new question2();
        question2 t3=new question2();
        t1.start();
        try{
            t1.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}