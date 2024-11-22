public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World~!");
        int a[] ={1,2,3,4};
        int [] b = new int[3];
        int [] c = new int[] {1,2,3};

        int [][] d = new int[][] {{1,2},{3,4}};
        int [][] d2 = {{1,2}
                    ,{3,4}}; 

        for(int i : c){
            System.out.println(i);
        }
        
    }
}
