import java.util.Objects;
public class Books {
    private String bname;
    private String bauth;
    private int price;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.bname);
        hash = 37 * hash + Objects.hashCode(this.bauth);
        hash = 37 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Books other = (Books) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.bname, other.bname)) {
            return false;
        }
        if (!Objects.equals(this.bauth, other.bauth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Books{" + "bname=" + bname + ", bauth=" + bauth + ", price=" + price + '}';
    }

    public Books(String bname, String bauth, int price) {
        this.bname = bname;
        this.bauth = bauth;
        this.price = price;
    }

    
}
