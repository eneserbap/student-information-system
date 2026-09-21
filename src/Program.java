import java.util.UUID;

public class Program {
    private UUID id;
    private String code;
    private String name;
    private UUID departmentId;
    private DegreeLevel degreeLevel;
    private int totalCredits;
    private int durationYears;
    private String language;
    private boolean isActive;

    public Program(UUID id, String code, String name, UUID departmentId, DegreeLevel degreeLevel, int totalCredits, int durationYears, String language, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
        this.degreeLevel = degreeLevel;
        this.totalCredits = totalCredits;
        this.durationYears = durationYears;
        this.language = language;
        this.isActive = isActive;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public UUID getDepartmentId() { return departmentId; }
    public void setDepartmentId(UUID departmentId) { this.departmentId = departmentId; }

    public DegreeLevel getDegreeLevel() { return degreeLevel; }
    public void setDegreeLevel(DegreeLevel degreeLevel) { this.degreeLevel = degreeLevel; }

    public int getTotalCredits() { return totalCredits; }
    public void setTotalCredits(int totalCredits) { this.totalCredits = totalCredits; }

    public int getDurationYears() { return durationYears; }
    public void setDurationYears(int durationYears) { this.durationYears = durationYears; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", degreeLevel=" + degreeLevel +
                ", totalCredits=" + totalCredits +
                ", durationYears=" + durationYears +
                ", language='" + language + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
