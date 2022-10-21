public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avagere;
    boolean isPass;
    Student(String name,String stuNo,String classes,Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avagere=0.0;
        this.isPass=false;

    }
    void addBulkExamNout(int note1,int note2,int note3){
        this.c1.note=note1;
        this.c2.note=note2;
        this.c3.note=note3;
    }
    void isPass(){
        this.avagere=(this.c1.note+this.c2.note+this.c3.note)/3.00;
        if(this.avagere>=50){
            System.out.println("Dersi Geçtiniz.");
        }else{
            System.out.println("Kaldınız.");
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name+"Notu:"+this.c1.note);
        System.out.println(c2.name+"Notu:"+this.c2.note);
        System.out.println(c3.name+"Notu:"+this.c3.note);
        System.out.println("Ortalamanız:"+this.avagere);
    }
}
