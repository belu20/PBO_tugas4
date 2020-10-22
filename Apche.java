import java.io.Serializable;
public class Apche implements Serializable, Cloneable{
    public static void main(String args[]) {
        Apche main = new Apche();
        main.whenModifyingOriginalObject_thenApcheCloneShouldNotChange();
    }
        public void whenModifyingOriginalObject_thenApcheCloneShouldNotChange() {
            product produksi = new product("makinyos","sulatap","indonesia","43152");
            categories kategori = new categories("makanan", "singkong", produksi);
            categories deepCopy = (categories) kategori.clone();

            produksi.setCountry("jakarta");
            deepCopy.getProduksi().getCountry();
            kategori.getProduksi().getCountry();
            System.out.println(kategori);
        }

    }
