public class ShowroomMobilAksi {

        public static void main(String[] args){
            ShowroomMobil Honda = new ShowroomMobil();
            Honda.nama = "SUV";
            Honda.merk = "HONDA";
            Honda.harga = 163000000;
            Honda.kategori = "Manual";

            ShowroomMobil Toyota = new ShowroomMobil();
            Toyota.nama = "Veloz";
            Toyota.merk = "Toyota";
            Toyota.harga = 288700000;
            Toyota.kategori = "Manual";

            ShowroomMobil Daihatsu = new ShowroomMobil();
            Daihatsu.nama = "Ayla";
            Daihatsu.merk = "Daihatsu";
            Daihatsu.harga = 134000000;
            Daihatsu.kategori = "Matic";

            System.out.println("================SHOWROOM MOBIL SUKSES=================");
            System.out.println("Sedang ada harga diskon akhir tahun untuk semua mobil");
            System.out.println("======================================================");
            System.out.println("1. Nama Mobil : "+Honda.nama);
            System.out.println("   Merk       : "+Honda.merk);
            System.out.println("   Harga      : Rp."+Honda.harga);
            System.out.println("   Kategori   : "+Honda.kategori);

            Honda.mendapatkanDiskon();
            System.out.println("   Harga Mobil Setelah Mendapatkan Diskon Rp."+Honda.harga);
            System.out.println("======================================================");

            System.out.println("2. Nama Mobil : "+Toyota.nama);
            System.out.println("   Merk       : "+Toyota.merk);
            System.out.println("   Harga      : Rp."+Toyota.harga);
            System.out.println("   Kategori   : "+Toyota.kategori);

            Toyota.mendapatkanDiskon();
            System.out.println("   Harga Mobil Setelah Mendapatkan Diskon Rp."+Toyota.harga);
            System.out.println("=======================================================");

            System.out.println("3. Nama Mobil : "+Daihatsu.nama);
            System.out.println("   Merk       : "+Daihatsu.merk);
            System.out.println("   Harga      : Rp."+Daihatsu.harga);
            System.out.println("   Kategori   : "+Daihatsu.kategori);

            Daihatsu.mendapatkanDiskon();
            System.out.println("   Harga Mobil Setelah Mendapatkan Diskon Rp."+Daihatsu.harga);
            System.out.println("=========================================================");

        }
    }


