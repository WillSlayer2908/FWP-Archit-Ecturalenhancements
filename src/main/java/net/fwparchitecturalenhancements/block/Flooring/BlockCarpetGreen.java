
package net.fwparchitecturalenhancements.block.Flooring;

import net.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.fwparchitecturalenhancements.Elements;

@Elements.ModElement.Tag
public class BlockCarpetGreen extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:carpetgreen")
	public static final Block block = null;
	public BlockCarpetGreen(Elements instance) {
		super(instance, 329);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("carpetgreen"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:carpetgreen", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.CLOTH);
			setUnlocalizedName("carpetgreen");
			setSoundType(SoundType.CLOTH);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabArchitecturalEnhancements.Flooring);
		}

		@Override
		public int tickRate(World world) {
			return 0;
		}
	}
}
