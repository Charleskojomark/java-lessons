public class EqualityExample {

    public static  void main(String[] args) {
        // Primitive type equality
        int num1 = 3, num2 = 3;
        boolean equalityCheck = (num1 == num2);
        System.out.println("Primitive equality: " + equalityCheck);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        boolean nextEqualityCheck = (customer1 == customer2);
        System.out.println("Reference quality: " + nextEqualityCheck);
    }
}

class Customer {

}