public class array {    String o = "O";
String x = "X";
public static void main(String[] args) {
    array myClass = new array();
    // 2차원 배열에 값 넣기
    String[][] Q1 = myClass.Q1value();
    String[][] Q3 = myClass.Q3();
    // 2차원 배열에 있는 값 확인
    //myClass.showArray(Q3);
    myClass.Q4();
}


private String[][] Q1value() {
    String[][] Q1 = new String[10][10];
    for (int i = 0; i < Q1.length; i++) {
        for (int j = 0; j < Q1[i].length; j++) {
            if(j <= i) {
                Q1[i][j] = o;
            } else {
                Q1[i][j] = x;
            }
        }
    }
    return Q1;
}


private void showArray(String[][] ar) {
    for(int i = 0; i < ar.length; i++) {
        for(int j = 0; j < ar[i].length; j++) {
            System.out.print(ar[i][j]);
        }
        System.out.println();
    }
}

private String[][] Q3() {
    String[][] 문제3 = new String[10][10];
    for(int i = 0; i < 문제3.length; i++) {
        for(int j = 0; j < 문제3[i].length; j++) {
            // 0 ~ 8   < 9   (10 - 1) 행 = 0
            // 0 ~ 7   < 8   (10 - 2) 행 = 1
            // 0 ~ 6   < 7   (10 - 3) 행 = 2
            if(j < 문제3[i].length - (i+1)) {
                문제3[i][j] = x;
            } else {
                문제3[i][j] = o;
            }
        }
    }
    return 문제3;
}

private void Q4(){

    for(int i=1; i<= 10; i++){
         for(int j = 10; i<j; j--){
            System.out.print("*");
         }
         System.out.println();
    }

}


}
