class postive_neg {

    // Method to check number type
    public String checkNumber(int num) {

        if(num > 0){
            return "Positive";
        }
        else if(num < 0){
            return "Negative";
        }
        else{
            return "Zero";
        }
    }

    public static void main(String[] args) {

        postive_neg obj = new postive_neg();

        System.out.println("Check -5: " + obj.checkNumber(-5));
    }
}
