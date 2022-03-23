package data;

public class LaptopApp {
    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("  OUTPUT  ");
        System.out.println("==========");
        Laptop laptop1 = new Laptop();
        System.out.println("\nNama        : "+laptop1.getNama());
        System.out.println("Brand       : "+laptop1.getBrand());
        System.out.println("Processor   : "+laptop1.getProcessor());
        System.out.println("Jumlah Core : "+laptop1.getJumlahCore());
        System.out.println("OS          : "+laptop1.getOS());
        System.out.println("RAM         : "+laptop1.getRAM());
        System.out.println("Storage     : "+laptop1.getStorage());
        System.out.println("Stok        : "+laptop1.getStok()+"\n");
        
        Laptop laptop2 = new Laptop("Acer Helios", "Acer", "Intel Core i7-8750H", 
                "6 Core", "Windows 11", "16GB", "SSD SATA", 2);
        System.out.println(laptop2);
    }
}
