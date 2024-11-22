public class Study01 {
    public static void main(String[] args) {

        Study01 std = new Study01();
        /*



        std.dd();
         

         String [] a = new String[10];
         for(int i=0;i<10;i++){
            if(i%2==0){
                a[i] = "O";
            }else{
                a[i] = "X";
            }
         }
        
        //System.out.println(a);

         String [][] b = new String[5][3];

         for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 3; j++){
                if(j==1){
                    b[i][j] = (i%2 == 0) ? "X" : "O" ;
                }else{
                    b[i][j] = (i%2 == 0) ? "O" : "X" ;
                }
                System.out.print(b[i][j]);
            }
            System.out.println();
         }

         

         for (int i = 1; i < 6; i++) {
            for( int j = 6; j>i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
            */

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
