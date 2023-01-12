package apollo.mortar;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MortarMod implements ModInitializer {
	public static final String ID = "mortar";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		MortarBlocks.registerMortarBlocks();
	}
}