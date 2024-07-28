//number increasing pyramid

class Pattern {
    static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=1;i<=n;i++){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();  //print new line for each row
        }
    }

    public static void main(String args[]){
    int n = 5;
    Pattern.printNumber(n);
    }
}
