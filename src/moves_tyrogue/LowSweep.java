package moves_tyrogue;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LowSweep extends PhysicalMove {
	
	public LowSweep(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		Effect e = new Effect().stat(Stat.SPEED, -1);
		
		p.addEffect(e);
	}
	
	@Override
	protected String describe() {
		return "применяет Low Sweep";
	}
	

}
