public class array {    String o = "O";
String x = "X";
public static void main(String[] args) {
    array myClass = new array();
    // 2차원 배열에 값 넣기
    String[][] Q1 = myClass.Q1value();
    // 2차원 배열에 있는 값 확인
    myClass.showArray(Q1);
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

}
