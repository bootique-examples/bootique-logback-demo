package io.bootique.logback.demo;

import io.bootique.cli.Cli;
import io.bootique.command.Command;
import io.bootique.command.CommandOutcome;

public class MainCommand implements Command {
    @Override
    public CommandOutcome run(Cli cli) {
        return CommandOutcome.succeeded();
    }
}
