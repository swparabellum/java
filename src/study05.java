public class study05 {
    public static void main(String[] args) {
        study05A std5A = new study05A();
        std5A.run();
    }

}

class study05A implements study05IM{

    @Override
    public void run() {
    System.out.println(txt);
    }

}

interface study05IM{
    final String txt = "interface";
    public void run();
}