package strategy.mosh.service;

import strategy.mosh.compressor.Compressor;
import strategy.mosh.filter.Filter;

public class ImageSaver {

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
