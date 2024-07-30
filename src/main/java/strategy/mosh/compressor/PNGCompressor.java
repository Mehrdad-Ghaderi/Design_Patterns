package strategy.mosh.compressor;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Applying PNG compressor to " + fileName);
    }
}
