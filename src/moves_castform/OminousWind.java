package moves_castform;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class OminousWind extends SpecialMove {
	
	public OminousWind (double pow, double acc) {
		super(Type.GHOST, pow, acc);
		
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		
		Effect e = new Effect().chance(0.1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED, 1);
		
		p.addEffect(e);
		
	}
	
	@Override
	protected String describe() {
		return "применяет OminousWind";
		
	}
	
	

}
