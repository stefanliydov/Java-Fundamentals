package app.models.participants;

import app.contracts.Hero;
import app.contracts.Targetable;

public abstract class BaseHero implements Hero, Targetable {
        protected BaseHero(){
        }
        @Override
        public String toString() {
                return super.toString();
        }
}
