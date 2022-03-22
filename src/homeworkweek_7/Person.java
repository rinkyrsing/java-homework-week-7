package homeworkweek_7;

public class Person {
    // Instance variables
    String firstName;
    String lastName;
    int age=0;

    public static void main(String[] args) {

        // Calling 1st method
        Person per = new Person(); // object to call method
        per.setFirstName(""); //set the value of the first name field
        per.setLastName("");  //set the value of the last name field
        per.setAge(10);    //set the value of the age field
        System.out.println("age: " + per.getAge());
        System.out.println("fullName = " + per.getFullName());
        System.out.println("teen = " + per.isTeen());
        per.setFirstName("john"); // first name is set to john
        per.setAge(18);
        System.out.println("fullName = "+ per.getFullName());
        System.out.println("teen = " + per.getFullName());
        per.setLastName("Smith"); // last name is set to smith
        System.out.println("fullName = " + per.getFullName());
        System.out.println("");

    }

    public String getFirstName() {
    //return key word return the value after execution is completed.
        return firstName;
    }

    public void setFirstName(String fname) {

    /* Method with one parameter
     This key word to refer current class instance variable */
        this.firstName = fname;
    }

    public String getLastName() {
    //return key word return the value after execution is completed.
        return lastName;
    }

    public void setLastName(String lname) {
    // this key word to refer current class instance variable
        this.lastName = lname;
    }

    public int getAge() {
    //return key word return the value after execution is completed.
     return age;
    }

    public void setAge(int a){
        if(a < 0 || a > 100)
        {
            a = 0;
        }
        // this key word to refer current class instance variable
        this.age = a;
    }
    public boolean isTeen(){
        if(age >12 && age < 20)
        {
            return true;
        }else
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
           return firstName +" " + lastName;
        }
    }


}
