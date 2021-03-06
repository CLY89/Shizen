package net.docv.shizen.block.tree;

import net.docv.shizen.tree.GrapeTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GrapeSaplingBlock extends SaplingBlock {
	public GrapeSaplingBlock() {
		super(new GrapeTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
