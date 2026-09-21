<div align="center">
  
# 🎓 Öğrenci Bilgi Sistemi (Student Information System)
  
**Software Design and Architecture (SDA) - Ödev 1**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Architecture-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-v1.0_Active-brightgreen?style=for-the-badge)

</div>

---

## 📝 Proje Hakkında

Bu proje, bir üniversitenin **Öğrenci Bilgi Sistemini (SIS)** modellemek için tasarlanmıştır. Verilen veritabanı şemasına (ER Diagram) sadık kalınarak, tamamen **Nesne Yönelimli Programlama (OOP)** prensipleri doğrultusunda geliştirilmiştir.

> 💡 **Sürüm Notu:** Bu depo (repository), dönem boyunca hocamızın vereceği yeni ödevler ve projeye eklenecek yeni özelliklerle (veritabanı bağlantıları vb.) sürekli olarak güncellenecektir. Şu anki sürüm temel altyapıyı içermektedir.

---

## 🌟 Özellikler (Sürüm 1.0)

Şu anki ilk sürüm, projenin temel çekirdek yapısını barındırmaktadır:

- 🧱 **Tam Kapsamlı OOP Mimarisi:** İstenildiği gibi tüm sınıflar katı bir şekilde `private` alanlar, `getter/setter` metodları ve yapıcı (constructor) bloklar kullanılarak inşa edildi.
- 🔗 **Yabancı Anahtar (Foreign Key) Simülasyonu:** Tablolar arası ilişkiler için Java'nın yerleşik `java.util.UUID` sınıfı kullanılarak gerçekçi bir ID yönetimi sağlandı.
- 📜 **Ayrıştırılmış Enum Yapıları:** Veri tutarlılığını sağlamak adına `Gender`, `CourseType`, `StudentStatus` gibi sabitler kendi özel Enum sınıflarına ayrıştırıldı.
- 💻 **İnteraktif CLI Menüsü:** Kullanıcı dostu, Switch-Case tabanlı bir terminal arayüzü ile sistem yönetimi kolaylaştırıldı.
- 👥 **Öğrenci Kayıt Simülasyonu:** `ArrayList` veri yapısı kullanılarak sisteme dinamik olarak öğrenci eklenebilir ve eklenen öğrenciler temiz bir formatta (alt alta) listelenebilir hale getirildi.

---

## 📂 Proje Hiyerarşisi

Sistemde bulunan temel varlıklar (Entities) ve proje yapısı şu şekildedir:

```text
📦 src
 ┣ 🏛️ Varlık Sınıfları (Entities)
 ┃ ┣ 📄 AcademicTerm.java
 ┃ ┣ 📄 Course.java
 ┃ ┣ 📄 CoursePrerequisite.java
 ┃ ┣ 📄 Department.java
 ┃ ┣ 📄 Faculty.java
 ┃ ┣ 📄 Instructor.java
 ┃ ┣ 📄 Program.java
 ┃ ┣ 📄 ProgramCourse.java
 ┃ ┗ 📄 Student.java
 ┃
 ┣ 🏷️ Sabitler (Enums)
 ┃ ┣ 📄 CourseType.java
 ┃ ┣ 📄 DegreeLevel.java
 ┃ ┣ 📄 Gender.java
 ┃ ┣ 📄 InstructorTitle.java
 ┃ ┣ 📄 PrerequisiteType.java
 ┃ ┣ 📄 Semester.java
 ┃ ┗ 📄 StudentStatus.java
 ┃
 ┗ 🚀 Çalıştırıcı
   ┗ 📄 Main.java
```

---

## 🚀 Kurulum ve Çalıştırma

Projeyi herhangi bir IDE kullanmadan doğrudan terminalinizde (komut satırı) çalıştırmak isterseniz aşağıdaki adımları izleyebilirsiniz:

**1. Kodları Derleyin (Compile):**
```bash
javac -d out src/*.java
```

**2. Programı Başlatın:**
```bash
java -cp out Main
```

---
<div align="center">
Gelecek güncellemelerde görüşmek üzere! 🚀
</div>
