package payroll;

public class Employee {
    String title;
    String Name;
    String ppsID;
    long phone;
    String employmentType;
    int age;

    public Employee() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equalsIgnoreCase("mr") || title.equalsIgnoreCase("mrs")
        || title.equalsIgnoreCase("ms")) {
            this.title = title;
        }else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length()>=3 && name.length() <=25) {
            Name = name;
        }else{
            throw new IllegalArgumentException("Name provided is not valid");
        }
    }

    public String getPpsID() {
        return ppsID;
    }

    public void setPpsID(String ppsID) {
        if(ppsID.length() == 8) {
            this.ppsID = ppsID;
        }else{
            throw new IllegalArgumentException("PPS ID must be 8 characters");
        }
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {

        if(String.valueOf(phone).length() == 9) {
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Phone must be 9 digit number");
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if(employmentType.equalsIgnoreCase("Full-Time")
        || employmentType.equalsIgnoreCase("Part-Time")
        || employmentType.equalsIgnoreCase("Contract")) {
            this.employmentType = employmentType;
        }else{
            throw new IllegalArgumentException("Employment type must be Full-Time, Part-time or Contract");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >16) {
            this.age = age;
        }else{
            throw new IllegalArgumentException("Age must be over 16");
        }
    }
}
