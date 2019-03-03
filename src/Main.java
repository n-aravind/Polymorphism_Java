public class Main {

    public static void main(String[] args) {
	// write your code here

        Parent parent = new Parent();
        parent.setFirstName("funky");
        parent.setLastName("monkey");
        System.out.println(parent.getFullName());

        Child child = new Child();
        child.setFirstName("ana");
        child.setMiddleName("bobana");
        child.setLastName("banana");
        System.out.println(child.getFullName());
    }
}
