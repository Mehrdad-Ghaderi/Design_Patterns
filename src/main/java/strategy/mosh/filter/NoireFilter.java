package strategy.mosh.filter;

public class NoireFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Noire filter to " + fileName);
    }
}
