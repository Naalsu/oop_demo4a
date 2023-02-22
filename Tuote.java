public class Tuote {
    private String nimi;
    private int saldo;
    private double hinta;

    /**
     * Yksittäisen tuotteen maksimihinta
     */
    public static double MAKSIMIHINTA = 1000000;

    /**
     * Yksittäisen tuotteen maksimisaldo
     */
    public static int MAKSIMISALDO = 10000;

    public Tuote(String nimi, int saldo, double hinta) {
        this.nimi = nimi;
        this.saldo = saldo;
        this.hinta = hinta;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        if (hinta >= 0)
            this.hinta = hinta;
    }
}

