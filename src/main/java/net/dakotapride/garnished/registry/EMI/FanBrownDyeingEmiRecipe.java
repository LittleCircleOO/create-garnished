package net.dakotapride.garnished.registry.EMI;

import net.dakotapride.garnished.recipe.BlueDyeBlowingFanRecipe;
import net.dakotapride.garnished.registry.GarnishedFluids;

public class FanBrownDyeingEmiRecipe extends FanDyeingEmiRecipe {
	public FanBrownDyeingEmiRecipe(BlueDyeBlowingFanRecipe recipe) {
		super(GarnishedEMI.FAN_BROWN_DYEING, recipe, GarnishedFluids.BROWN_MASTIC_RESIN.getSource());
	}
}
