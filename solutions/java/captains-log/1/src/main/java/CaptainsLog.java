import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }

    String randomShipRegistryNumber() {
        StringBuilder sb = new StringBuilder("NCC-");
        sb.append(1000 + this.random.nextInt(9000));
        return sb.toString();
            
    }

    double randomStardate() {
        return 41000.0 + 1000 * this.random.nextDouble(); 
    }
}
