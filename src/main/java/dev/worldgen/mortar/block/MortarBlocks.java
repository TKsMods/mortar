package dev.worldgen.mortar.block;

import dev.worldgen.mortar.Mortar;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public class MortarBlocks {

    /**
     * Stone
     */
    public static final Block STONE_WALL = registerWallBlock("stone_wall", Blocks.STONE, Blocks.STONE_SLAB, null);
    public static final Block SMOOTH_STONE_STAIRS = registerStairsBlock("smooth_stone_stairs", Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE, null);
    public static final Block SMOOTH_STONE_WALL = registerWallBlock("smooth_stone_wall", Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB, null);
    public static final Block CHISELED_MOSSY_STONE_BRICKS = registerSimpleBlock("chiseled_mossy_stone_bricks", Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_WALL, null);

    /**
     * Granite
     */
    //public static final Block CHISELED_GRANITE = registerSimpleBlock("chiseled_granite", Blocks.GRANITE, Blocks.GRANITE_WALL, null);
    public static final Block POLISHED_GRANITE_WALL = registerWallBlock("polished_granite_wall", Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB, null);
    public static final Block GRANITE_BRICKS = registerSimpleBlock("granite_bricks", Blocks.GRANITE, MortarBlocks.POLISHED_GRANITE_WALL, null);
    public static final Block GRANITE_BRICK_STAIRS = registerStairsBlock("granite_brick_stairs", Blocks.GRANITE, MortarBlocks.GRANITE_BRICKS, null);
    public static final Block GRANITE_BRICK_SLAB = registerSlabBlock("granite_brick_slab", Blocks.GRANITE, MortarBlocks.GRANITE_BRICK_STAIRS, null);
    public static final Block GRANITE_BRICK_WALL = registerWallBlock("granite_brick_wall", Blocks.GRANITE, MortarBlocks.GRANITE_BRICK_SLAB, null);
    //public static final Block CHISELED_GRANITE_BRICKS = registerSimpleBlock("chiseled_granite_bricks", Blocks.GRANITE, MortarBlocks.GRANITE_BRICK_WALL, null);

    /**
     * Diorite
     */
    //public static final Block CHISELED_DIORITE = registerSimpleBlock("chiseled_diorite", Blocks.DIORITE, Blocks.DIORITE_WALL, null);
    public static final Block POLISHED_DIORITE_WALL = registerWallBlock("polished_diorite_wall", Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB, null);
    public static final Block DIORITE_BRICKS = registerSimpleBlock("diorite_bricks", Blocks.DIORITE, MortarBlocks.POLISHED_DIORITE_WALL, null);
    public static final Block DIORITE_BRICK_STAIRS = registerStairsBlock("diorite_brick_stairs", Blocks.DIORITE, MortarBlocks.DIORITE_BRICKS, null);
    public static final Block DIORITE_BRICK_SLAB = registerSlabBlock("diorite_brick_slab", Blocks.DIORITE, MortarBlocks.DIORITE_BRICK_STAIRS, null);
    public static final Block DIORITE_BRICK_WALL = registerWallBlock("diorite_brick_wall", Blocks.DIORITE, MortarBlocks.DIORITE_BRICK_SLAB, null);
    //public static final Block CHISELED_DIORITE_BRICKS = registerSimpleBlock("chiseled_diorite_bricks", Blocks.DIORITE, MortarBlocks.DIORITE_BRICK_WALL, null);

    /**
     * Andesite
     */
    //public static final Block CHISELED_ANDESITE = registerSimpleBlock("chiseled_andesite", Blocks.ANDESITE, Blocks.ANDESITE_WALL, null);
    public static final Block POLISHED_ANDESITE_WALL = registerWallBlock("polished_andesite_wall", Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB, null);
    public static final Block ANDESITE_BRICKS = registerSimpleBlock("andesite_bricks", Blocks.ANDESITE, MortarBlocks.POLISHED_ANDESITE_WALL, null);
    public static final Block ANDESITE_BRICK_STAIRS = registerStairsBlock("andesite_brick_stairs", Blocks.ANDESITE, MortarBlocks.ANDESITE_BRICKS, null);
    public static final Block ANDESITE_BRICK_SLAB = registerSlabBlock("andesite_brick_slab", Blocks.ANDESITE, MortarBlocks.ANDESITE_BRICK_STAIRS, null);
    public static final Block ANDESITE_BRICK_WALL = registerWallBlock("andesite_brick_wall", Blocks.ANDESITE, MortarBlocks.ANDESITE_BRICK_SLAB, null);
    //public static final Block CHISELED_ANDESITE_BRICKS = registerSimpleBlock("chiseled_andesite_bricks", Blocks.ANDESITE, MortarBlocks.ANDESITE_BRICK_WALL, null);

    /**
     * Calcite
     */
    public static final Block CALCITE_STAIRS = registerStairsBlock("calcite_stairs", Blocks.CALCITE, Blocks.CALCITE, null);
    public static final Block CALCITE_SLAB = registerSlabBlock("calcite_slab", Blocks.CALCITE, MortarBlocks.CALCITE_STAIRS, null);
    public static final Block CALCITE_WALL = registerWallBlock("calcite_wall", Blocks.CALCITE, MortarBlocks.CALCITE_SLAB, null);
    //public static final Block CHISELED_CALCITE = registerSimpleBlock("chiseled_calcite", Blocks.CALCITE, MortarBlocks.CALCITE_WALL, null);
    public static final Block POLISHED_CALCITE = registerSimpleBlock("polished_calcite", Blocks.CALCITE, MortarBlocks.CALCITE_WALL, MortarBlockSounds.POLISHED_CALCITE);
    public static final Block POLISHED_CALCITE_STAIRS = registerStairsBlock("polished_calcite_stairs", Blocks.CALCITE, MortarBlocks.POLISHED_CALCITE, MortarBlockSounds.POLISHED_CALCITE);
    public static final Block POLISHED_CALCITE_SLAB = registerSlabBlock("polished_calcite_slab", Blocks.CALCITE, MortarBlocks.POLISHED_CALCITE_STAIRS, MortarBlockSounds.POLISHED_CALCITE);
    public static final Block POLISHED_CALCITE_WALL = registerWallBlock("polished_calcite_wall", Blocks.CALCITE, MortarBlocks.POLISHED_CALCITE_SLAB, MortarBlockSounds.POLISHED_CALCITE);
    public static final Block CALCITE_BRICKS = registerSimpleBlock("calcite_bricks", Blocks.CALCITE, MortarBlocks.POLISHED_CALCITE_WALL, null);
    public static final Block CALCITE_BRICK_STAIRS = registerStairsBlock("calcite_brick_stairs", Blocks.CALCITE, MortarBlocks.CALCITE_BRICKS, null);
    public static final Block CALCITE_BRICK_SLAB = registerSlabBlock("calcite_brick_slab", Blocks.CALCITE, MortarBlocks.CALCITE_BRICK_STAIRS, null);
    public static final Block CALCITE_BRICK_WALL = registerWallBlock("calcite_brick_wall", Blocks.CALCITE, MortarBlocks.CALCITE_BRICK_SLAB, null);
    //public static final Block CHISELED_CALCITE_BRICKS = registerSimpleBlock("chiseled_calcite_bricks", Blocks.CALCITE, MortarBlocks.CALCITE_BRICK_WALL, null);

    /**
     * Misc.
     */
    public static final Block CHISELED_MUD_BRICKS = registerSimpleBlock("chiseled_mud_bricks", Blocks.MUD_BRICKS, Blocks.MUD_BRICK_WALL, null);
    public static final Block SMOOTH_SANDSTONE_WALL = registerWallBlock("smooth_sandstone_wall", Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB, null);
    public static final Block CUT_SANDSTONE_STAIRS = registerStairsBlock("cut_sandstone_stairs", Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE, null);
    public static final Block CUT_SANDSTONE_WALL = registerWallBlock("cut_sandstone_wall", Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB, null);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerWallBlock("smooth_red_sandstone_wall", Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB, null);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairsBlock("cut_red_sandstone_stairs", Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, null);
    public static final Block CUT_RED_SANDSTONE_WALL = registerWallBlock("cut_red_sandstone_wall", Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE_SLAB, null);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerSimpleBlock("chiseled_prismarine_bricks", Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_WALL, null);
    public static final Block PRISMARINE_BRICK_WALL = registerWallBlock("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, null);
    public static final Block DARK_PRISMARINE_WALL = registerWallBlock("dark_prismarine_wall", Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, null);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerSimpleBlock("chiseled_red_nether_bricks", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_WALL, null);
    public static final Block CHISELED_END_STONE_BRICKS = registerSimpleBlock("chiseled_end_stone_bricks", Blocks.END_STONE_BRICKS, Blocks.END_STONE_BRICK_WALL, null);
    public static final Block PURPUR_WALL = registerWallBlock("purpur_wall", Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, null);
    public static final Block CHISELED_PURPUR_BLOCK = registerSimpleBlock("chiseled_purpur_block", Blocks.PURPUR_BLOCK, MortarBlocks.PURPUR_WALL, null);
    public static final Block QUARTZ_WALL = registerWallBlock("quartz_wall", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB, null);
    public static final Block SMOOTH_QUARTZ_WALL = registerWallBlock("smooth_quartz_wall", Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ_SLAB, null);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairsBlock("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS, null);
    public static final Block QUARTZ_BRICK_SLAB = registerSlabBlock("quartz_brick_slab", Blocks.QUARTZ_BRICKS, MortarBlocks.QUARTZ_BRICK_STAIRS, null);
    public static final Block QUARTZ_BRICK_WALL = registerWallBlock("quartz_brick_wall", Blocks.QUARTZ_BRICKS, MortarBlocks.QUARTZ_BRICK_SLAB, null);

    private static void addBlockBefore(Block block, Block blockBefore) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(blockBefore, block));
    }

    private static Block registerSimpleBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
        return registerBlock(name, new Block(getSettings(copiedBlock, soundGroup)), blockBefore);
    }

    private static Block registerStairsBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
        return registerBlock(name, new StairsBlock(copiedBlock.getDefaultState(), getSettings(copiedBlock, soundGroup)), blockBefore);
    }

    private static Block registerSlabBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
        return registerBlock(name, new SlabBlock(getSettings(copiedBlock, soundGroup)), blockBefore);
    }

    private static Block registerWallBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
        return registerBlock(name, new WallBlock(getSettings(copiedBlock, soundGroup)), blockBefore);
    }

    private static Block registerBlock(String name, Block block, Block blockBefore) {
        registerBlockItem(name, block, blockBefore);
        return Registry.register(Registries.BLOCK, Identifier.of(Mortar.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, Block blockBefore) {
        addBlockBefore(block, blockBefore);
        Registry.register(Registries.ITEM, Identifier.of(Mortar.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    private static AbstractBlock.Settings getSettings(Block copiedBlock, @Nullable BlockSoundGroup soundGroup) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(copiedBlock);
        return soundGroup != null ? settings.sounds(soundGroup) : settings;
    }

    public static void register() {
    }
}
