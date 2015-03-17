#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
//
// SampleCommand.java
//
// Created by Quyet. Nguyen Minh <quyetnm@vng.com.vn> on Mar 17, 2015.
// Do not copy or use this source code without owner permission
//
package ${package}.cli.command;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class SampleCommand implements CommandMarker {

    @CliAvailabilityIndicator({"job sample"})
    public boolean isAvailable() {
        // always available
        return true;
    }

    /**
     * Example usage:
     * job sample --name Quyet
     *
     * @param name
     */
    @CliCommand(value = "job sample", help = "Display a name specified by command argument")
    public void sample(
            @CliOption(key = "name", mandatory = true, help = "Enter your name")
            String name) {

        System.out.println("Hello, " + name);

    }
}
