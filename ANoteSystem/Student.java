package ANoteSystem;

public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;

    double avarage;
    boolean isPass;
    Student (String name, String stuNo,int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat = mat;
    }
    void addBulkExamNote (int mat,int kimya,int fizik) {
        if (mat <= 100 && mat >= 0) {
            this.mat.note = mat;
        }
        if (kimya <= 100 && kimya >= 0) {
            this.kimya.note = kimya;
        }
        if (fizik <= 100 && fizik >= 0) {
            this.fizik.note = fizik;
        }
    }
   void addBulkLessonNote (int mat,int kimya,int fizik) {
        this.fizik.lesson = fizik;
        this.mat.lesson = mat;
        this.kimya.lesson = kimya;

   }

    void calculateAvarages() {
        this.avarage = (((this.fizik.note+this.mat.note+this.kimya.note)/3.0)*0.8)+
                (((this.fizik.lesson+this.mat.lesson+this.kimya.lesson)/3)*0.2);
    }
    public boolean isCheckPass() {
        calculateAvarages();
        if (this.avarage >= 55) {
            return true;
        } else {
            return false;
        }
    }
    void isPass () {
        calculateAvarages();
        printNote();
        System.out.println("Ortalamanız: "+ this.avarage );
        if (this.mat.note == 0|| this.kimya.note == 0  || this.fizik.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            if (isCheckPass()) {
                System.out.println("Tebrikler, sınıfı geçtiniz.");
            } else {
                System.out.println("Sınıfta kaldınız!");
            }

        }
    }
    void printNote() {
        System.out.println("=================");
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Matematik Notu: "+this.mat.note);
        System.out.println("Fizik Notu: "+this.fizik.note);
        System.out.println("Kimya Notu: "+this.kimya.note);
    }

}
