public class study04 {
    public static void main(String[] args) {

        
        S04_1 s04_1 = new S04_1();
        s04_1.run();
        S04_2 s04_2 = new S04_2();
        s04_2.run();

        s04_2.doWork(s04_1, s04_2);

    }
}

class S04{

    public void run(){
        System.out.println(this+" hi! ");
    }
}

class S04_1 extends S04{
    public void S04_1(){
    }

    public void doWork(S04_1 s04_1, S04_2 s04_2){
        s04_1.run();
        s04_2.doWork(s04_1, s04_2);
    }
}

class S04_2 extends S04{
    public void S04_2(){

    }

    public void doWork(S04_1 s04_1, S04_2 s04_2){
        s04_2.run();
        s04_1.doWork(s04_1, s04_2);
    }
}