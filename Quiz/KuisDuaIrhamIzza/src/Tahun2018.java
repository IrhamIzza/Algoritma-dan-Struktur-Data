
public class Tahun2018<Ta> {

    Ta data;
    Tahun2018<Ta> next;

    public Tahun2018(Ta data, Tahun2018<Ta> next) {
        this.data = data;
        this.next = next;
    }
}
