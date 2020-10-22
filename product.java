import java.io.Serializable;
public class product implements Serializable, Cloneable{
    private String nama;
    private String PT;
    private String country;
    private String code;

    public product(product produksi) {
        this(produksi.getNama(), produksi.getPT(),produksi.getCountry(),produksi.getCode());
    }

    public product(String nama, String PT, String country, String code) {
        this.nama = nama;
        this.PT = PT;
        this.country = country;
        this.code = code;
    }

    public Object clone() {
        try {
            return (product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new product(this.getNama(), this.getPT(), this.getCountry(), this.getCode());
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPT() {
        return PT;
    }

    public void setPT(String PT) {
        this.PT = PT;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "product{" +
                "nama='" + nama + '\'' +
                ", PT='" + PT + '\'' +
                ", country='" + country + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}