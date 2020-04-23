
public class Tahun2020<Ta> {

    Ta data;
    Tahun2020<Ta> next;

    public Tahun2020(Ta data, Tahun2020<Ta> next) {
        this.data = data;
        this.next = next;
    }
}
