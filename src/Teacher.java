public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
        void print(){
            System.out.println("Öğretmen Adı:"+this.name);
            System.out.println("Tel no:"+this.mpno);
            System.out.println("Ders Adı: "+this.branch);
        }

}
