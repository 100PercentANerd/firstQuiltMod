package me.goldengamer.first_quilt_mod;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ItemGroup;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class firstQuiltMod implements ModInitializer {
	public static final Item TEST_ITEM = new Item(new QuiltItemSettings().group(ItemGroup.COMBAT));

	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		Registry.register(Registry.ITEM, new Identifier("test_item", "test_item"), TEST_ITEM);
	}
}
