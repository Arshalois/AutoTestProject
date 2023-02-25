package helpers;
import org.apache.logging.log4j.Logger;

import static com.sun.media.jfxmedia.logging.Logger.INFO;
import static helpers.ConsoleColors.*;
public class ColorPrinter {

        public static void printMessageInYellow(String message){
            System.out.println(YELLOW_BOLD + message + RESET);
        }
        public static void printColorMessage(String message, Logger logger, Level level){
            switch (level){
                case INFO:
                    logger.info(GREEN + message + RESET);
                    break;
                case DEBUG:
                    logger.info(BLUE + message + RESET);
                    break;
                case ERROR:
                    logger.info(RED + message + RESET);
                    break;
            }
        }
    }

