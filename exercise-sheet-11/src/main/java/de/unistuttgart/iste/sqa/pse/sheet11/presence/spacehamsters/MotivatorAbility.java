package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.SpaceHamster;


public class MotivatorAbility implements SpecialAbility{

    @Override
    public void applySpecialAbility(SpaceShip ship) {
        for(final SpaceHamster hamster: ship.getCrew()){
            hamster.encourage();
        }
    }
}
