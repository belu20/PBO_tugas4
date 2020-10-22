public class DCmaincontructor {
    public static void main(String args[]) {
        DCmaincontructor main = new DCmaincontructor();
        main.testCase();
    }

    public void testCase() {
        product produksi = new product("makinyos","sulatap","indonesia","43152");
      categories maicih = new categories("makanan", "singkong", produksi);
        categories yasmin = new categories(maicih);

        yasmin.getProduksi().setCountry("inggris");
        yasmin.setJenis("minuman");
        yasmin.setBahan("air");

        System.out.println(maicih);
        System.out.println(yasmin);
    }
}
