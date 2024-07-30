package strategy.mosh;

import strategy.mosh.compressor.JPEGCompressor;
import strategy.mosh.compressor.PNGCompressor;
import strategy.mosh.service.ImageSaver;
import strategy.mosh.filter.BlackAndWhiteFilter;
import strategy.mosh.filter.NoireFilter;

public class Main {
    public static void main(String[] args) {
        ImageSaver imageSaver = new ImageSaver();
        imageSaver.store("my 1st picture", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageSaver.store("my 2nd picture", new PNGCompressor(), new NoireFilter());

    }
}
