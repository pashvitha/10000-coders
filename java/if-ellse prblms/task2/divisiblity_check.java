class divisibilty_check {

    // Method to check divisibility by 5
    public boolean isDivisibleBy5(int num) {

        if(num % 5 == 0){
            return true;   // divisible
        } else {
            return false;  // not divisible
        }
    }

    public static void main(String[] args) {

        divisibilty_check obj = new divisibilty_check();

        System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(15));
    }
}