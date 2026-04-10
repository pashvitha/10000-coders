
class vote_eligible {

    // Method to check voting eligibility
    public boolean canVote(int age) {

        if(age >= 18){
            return true;   // eligible
        } else {
            return false;  // not eligible
        }
    }

    public static void main(String[] args) {

        vote_eligible obj = new vote_eligible();

        System.out.println("Can vote (Age 20)? " + obj.canVote(20));
    }
}