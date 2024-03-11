
package net.fwparchitecturalenhancements.block.Misc;

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
public class BlockPinkTreatedBeam extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:pink_treated_beam")
	public static final Block block = null;
	public BlockPinkTreatedBeam(Elements instance) {
		super(instance, 668);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("pink_treated_beam"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:pink_treated_beam", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("pink_treated_beam");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 2);
			setHardness(5F);
			setResistance(20F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.Misc);
		}
	}
}
