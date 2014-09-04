package com.eternaldoom.realmsofchaos.water.gen;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;

import com.eternaldoom.realmsofchaos.blocks.ROCBlocks;
import com.eternaldoom.realmsofchaos.blocks.TileEntityOceanChest;
import com.eternaldoom.realmsofchaos.items.ROCItems;

public class WorldGenSurfaceDungeon {
	
    public static final WeightedRandomChestContent[] cheststuff = new WeightedRandomChestContent[] {new WeightedRandomChestContent(ROCItems.neptunite_ingot, 0, 1, 3, 3), new WeightedRandomChestContent(ROCItems.aquatic_shard, 0, 1, 1, 2)};

	public WorldGenSurfaceDungeon(){}
	
	public boolean generate(World world, Random rand, int i, int j, int k) {
		world.setBlock(i + 0, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 1, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 2, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 3, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 7, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 8, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 9, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 1, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 2, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 3, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 5, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 7, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 8, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 9, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 1, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 2, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 3, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 5, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 7, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 8, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 9, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 0, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 1, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 2, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 3, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 7, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 8, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 9, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 0, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 1, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 1, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 1, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 1, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 1, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 1, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 1, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 1, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 1, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 2, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 2, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 2, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 2, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		
		world.setBlock(i + 2, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 2, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 2, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 2, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 2, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 3, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 3, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 3, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 3, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 3, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 3, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 3, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 3, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 3, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 4, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 4, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 4, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 4, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 4, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 4, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 4, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 4, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 4, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 5, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 5, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 5, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 5, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 5, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 5, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 5, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 5, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 5, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 6, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 6, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 6, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 6, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 6, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 6, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 6, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 6, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 6, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 7, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 7, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 7, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 7, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 7, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 7, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 7, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 7, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 7, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 8, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 8, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 8, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 8, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 8, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 8, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 8, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 8, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 8, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 9, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 9, j + 0, k + 1, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 2, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 3, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 4, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 6, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 7, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 8, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 9, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 9, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 9, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 9, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 9, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 9, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 9, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 9, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 1, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 2, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 3, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 10, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 7, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 8, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 9, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 0, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 1, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 1, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 2, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 3, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 7, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 8, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 9, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 1, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 0, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 1, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 2, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 3, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 7, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 8, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 9, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 2, k + 10, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 10, j + 3, k + 0, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 1, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 2, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 3, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 7, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 8, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 9, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 10, j + 3, k + 10, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 11, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 11, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 11, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 11, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 11, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 11, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 11, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 11, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 11, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 11, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 12, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 12, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 12, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 12, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 12, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 12, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 12, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 12, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 12, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 12, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 13, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 13, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 13, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 13, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 13, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 13, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 13, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 13, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 13, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 13, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 14, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 14, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 14, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 14, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 14, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 14, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 14, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 14, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 14, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 14, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 15, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 15, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 15, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 15, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 15, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 15, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 15, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 15, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 15, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 15, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 16, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 16, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 16, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 16, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 16, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 16, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 16, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 16, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 16, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 16, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 17, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 17, j + 0, k + 5, ROCBlocks.ocean_cobblestone);
		world.setBlock(i + 17, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 17, j + 1, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 17, j + 1, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 17, j + 2, k + 4, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 17, j + 2, k + 6, ROCBlocks.ocean_glass_pane);
		world.setBlock(i + 17, j + 3, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 17, j + 3, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 17, j + 3, k + 6, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 18, j + 0, k + 4, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 18, j + 0, k + 5, ROCBlocks.oceanstone_bricks);
		world.setBlock(i + 18, j + 0, k + 6, ROCBlocks.oceanstone_bricks);
		
		world.setBlock(i + 2, j + 1, k + 2, Blocks.mob_spawner, 0, 2);
		world.setBlock(i + 2, j + 1, k + 8, Blocks.mob_spawner, 0, 2);
		world.setBlock(i + 5, j + 1, k + 4, Blocks.mob_spawner, 0, 2);
		world.setBlock(i + 5, j + 1, k + 6, Blocks.mob_spawner, 0, 2);
		
		TileEntityMobSpawner spawner1 = (TileEntityMobSpawner)world.getTileEntity(i+2, j+1, k+2);
		TileEntityMobSpawner spawner2 = (TileEntityMobSpawner)world.getTileEntity(i+2, j+1, k+8);
		TileEntityMobSpawner spawner3 = (TileEntityMobSpawner)world.getTileEntity(i+5, j+1, k+4);
		TileEntityMobSpawner spawner4 = (TileEntityMobSpawner)world.getTileEntity(i+5, j+1, k+6);

        if (spawner1 != null) spawner1.func_145881_a().setEntityName(this.pickMobSpawner(rand));
        if (spawner2 != null) spawner2.func_145881_a().setEntityName(this.pickMobSpawner(rand));
        if (spawner3 != null) spawner3.func_145881_a().setEntityName(this.pickMobSpawner(rand));
        if (spawner4 != null) spawner4.func_145881_a().setEntityName(this.pickMobSpawner(rand));
        
        world.setBlock(i + 1, j + 1, k + 4, ROCBlocks.ocean_chest, 5, 2);
		world.setBlock(i + 1, j + 1, k + 6, ROCBlocks.ocean_chest, 5, 2);
				
		TileEntityOceanChest chest1 = (TileEntityOceanChest)world.getTileEntity(i+1, j+1, k+4);
		if (chest1 != null) WeightedRandomChestContent.generateChestContents(rand, cheststuff, chest1, 8);
		TileEntityOceanChest chest2 = (TileEntityOceanChest)world.getTileEntity(i+1, j+1, k+6);
		if (chest2 != null) WeightedRandomChestContent.generateChestContents(rand, cheststuff, chest2, 8);
        

		return true;
	}
	
	private String pickMobSpawner(Random p_76543_1_)
    {
        return "AquaticGolem";
    }

}
