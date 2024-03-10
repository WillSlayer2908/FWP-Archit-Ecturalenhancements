
package com.forgewolfproductions.fwparchitecturalenhancements.block.Misc;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import com.forgewolfproductions.fwparchitecturalenhancements.Elements;

@Elements.ModElement.Tag
public class BlockLightPurplePoolWater extends Elements.ModElement {
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:light_purple_pool_water")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("fwparchitecturalenhancements:light_purple_pool_water")
	public static final Item item = null;
	private Fluid fluid;
	public BlockLightPurplePoolWater(Elements instance) {
		super(instance, 801);
		fluid = new Fluid("light_purple_pool_water", new ResourceLocation("fwparchitecturalenhancements:blocks/lightpurplepoolwater"),
				new ResourceLocation("fwparchitecturalenhancements:blocks/lightpurplepoolwater")).setLuminosity(1).setDensity(1000).setViscosity(1000)
						.setGaseous(false);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, Material.WATER) {
		}.setUnlocalizedName("light_purple_pool_water").setRegistryName("light_purple_pool_water"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("light_purple_pool_water"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("fwparchitecturalenhancements:light_purple_pool_water", "light_purple_pool_water");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("fwparchitecturalenhancements:light_purple_pool_water", "light_purple_pool_water");
			}
		});
	}
}
