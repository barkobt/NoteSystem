package ANoteSystem;

/*
Öğrenci Not Sistemi
Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()
Teacher Sınıfı Özellikleri :

Nitelikler : name,mpno,branch
Metotlar : Teacher()
Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Ödev
Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
 */
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emir Tufan", "0000", "FZK");
        Teacher t2 = new Teacher("Baran Bozkurt", "00001", "MAT");
        Teacher t3 = new Teacher("Metkan Arslan","00002", "KMY" );

        Course mat = new Course("Matematik", "101", "MAT");
        Course fizik = new Course("Fizik", "101","FZK");
        Course kimya = new Course ("Kimya", "101", "KMY");

        mat.addTeacher(t2);
        fizik.addTeacher(t1);
        kimya.addTeacher(t3);

        Student aybike = new Student("Aybike", "440",4,mat,fizik,kimya);
        aybike.addBulkExamNote(80,20,50);
        mat.printTeacher();
        aybike.addBulkLessonNote(100,100,100);

        aybike.isPass();



    }

}
