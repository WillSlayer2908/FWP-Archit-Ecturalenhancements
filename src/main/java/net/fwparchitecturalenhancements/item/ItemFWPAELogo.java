package net.fwparchitecturalenhancements.item;

import net.fwparchitecturalenhancements.Elements;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Elements.ModElement.Tag
public class ItemFWPAELogo extends Elements.ModElement {
    @GameRegistry.ObjectHolder("fwparchitecturalenhancements:fwpaelogo")
    public static final Item block = null;

    public ItemFWPAELogo(Elements instance) {
        super(instance, 1);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("fwparchitecturalenhancements:fwpaelogo", "inventory"));
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            setMaxDamage(0);
            maxStackSize = 0;
            setUnlocalizedName("fwpaelogo");
            setRegistryName("fwpaelogo");
            setCreativeTab(null);
        }

        @Override
        public int getItemEnchantability() {
            return 0;
        }

        @Override
        public int getMaxItemUseDuration(ItemStack itemstack) {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
            return 1F;
        }
    }
}
