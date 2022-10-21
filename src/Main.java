public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mame","213","TRH");
        Teacher t2=new Teacher("Bakır","4354","Fzk");
        Teacher t3=new Teacher("Furkan","564","MAT");
        Course tarih= new Course("Tarih","123","TRH");
        tarih.addTeacher(t1);
        Course fizik= new Course("Fizik","234","FZK");
        fizik.addTeacher(t2);
        Course matamatik=new Course("Matematik","789","MAT");
        matamatik.addTeacher(t3);
        Student s1=new Student("Ertuğrul","290","4",tarih,fizik,matamatik);
        s1.addBulkExamNout(100,90,80);
            s1.isPass();

    }
}