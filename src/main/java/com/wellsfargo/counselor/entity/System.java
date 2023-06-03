import jakarta.persistence.*;

@Entity
public class SystemStatus {

    @Id
    @GeneratedValue()
    private long systemId;

    @OneToOne(mappedBy = "systemStatus")
    private Client client;

    @Column(nullable = false)
    private boolean uptime;

    @Column(nullable = false)
    private String timestamp;

    @Column(nullable = false)
    private String dashboardConfig;

    @Column(nullable = false)
    private String backendFramework;

    protected SystemStatus() {

    }

    public SystemStatus(Client client, boolean uptime, String timestamp, String dashboardConfig, String backendFramework) {
        this.client = client;
        this.uptime = uptime;
        this.timestamp = timestamp;
        this.dashboardConfig = dashboardConfig;
        this.backendFramework = backendFramework;
    }

    public long getSystemId() {
        return systemId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isUptime() {
        return uptime;
    }

    public void setUptime(boolean uptime) {
        this.uptime = uptime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
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
}
