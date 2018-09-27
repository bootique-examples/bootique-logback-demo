package io.bootique.logback.demo.trace;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TraceCommand implements Command {
    public static Logger logger = LoggerFactory.getLogger(TraceCommand.class);

    @Override
    public CommandOutcome run(Cli cli) {
        logger.trace("Trace: should appear trace command!");
        logger.debug("Trace: should appear debug command!");
        logger.info("Trace: should appear info command!");
        logger.warn("Trace: should appear warn command!");
        logger.error("Trace: should appear error command!");

        return CommandOutcome.succeeded();
    }
}
