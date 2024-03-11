
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

import net.fwparchitecturalenhancements.creativetab.CreativeTabRoofing;
import net.fwparchitecturalenhancements.Elements;

@Elements.ModElement.Tag
public class BlockLargeCurvedShingleCopper extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:large_curved_shingle_copper")
	public static final Block block = null;
	public BlockLargeCurvedShingleCopper(Elements instance) {
		super(instance, 745);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("large_curved_shingle_copper"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("fwparchitecturalenhancements:large_curved_shingle_copper", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("large_curved_shingle_copper");
			setSoundType(SoundType.LADDER);
			setHarvestLevel("axe", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabRoofing.Roofing);
		}
	}
}
