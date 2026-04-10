class even_odd {

    // Method to check even or odd
    public boolean isEven(int num) {
        if(num % 2 == 0){
            return true;   // even
        } else {
            return false;  // odd
        }
    }

    public static void main(String[] args) {

        even_odd obj = new even_odd();

        System.out.println("Is 10 even? " + obj.isEven(10));
    }
}