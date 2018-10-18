import org.apache.log4j.Logger;

/**
 * TestLogger
 *
 * @author Shark.Yin
 * @since 1.0
 */
public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestLogger.class);
        logger.info("info msg");
        logger.warn("warn msg");
        logger.error("error msg");
    }
}
