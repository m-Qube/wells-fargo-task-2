import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    // Constructor
    public Client(Advisor advisor, String name, String email, String phone) {
        this.advisor = advisor;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
