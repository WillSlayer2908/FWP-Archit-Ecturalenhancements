package net.fwparchitecturalenhancements.creativetab;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.block.Misc.BlockGenericLight;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Elements.ModElement.Tag
public class CreativeTabMisc extends Elements.ModElement {
    public static CreativeTabs Misc;

    public CreativeTabMisc(Elements instance) {
        super(instance, 1);
    }

    @Override
    public void initElements() {
        Misc = new CreativeTabs("CreativeTabFlooring") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(BlockGenericLight.block)); // Assuming BlockACUnitBlack is your custom block
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");
    }
}
