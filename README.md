# Polymorphism_Java

- Create a new project in IntelliJ with a Main class with a main method
- Create a Parent class with a protected String firstName and protected String lastName instance variables. Let IntelliJ generate an empty constructor (a constructor with no parameters), getter and setter methods. Also write a method that returns the full name (first name concatinated with the last name).
- Create a Child class that extends the Parent class. The Child class should have a private String middleName instance variable. Let IntelliJ generate n empty constructor (a constructor with no parameters), getter and setter methods. Modify the toString method to print all three variables. Also override the method that returns the full name that includes the middle name.
- In main do the following:
````
Parent parent = new Parent();
parent.setFirstName("funky");
parent.setLastName("monkey");
System.out.println(parent.getFullName());

Child child = new Child();
child.setFirstName("ana");
child.setMiddleName("bobana");
child.setLastName("banana");
System.out.println(child.getFullName());
````