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

}
