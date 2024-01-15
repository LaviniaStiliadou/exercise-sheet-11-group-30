package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.EngineerSpaceHamster;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.SpaceHamster;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.SpaceShipHamster;

public class SpaceHamsterGameApp {

    public static void main(String [] args){
        final SpaceShip ship = new SpaceShip();
        SpaceHamster engineerSpaceHamster = new EngineerSpaceHamster(ship, SpaceShip::repair);
        SpaceHamster commandSpaceHamster = new SpaceShipHamster(ship, new MotivatorAbility());

        engineerSpaceHamster.useSpecialAbility();
        commandSpaceHamster.useSpecialAbility();
    }
}
