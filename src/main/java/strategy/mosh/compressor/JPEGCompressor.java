package strategy.mosh.compressor;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Applying JPEG compressor to " + fileName);
    }
}
