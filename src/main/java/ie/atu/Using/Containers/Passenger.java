package ie.atu.Using.Containers;

public class Passenger {
    String title,name,id,phone;

    int age;



    public Passenger(String title, String name, String id, String phone, int age) {
     setTitle(title);
      setName(name);
      setId(id);
      setPhone(phone);
      setAge(age);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", age=" + age +
                '}';
    }

    public void setTitle(String title) {
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms"))
        {
            this.title = title;
        }

        else{
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");
        }

    }

    public void setName(String name) {
        if(name.length() >= 3)
    {
        this.name = name;
    }

    else{
        throw new IllegalArgumentException("Minimum of three characters required");
    }
    }

    public void setId(String id) {
        if(id.length() >= 10)
    {
        this.id = id;
    }

    else{
        throw new IllegalArgumentException("Minimum of ten characters required");
    }
    }

    public void setPhone(String phone) {
        if(phone.length() >= 7)
        {
            this.phone = phone;
        }

        else{
            throw new IllegalArgumentException("Minimum of seven characters required");
        }
    }

    public void setAge(int age) {
        if(age > 16)
        {
            this.age = age;
        }

        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }
    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }


}