import java.util.UUID;

public class Course {
    private UUID id;
    private String code;
    private String name;
    private UUID departmentId;
    private int credits;
    private int theoryHours;
    private int labHours;
    private CourseType courseType;
    private String language;
    private String description;
    private boolean isActive;

    public Course(UUID id, String code, String name, UUID departmentId, int credits, int theoryHours, int labHours, CourseType courseType, String language, String description, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
        this.credits = credits;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.courseType = courseType;
        this.language = language;
        this.description = description;
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

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public int getTheoryHours() { return theoryHours; }
    public void setTheoryHours(int theoryHours) { this.theoryHours = theoryHours; }

    public int getLabHours() { return labHours; }
    public void setLabHours(int labHours) { this.labHours = labHours; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", courseType=" + courseType +
                '}';
    }
}
