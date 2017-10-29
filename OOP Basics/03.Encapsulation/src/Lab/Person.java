package Lab;

 class Person {

    private String firstName;
    private String lastName;
    private Integer age;

     Person(String s, String s1, int i) {
        this.firstName =s;
        this.lastName =s1;
        this.age = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %s years old.",this.getFirstName(),this.lastName,this.getAge());
    }
}
