package entities;

public class Guest {
    private String name;
    private int room;
    private String email;

    public Guest(String name, int room, String email) {
        this.name = name;
        this.room = room;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Name: " + name
                +"Email: "
                +email
                +"Room: "
                +room;
    }

}
