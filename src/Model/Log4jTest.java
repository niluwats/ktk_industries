/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class Log4jTest {
    public static void intiLogger(){
        
        try {
            String path="LoggerData/loggerdata.txt";
            PatternLayout layout =new PatternLayout("%-3p %-10d %m %L %n");
            RollingFileAppender appender =new RollingFileAppender(layout, path);
            appender.setName("name");
            appender.setMaxFileSize("1MB");
            appender.activateOptions();
            Logger.getRootLogger().addAppender(appender);
        } catch (Exception e) {
            e.printStackTrace();              
        }
        
    }
}
