package br.inatel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        //escolhendo o arquivo a ser codificado
        // Path caminho = Paths.get(ClassLoader.getSystemResource("Sandy_Com-Voce-sempre.mp3").toURI());
        //Path caminho = Paths.get(ClassLoader.getSystemResource("C209l2.png").toURI());
        Path caminho = Paths.get(ClassLoader.getSystemResource("Sandy-e-Junior.jpg").toURI());

        //codificado arquivo para base64
        String encodingsString = encodeFileToBase64Binary(caminho);

        //decodificando Base64 em arquivo
        decodedBase64StringtoFile(encodingsString);
    }

    private static String encodeFileToBase64Binary(Path path) {
        String encodedfile = null;
        try {
            // Instanciando um arquivo
            String caminho = String.valueOf(path);
            File file = new File(caminho);
            FileInputStream fileInputStreamReader = new FileInputStream(file);

            // instancia o arquivo em bytes
            byte[] bytes = new byte[(int) file.length()];
            fileInputStreamReader.read(bytes);

            //codificando
            encodedfile = Base64.getEncoder().encodeToString(bytes);

            //printar string Base64
            System.out.println(encodedfile);

        } catch (FileNotFoundException e) {
            //verificar se o arquivo foi encontrado
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            //verificar erros no processo
            e.printStackTrace();
        }
        //retorna o arquivo codificado em string
        return encodedfile;
    }

    private static void decodedBase64StringtoFile(String encodedfile) {
        try {
            //decodificando o arquivo
            byte imageByte[] = Base64.getDecoder().decode(encodedfile);

            // escolhendo local para salvar a String decodificada e nome do arquivo
            //FileOutputStream outputStream = new FileOutputStream("d:/tmp.mp3");
            FileOutputStream outputStream = new FileOutputStream("d:/tmp.jpg");
            //FileOutputStream outputStream = new FileOutputStream("d:/tmp.png");

            //escreve o arquivo
            outputStream.write(imageByte);
            outputStream.close();

        } catch (IOException e) {
            //verificar erros no processo
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}