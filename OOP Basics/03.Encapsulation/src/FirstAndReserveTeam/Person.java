package FirstAndReserveTeam;

 class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private double salary;



     public void setFirstName(String firstName) {
         if(firstName.length()<3){
             throw new IllegalArgumentException("First name cannot be less than 3 symbols");
         }
         else
         this.firstName = firstName;
     }

     public void setLastName(String lastName) {
         if(lastName.length()<3){
             throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
         }
         else
         this.lastName = lastName;
     }

     public void setAge(Integer age) {
         if(age<=0){
             throw new IllegalArgumentException("Age cannot be zero or negative integer");
         }else
         this.age = age;
     }

     public void setSalary(double salary) {
         if(salary<460){
             throw new IllegalArgumentException("Salary cannot be less than 460 leva");
         }else
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
