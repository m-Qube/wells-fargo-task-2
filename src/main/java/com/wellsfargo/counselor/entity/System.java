import jakarta.persistence.*;

@Entity
public class SystemStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemId;

    @Column(nullable = false)
    private double uptime;

    @Column(nullable = false)
    private long timestamp;

    @Column(nullable = false)
    private String dashboardConfig;

    @Column(nullable = false)
    private String backendFramework;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructor
    public SystemStatus(double uptime, long timestamp, String dashboardConfig, String backendFramework) {
        this.uptime = uptime;
        this.timestamp = timestamp;
        this.dashboardConfig = dashboardConfig;
        this.backendFramework = backendFramework;
    }

    // Getters and Setters
    public Long getSystemId() {
        return systemId;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDashboardConfig() {
        return dashboardConfig;
    }

    public void setDashboardConfig(String dashboardConfig) {
        this.dashboardConfig = dashboardConfig;
    }

    public String getBackendFramework() {
        return backendFramework;
    }

    public void setBackendFramework(String backendFramework) {
        this.backendFramework = backendFramework;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
