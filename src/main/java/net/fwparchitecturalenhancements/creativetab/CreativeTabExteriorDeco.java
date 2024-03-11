package net.fwparchitecturalenhancements.creativetab;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.block.ExteriorDeco.BlockACUnitBlack;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Elements.ModElement.Tag
public class CreativeTabExteriorDeco extends Elements.ModElement {


    public CreativeTabExteriorDeco(Elements instance) {

        super(instance, 1);
    }

    @Override
    public void initElements() {
        ExteriorDeco = new CreativeTabs("CreativeTabExteriorDeco") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(BlockACUnitBlack.block)); // Assuming BlockACUnitBlack is your custom block
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");
    }
    public static CreativeTabs ExteriorDeco;
}

