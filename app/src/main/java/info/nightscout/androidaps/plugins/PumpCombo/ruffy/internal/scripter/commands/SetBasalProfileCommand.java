package info.nightscout.androidaps.plugins.PumpCombo.ruffy.internal.scripter.commands;

import java.util.List;

import info.nightscout.androidaps.plugins.PumpCombo.ruffy.spi.BasalProfile;
import info.nightscout.androidaps.plugins.PumpCombo.ruffy.RuffyScripter;
import info.nightscout.androidaps.plugins.PumpCombo.ruffy.spi.CommandResult;

public class SetBasalProfileCommand implements Command {
    public SetBasalProfileCommand(BasalProfile basalProfile) {

    }

    @Override
    public CommandResult execute() {
        return null;
    }

    @Override
    public List<String> validateArguments() {
        return null;
    }

    @Override
    public void setScripter(RuffyScripter scripter) {

    }
}