package SalaryIncrease;

 class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private double salary;
     Person(String s, String s1, int i, double salary) {
        this.firstName =s;
        this.lastName =s1;
        this.age = i;
        this.salary = salary;
    }



    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",this.getFirstName(),this.lastName,this.salary);
    }

      void increaseSalary(double bonus) {
         if(this.age<30){
             bonus/=2;
         }
         this.salary += this.salary*bonus/100;
     }
 }
