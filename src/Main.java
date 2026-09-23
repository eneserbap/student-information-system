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
                            UUID.randomUUID(), // id: Öğrencinin benzersiz sistem kimliği (Rastgele oluşturuldu)
                            no, // studentNo: Kullanıcıdan alınan öğrenci numarası
                            "11122233344", // nationalId: TC Kimlik numarası (Elle girildi)
                            ad, // firstName: Kullanıcıdan alınan isim
                            soyad, // lastName: Kullanıcıdan alınan soyisim
                            LocalDate.of(2000, 1, 1), // birthDate: Doğum tarihi (1 Ocak 2000 olarak elle girildi)
                            Gender.E, // gender: Cinsiyet (Enum tipinden Erkek 'E' olarak elle girildi)
                            ad.toLowerCase() + "." + soyad.toLowerCase() + "@student.edu.tr", // email: Ad ve soyaddan
                                                                                              // otomatik okul maili
                                                                                              // üretildi
                            "5550000000", // phone: Telefon numarası (Elle girildi)
                            "Belirtilmedi", // address: Adres bilgisi (Şimdilik boş bırakıldı)
                            sampleProgramId, // programId: Hangi programa kayıtlı olduğu (Yukarıda rastgele oluşturulan
                                             // ID)
                            2024, // enrollmentYear: Üniversiteye kayıt yılı (2024 olarak elle girildi)
                            1, // classYear: Kaçıncı sınıf olduğu (1. sınıf olarak elle girildi)
                            StudentStatus.AKTIF, // status: Öğrencinin durumu (Enum tipinden 'AKTIF' olarak ayarlandı)
                            "http://example.com/photo.jpg", // photoUrl: Profil fotoğrafı linki (Örnek bir link eklendi)
                            LocalDateTime.now() // createdAt: Sisteme kayıt edilme tarihi ve saati (Şu anki zaman)
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
