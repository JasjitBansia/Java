class factorial{
    public static void main(String args[]){
        int i = 5;
        int factorial = 1;
        for(int n = 1; n<= i; n++){
            factorial *= n;
        }
        System.out.print(factorial);
    }
}