public class Main {
    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G","P0323A"};
    public static void main(String[] args) {
        ClassExample classExample= new ClassExample();
        for (String classmate: validClass){
            System.out.println(classmate + " is valid " + classExample.validate(classmate) );
        }
        for (String classmate: invalidClass){
            System.out.println(classmate + " is valid " + classExample.validate(classmate));
        }


    }

}
