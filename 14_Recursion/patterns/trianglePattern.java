/*
trianlge1
****
***
**
*

triangle2
*
**
***
****

*/


public class trianglePattern {
public static void main(String[] args) {
    // trianlge1(4, 0);
    triangle2(4, 0);
}
static void trianlge1(int row,int col){
    if (row==0) {
        return;
    }
    if(row>col){
        System.out.print("*");
        trianlge1(row, col+1);
    }
    if (row==col) {
        System.out.println();
        trianlge1(row-1, 0);
    }
}

static void triangle2(int row,int col){
    if(row==0){
        return;
    }
    if(row>col){
        triangle2(row, col+1);
        System.out.print("*");
    }
    if (row==col) {
        triangle2(row-1, 0);
        System.out.println();
    }
}
}
