#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * App.java
 *
 * Created by Quyet. Nguyen Minh <quyetnm@vng.com.vn> on Sep 23, 2014.
 * Do not copy or use this source code without owner permission
 *
 * Copyright (c) VNG Corporation 2014. All rights reserved.
 *
 */
package ${package}.cli;

import java.io.IOException;

import org.springframework.shell.Bootstrap;
import org.springframework.util.Log4jConfigurer;

/**
 * Application entry
 */
public class App {

    public static void main(String[] args) throws IOException {
        Log4jConfigurer.initLogging("classpath:config/${symbol_dollar}{env}/log4j.properties");
        Bootstrap.main(args);
    }

}
