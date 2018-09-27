package io.bootique.logback.demo.info;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfoCommand implements Command {
    public static Logger logger = LoggerFactory.getLogger(InfoCommand.class);

    @Override
    public CommandOutcome run(Cli cli) {
        logger.trace("Info: should not appear trace command!");
        logger.debug("Info: should not appear debug command!");
        logger.info("Info: should appear info command!");
        logger.warn("Info: should appear warn command!");
        logger.error("Info: should appear error command!");

        return CommandOutcome.succeeded();
    }
}
