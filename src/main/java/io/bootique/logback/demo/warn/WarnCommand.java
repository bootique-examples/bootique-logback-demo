package io.bootique.logback.demo.warn;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WarnCommand implements Command {

    public static Logger logger = LoggerFactory.getLogger(WarnCommand.class);

    @Override
    public CommandOutcome run(Cli cli) {
        logger.trace("Warn: should not appear trace command!");
        logger.debug("Warn: should not appear debug command!");
        logger.info("Warn: should not appear info command!");
        logger.warn("Warn: should appear warn command!");
        logger.error("Warn: should appear error command!");

        return CommandOutcome.succeeded();
    }
}
