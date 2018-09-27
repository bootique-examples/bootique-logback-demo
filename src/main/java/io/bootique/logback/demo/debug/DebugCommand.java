package io.bootique.logback.demo.debug;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugCommand implements Command {
    public static Logger logger = LoggerFactory.getLogger(DebugCommand.class);

    @Override
    public CommandOutcome run(Cli cli) {
        logger.trace("Debug: should not appear trace command!");
        logger.debug("Debug: should appear debug command!");
        logger.info("Debug: should appear info command!");
        logger.warn("Debug: should appear warn command!");
        logger.error("Debug: should  appear error command!");

        return CommandOutcome.succeeded();
    }
}
