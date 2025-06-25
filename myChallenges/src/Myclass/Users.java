package Myclass;
import java.util.Objects;

public class Users {
    private String username;
    private String email;
    private int id;

    // Construtor
    public Users(String username, String email, int id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mesma referência
        if (obj == null || getClass() != obj.getClass()) return false;

        Users other = (Users) obj;
        return id == other.id &&
               Objects.equals(username, other.username) &&
               Objects.equals(email, other.email);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(username, email, id);
    }
}
