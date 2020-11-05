package net.docv.shizen.block.tree;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlumLeavesBlock extends LeavesBlock {
	public PlumLeavesBlock() {
		super(AbstractBlock.Properties
				           .create(Material.LEAVES)
				           .hardnessAndResistance(0.2F)
				           .tickRandomly()
				           .sound(SoundType.WOOD)
				           .notSolid()
			 );
	}
}
