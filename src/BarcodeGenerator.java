import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.impl.pdf417.PDF417Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

public class BarcodeGenerator {

//    public void generatePDF417Barcode(String data) {
//        // Configurações do PDF417
//        PDF417Bean bean = new PDF417Bean();
//        final int dpi = 300;
//
//        // Configurações da imagem
//        try (FileOutputStream out = new FileOutputStream("output.png")) {
//            BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", dpi,
//                    BufferedImage.TYPE_BYTE_BINARY, false, 0);
//
//            // Geração do código de barras
//            bean.generateBarcode(canvas, data);
//
//            // Finaliza a geração
//            canvas.finish();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public void generateCode128Barcode(String data) {
//        // Configurações do Code 128
//        Code128Bean bean = new Code128Bean();
//        final int dpi = 108;
//
//        // Configurações da imagem
//        try (FileOutputStream out = new FileOutputStream("barcode128.png")) {
//            BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", dpi,
//                    BufferedImage.TYPE_BYTE_BINARY, false, 0);
//
//            // Configurações adicionais para Code 128
//            bean.setModuleWidth(1);
//            bean.doQuietZone(false);
//
//            // Geração do código de barras Code 128
//            bean.generateBarcode(canvas, data);
//
//            // Finaliza a geração
//            canvas.finish();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void generateCode128Barcode(String data) {
        // Configurações do Code 128
        Code128Bean bean = new Code128Bean();
        final int dpi = 108;

        // Configurações da imagem
        int width = 2; // Largura desejada
        int height = 20; // Altura desejada

//        // Configurações adicionais para Code 128
//        bean.setModuleWidth(108); // Ajuste a largura do módulo conforme necessário
//        bean.setHeight(height);

        try (FileOutputStream out = new FileOutputStream("barcode128.png")) {
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(out, "image/png", dpi,
                    BufferedImage.TYPE_BYTE_BINARY, false, 0);

            // Configurações adicionais para Code 128
            bean.setModuleWidth(width);
            bean.setHeight(height);

            // Geração do código de barras Code 128
            bean.generateBarcode(canvas, data);

            // Ajusta a altura da imagem
            //canvas.establishDimensions(width, height);

            // Finaliza a geração
            canvas.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
