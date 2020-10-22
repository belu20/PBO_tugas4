public class mainshallow {
    public static void main(String args[]) {
        mainshallow main = new mainshallow();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        product produksi = new product("makinyos","sulatap","indonesia","43152");
        categories maicih = new categories("makanan", "singkong", produksi);

        categories yasmin = new categories(maicih.getJenis(),maicih.getBahan(),maicih.getProduksi());

        yasmin.setJenis("minuman");
        yasmin.setBahan("air");
        //address.setCity("Bandung");
        yasmin.getProduksi().setCountry("Purwakarta");
        System.out.println(maicih);
        System.out.println(yasmin);
    }
    }


