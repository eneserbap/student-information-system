import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Student {
    private UUID id;
    private String studentNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private String email;
    private String phone;
    private String address;
    private UUID programId;
    private int enrollmentYear;
    private int classYear;
    private StudentStatus status;
    private String photoUrl;
    private LocalDateTime createdAt;

    public Student(UUID id, String studentNo, String nationalId, String firstName, String lastName, LocalDate birthDate, Gender gender, String email, String phone, String address, UUID programId, int enrollmentYear, int classYear, StudentStatus status, String photoUrl, LocalDateTime createdAt) {
        this.id = id;
        this.studentNo = studentNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.programId = programId;
        this.enrollmentYear = enrollmentYear;
        this.classYear = classYear;
        this.status = status;
        this.photoUrl = photoUrl;
        this.createdAt = createdAt;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public UUID getProgramId() { return programId; }
    public void setProgramId(UUID programId) { this.programId = programId; }

    public int getEnrollmentYear() { return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }

    public int getClassYear() { return classYear; }
    public void setClassYear(int classYear) { this.classYear = classYear; }

    public StudentStatus getStatus() { return status; }
    public void setStatus(StudentStatus status) { this.status = status; }

    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public String toString() {
        return "Öğrenci Bilgileri:\n" +
                "  ID         : " + id + "\n" +
                "  Öğrenci No : " + studentNo + "\n" +
                "  Ad         : " + firstName + "\n" +
                "  Soyad      : " + lastName + "\n" +
                "  Durum      : " + status;
    }
}
