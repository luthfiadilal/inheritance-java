class SepedaGunung extends Sepeda {
    int setSadel;

    public void setSadel(int nilaiSadel) {
        setSadel = nilaiSadel;
        System.out.println("Tinggi sadel : " + setSadel);
    }
}

class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sepedaku = new SepedaGunung();
        sepedaku.tambahKecepatan(10);
        sepedaku.ubahGir(2);
        sepedaku.setSadel(20);
    }
}