//number increasing pyramid

class ReversPattern {
    static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=n;i>=1;i--){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();  //print new line for each row
        }
    }

    public static void main(String args[]){
        int n = 5;
        ReversPattern.printNumber(n);
    }
}
