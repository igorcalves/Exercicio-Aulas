package Lambdas;

class Threads {
    public static void main(String[] args) {
      Runnable t1 = new Trabalho1();
      Runnable t2 = new Runnable(){
        
        public void run(){
          for(int i = 0;i<10;i++){
        System.out.println("Tafera #2");
            try{
            Thread.sleep(100);
          }catch (Exception e){}
      }
      
        }
      };
      
      
      Runnable t3 = Threads::trabalho3;
      Thread t11 = new Thread(t1);
      Thread t22 = new Thread(t2);
      Thread t33 = new Thread(t3);
      t11.start();
      t22.start();
      t33.start();
    }
    
    static void trabalho3(){
      for(int i = 0;i<10;i++){
        System.out.println("Tafera #3");
            try{
            Thread.sleep(100);
          }catch (Exception e){}
      }
        
    }
  }