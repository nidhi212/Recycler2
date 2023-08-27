package contactModel;

public class ContactModel {
    int pic;
    String name,number;

    public ContactModel(int pic, String name, String number) {
        this.pic = pic;
        this.name = name;
        this.number = number;
    }

    public int getPic() {
        return pic;
    }

    public String getName() {
        return name;
    }

    public String  getNumber() {
        return number;
    }
}
