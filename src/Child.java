public class Child extends Parent {

    private String middleName;

    public Child() {
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String getFullName() {
        return super.getFirstName() + " " + this.middleName + " " + super.getLastName();
    }

    @Override
    public String toString() {
        return "Child{" +
                ", firstName='" + firstName + '\'' +
                "middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
