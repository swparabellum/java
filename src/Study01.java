public class Study01 {
    public static void main(String[] args) {
        Study01 std = new Study01();

        for (int i = 1; i < 6; i++) {
            for( int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        std.dd();
        
    }
    
    public void dd(){
        for(int i=1; i<10;i++){

            for(int j=1;j<10;j++){
                if(i % 2 ==0){
                    System.out.print(i+" * "+j+" = "+(i*j)+", ");
                }
            }
            System.out.println("");
        }
    }
}
