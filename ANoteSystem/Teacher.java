package ANoteSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher (String name,String mpno,String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

        void print() {
            System.out.println("Öğretmen: "+this.name+"\nBranşı: "+this.branch+"\nNumarası: "+this.mpno);


        }

}
