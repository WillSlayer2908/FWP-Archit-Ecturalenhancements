package net.fwparchitecturalenhancements.creativetab;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.block.InteriorDeco.BlockCeilingArmstrongWhite;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Elements.ModElement.Tag
public class CreativeTabInteriorDeco extends Elements.ModElement {
    public static CreativeTabs InteriorDeco;

    public CreativeTabInteriorDeco(Elements instance) {
        super(instance, 1);
    }

    @Override
    public void initElements() {
        InteriorDeco = new CreativeTabs("CreativeTabFlooring") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(BlockCeilingArmstrongWhite.block)); // Assuming BlockACUnitBlack is your custom block
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");
    }
}
