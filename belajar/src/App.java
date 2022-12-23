class Hero {
    protected String nama;
    protected int armor;
    protected int basisDarah;

    Hero(String nama, int armor) {
        this.nama = nama;
        this.armor = armor;
        this.basisDarah = 100;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

}

class jarakDekat extends Hero {
    private int add;

    jarakDekat(String nama, int armor) {
        super(nama, armor);
        this.add = 20;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    void setdarah(int basisDarah) {
        this.basisDarah = 100;
    }

    void totalDarah(int armor, int darah) {
        add = armor + add + basisDarah;
    }

    void display1() {
        System.out.println("nama : " + nama);
        System.out.println("armor : " + armor);
        System.out.println("total darah : " + add);
    }
}

class jarakJauh extends Hero {
    private int min;

    jarakJauh(String nama, int armor) {
        super(nama, armor);
        this.min = 30;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    void setdarah(int basisDarah) {
        this.basisDarah = 100;
    }

    void totalDarah(int armor, int darah) {
        min = armor - min + basisDarah;
    }

    void display() {
        System.out.println("nama : " + nama);
        System.out.println("armor : " + armor);
        System.out.println("total darah : " + min);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        jarakDekat dekat1 = new jarakDekat(null, 0);
        jarakJauh jauh1 = new jarakJauh(null, 20);
        dekat1.setNama("acung");
        dekat1.setArmor(20);
        dekat1.totalDarah(50, 100);
        dekat1.display1();

        System.out.println("================");

        jauh1.setNama("maftuh");
        jauh1.setArmor(30);
        jauh1.totalDarah(20, 100);
        jauh1.display();

    }
}
