public class study06 {
    public static void main(String[] args) {
        info inf = new dog();
        info inf2 = new cat();
        System.out.println(inf.sp());
        System.out.println(inf2.sp());
    }
}


class dog implements info{

    @Override
    public String sp() {
        return "dog";
    }

    @Override
    public String sound() {
        return "bow";
    }

}

class cat implements info{

    @Override
    public String sp() {
        return "cat";
    }

    @Override
    public String sound() {
        return "mow";
    }
    
}

interface info{
String sp();
String sound();

}