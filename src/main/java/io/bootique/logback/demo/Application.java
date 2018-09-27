package io.bootique.logback.demo;

import io.bootique.logback.demo.debug.DebugCommand;
import io.bootique.logback.demo.error.ErrorCommand;
import io.bootique.logback.demo.info.InfoCommand;
import io.bootique.logback.demo.trace.TraceCommand;
import io.bootique.logback.demo.warn.WarnCommand;
import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;
import io.bootique.command.CommandDecorator;

public class Application implements Module {

    public static void main(String[] args) {
        Bootique
                .app(args)
                .autoLoadModules()
                .module(Application.class)
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        BQCoreModule.extend(binder).addCommand(MainCommand.class)
                .addCommand(InfoCommand.class)
                .addCommand(WarnCommand.class)
                .addCommand(DebugCommand.class)
                .addCommand(TraceCommand.class)
                .addCommand(ErrorCommand.class)
                .decorateCommand(MainCommand.class, CommandDecorator.alsoRun(InfoCommand.class))
                .decorateCommand(MainCommand.class, CommandDecorator.alsoRun(WarnCommand.class))
                .decorateCommand(MainCommand.class, CommandDecorator.alsoRun(DebugCommand.class))
                .decorateCommand(MainCommand.class, CommandDecorator.alsoRun(TraceCommand.class))
                .decorateCommand(MainCommand.class, CommandDecorator.alsoRun(ErrorCommand.class));
    }
}
