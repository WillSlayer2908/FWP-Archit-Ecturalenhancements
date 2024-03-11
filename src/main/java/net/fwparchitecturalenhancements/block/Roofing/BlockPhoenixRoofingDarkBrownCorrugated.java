
package net.fwparchitecturalenhancements.block.Roofing;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.fwparchitecturalenhancements.Elements;

@Elements.ModElement.Tag
public class BlockPhoenixRoofingDarkBrownCorrugated extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:phoenix_roofing_dark_brown_corrugated")
	public static final Block block = null;
	public BlockPhoenixRoofingDarkBrownCorrugated(Elements instance) {
		super(instance, 677);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("phoenix_roofing_dark_brown_corrugated"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:phoenix_roofing_dark_brown_corrugated", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("phoenix_roofing_dark_brown_corrugated");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.Roofing);
		}
	}
}
