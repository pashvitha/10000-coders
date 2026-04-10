class MyClass {

    // Method to find greater number
    public int findGreater(int num1, int num2) {

        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        System.out.println("Greater number (10, 25): " + obj.findGreater(10, 25));
    }
}