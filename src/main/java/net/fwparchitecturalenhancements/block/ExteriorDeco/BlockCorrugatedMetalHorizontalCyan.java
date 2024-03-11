package net.fwparchitecturalenhancements.block.ExteriorDeco;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.creativetab.TabArchitecturalEnhancements;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Elements.ModElement.Tag
public class BlockCorrugatedMetalHorizontalCyan extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:corrugated_metal_horizontal_cyan")
    public static final Block block = null;

    public BlockCorrugatedMetalHorizontalCyan(Elements instance) {
        super(instance, 505);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("corrugated_metal_horizontal_cyan"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation("fwparchitecturalenhancements:corrugated_metal_horizontal_cyan", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.IRON);
            setUnlocalizedName("corrugated_metal_horizontal_cyan");
            setSoundType(SoundType.METAL);
            setHarvestLevel("pickaxe", 1);
            setHardness(1F);
            setResistance(10F);
            setLightLevel(0F);
            setLightOpacity(255);
            setCreativeTab(TabArchitecturalEnhancements.ExteriorDeco);
        }
    }
}
