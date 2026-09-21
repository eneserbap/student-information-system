import java.util.UUID;

public class ProgramCourse {
    private UUID id;
    private UUID programId;
    private UUID courseId;
    private int semesterOrder;
    private CourseType courseType;
    private boolean isActive;

    public ProgramCourse(UUID id, UUID programId, UUID courseId, int semesterOrder, CourseType courseType, boolean isActive) {
        this.id = id;
        this.programId = programId;
        this.courseId = courseId;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.isActive = isActive;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getProgramId() { return programId; }
    public void setProgramId(UUID programId) { this.programId = programId; }

    public UUID getCourseId() { return courseId; }
    public void setCourseId(UUID courseId) { this.courseId = courseId; }

    public int getSemesterOrder() { return semesterOrder; }
    public void setSemesterOrder(int semesterOrder) { this.semesterOrder = semesterOrder; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return "ProgramCourse{" +
                "id=" + id +
                ", programId=" + programId +
                ", courseId=" + courseId +
                ", semesterOrder=" + semesterOrder +
                ", courseType=" + courseType +
                '}';
    }
}
