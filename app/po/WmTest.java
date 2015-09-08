package po;

import javax.persistence.*;

@Entity
@Table(name = "wm_test")
public class WmTest {

    private int id;
    private String name;

    @Id
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
