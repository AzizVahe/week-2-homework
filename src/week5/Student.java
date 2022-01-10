package week5;

public class Student {
    private String firstName;
    private String email;
    private int age;

        public void setFirstName (String firstName){
            boolean t = true;
            if(firstName.charAt(0) < 'A' || firstName.charAt(0) > 'Z'){
                t = false;
            }
            for (int i = 1; i < firstName.length(); i++) {
                if(firstName.charAt(i) < 'a' || firstName.charAt(i) > 'z'){
                    t = false;
                    break;
                }
            }
            if (t){
                this.firstName = firstName;
            }else {
                System.out.println("Please set correct value");
            }
        }
    }
