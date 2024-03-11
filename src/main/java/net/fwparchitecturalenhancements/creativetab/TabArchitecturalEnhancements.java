package net.fwparchitecturalenhancements.creativetab;

import net.fwparchitecturalenhancements.Elements;
import net.fwparchitecturalenhancements.item.ItemFWPAELogo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Elements.ModElement.Tag
public class TabArchitecturalEnhancements extends Elements.ModElement {
    public static CreativeTabs Roofing;
    public static CreativeTabs Flooring;
    public static CreativeTabs ExteriorDeco;
    public static CreativeTabs InteriorDeco;
    public static CreativeTabs Misc;

    public TabArchitecturalEnhancements(Elements instance) {
        super(instance, 1);
    }

    @Override
    public void initElements() {
        Roofing = new CreativeTabs("tabarchitecturalenhancements") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemFWPAELogo.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");

        Flooring = new CreativeTabs("tabarchitecturalenhancements") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemFWPAELogo.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");

        ExteriorDeco = new CreativeTabs("tabarchitecturalenhancements") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemFWPAELogo.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");

        InteriorDeco = new CreativeTabs("tabarchitecturalenhancements") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemFWPAELogo.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");

        Misc = new CreativeTabs("tabarchitecturalenhancements") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemFWPAELogo.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");
    }

}
