package br.com.mariojp.solid.isp;


public class MultiFunctionPrinter implements MultiFunctionDevice {
    @Override
    public void print(String content) {
        System.out.println("Imprimindo: " + content);
    }

    @Override
    public void scan(String targetFile) {
        System.out.println("Digitalizando para: " + targetFile);
    }
}
