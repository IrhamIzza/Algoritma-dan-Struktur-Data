

public class Tahun2019<Ta> {

    Ta data;
    Tahun2019<Ta> next;

    public Tahun2019(Ta data, Tahun2019<Ta> next) {
        this.data = data;
        this.next = next;
    }
}
