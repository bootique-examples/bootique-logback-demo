package io.bootique.logback.demo.error;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorCommand implements Command {
    public static Logger logger = LoggerFactory.getLogger(ErrorCommand.class);

    @Override
    public CommandOutcome run(Cli cli) {
        logger.trace("Error: should not appear trace command!");
        logger.debug("Error: should not appear debug command!");
        logger.info("Error: should not appear info command!");
        logger.warn("Error: should not appear warn command!");
        logger.error("Error: should  appear error command!");

        return CommandOutcome.succeeded();
    }
}
