package Lambdas;

class Trabalho1 implements Runnable {
    public void run(){
      for(int i = 0;i<10;i++){
        System.out.println("Tafera #1");
        try{
            Thread.sleep(100);
          }catch (Exception e){}
      }
      
    }
  }