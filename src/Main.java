import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // öğrencileri tutmak için boş bir liste oluşturdum
        List<Student> studentsList = new ArrayList<>();
        
        // program id'si lazım olur diye rastgele bir tane atadım
        UUID sampleProgramId = UUID.randomUUID();
        
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- Öğrenci Bilgi Sistemi (SIS) ---");
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Öğrencileri Listele");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminiz: ");
            
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("\n--- Yeni Öğrenci Ekleme ---");
                    System.out.print("Öğrenci No: ");
                    String no = scanner.nextLine();
                    
                    System.out.print("Ad: ");
                    String ad = scanner.nextLine();
                    
                    System.out.print("Soyad: ");
                    String soyad = scanner.nextLine();

                    // hocanın istediği diğer kısımları hata vermesin diye şimdilik salladım
                    Student yeniOgrenci = new Student(
                            UUID.randomUUID(),
                            no,
                            "11122233344", // tc'yi elle girdim
                            ad,
                            soyad,
                            LocalDate.of(2000, 1, 1),
                            Gender.E,
                            ad.toLowerCase() + "." + soyad.toLowerCase() + "@student.edu.tr",
                            "5550000000",
                            "Belirtilmedi",
                            sampleProgramId,
                            2024,
                            1,
                            StudentStatus.AKTIF,
                            "http://example.com/photo.jpg",
                            LocalDateTime.now()
                    );
                    
                    // oluşturduğum öğrenciyi yukarıdaki listeye ekledim
                    studentsList.add(yeniOgrenci);
                    System.out.println("✅ Öğrenci başarıyla eklendi!");
                    break;
                    
                case "2":
                    System.out.println("\n--- Sisteme Kayıtlı Öğrenciler ---");
                    // liste boşsa uyarı versin diye bir kontrol ekledim
                    if (studentsList.isEmpty()) {
                        System.out.println("Henüz kayıtlı öğrenci bulunmamaktadır.");
                    } else {
                        // listedeki öğrencileri sırayla gezip ekrana yazdırdım
                        for (Student s : studentsList) {
                            System.out.println(s.toString());
                            System.out.println("---------------------------------");
                        }
                    }
                    break;
                    
                case "3":
                    System.out.println("Sistemden çıkılıyor. İyi günler!");
                    // döngüyü kırıp programı kapatmasını sağladım
                    isRunning = false;
                    break;
                    
                default:
                    System.out.println("❌ Geçersiz seçim! Lütfen 1, 2 veya 3 giriniz.");
                    break;
            }
        }
        
        scanner.close();
    }
}
