import java.io.Serializable;
public class categories implements Serializable, Cloneable {
    private String jenis;
    private String bahan;
    private product produksi;

    public categories(categories nama) {
        this(nama.getJenis(), nama.getBahan(), new product(nama.getProduksi()));
    }

    public categories(String jenis, String bahan, product produksi) {
        this.jenis = jenis;
        this.bahan = bahan;
        this.produksi = produksi;
    }
    public Object clone() {
        categories nama = null;
        try {
            nama = (categories) super.clone();
        } catch (CloneNotSupportedException e) {
            nama = new categories(
                    this.getJenis(), this.getBahan(), this.getProduksi());
        }
        nama.produksi = (product) this.produksi.clone();
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public product getProduksi() {
        return produksi;
    }

    public void setProduksi(product produksi) {
        this.produksi = produksi;
    }

    @Override
    public String toString() {
        return "categories{" +
                "jenis='" + jenis + '\'' +
                ", bahan='" + bahan + '\'' +
                ", produksi=" + produksi +
                '}';
    }
}
