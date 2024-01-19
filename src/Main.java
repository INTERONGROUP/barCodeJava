public class Main {

    public static void main(String[] args) {
        BarcodeGenerator bc = new BarcodeGenerator();
        //        bc.generatePDF417Barcode("123456789");
        bc.generateCode128Barcode("1234");
        System.out.println("Finish...");
    }

}