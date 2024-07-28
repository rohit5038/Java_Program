public class Array {
    public static void main(String[] args){
        int[] mycount = {1,5,7,8,63,5}; //int arr initializer

        String[] myarr = new String[5];  //String array with new keyword
        myarr[0] = "mango"; //assign value as per index
        myarr[1] = "apple";
        myarr[2] = "mango";
        myarr[3] = "banana";
        myarr[4] = "mango";

        System.out.println(myarr[4]);   //print value of specified in array
        System.out.println(mycount.length); //print length of array
    }
}
