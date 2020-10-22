public class DCMainInterface {

        public static void main(String args[]) {
            DCMainInterface main = new DCMainInterface();
            main.testCase();
        }

        public void testCase() {
            product produksi= new product ("makinyos","sulatap","indonesia","43152");
             categories maicih = new categories("makanan", "singkong", produksi);
            categories yasmin = (categories) maicih.clone();

            yasmin.getProduksi().setCountry("Jalan Cisarua");
            yasmin.setJenis("minuman");
            yasmin.setBahan("Air");

            System.out.println(maicih);
            System.out.println(yasmin);
        }

}
