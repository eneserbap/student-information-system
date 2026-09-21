import java.time.LocalDateTime;
import java.util.UUID;

public class Faculty {
    private UUID id;
    private String code;
    private String name;
    private UUID deanId;
    private String phone;
    private String email;
    private boolean isActive;
    private LocalDateTime createdAt;

    public Faculty(UUID id, String code, String name, UUID deanId, String phone, String email, boolean isActive, LocalDateTime createdAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.deanId = deanId;
        this.phone = phone;
        this.email = email;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public UUID getDeanId() { return deanId; }
    public void setDeanId(UUID deanId) { this.deanId = deanId; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", deanId=" + deanId +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", createdAt=" + createdAt +
                '}';
    }
}
