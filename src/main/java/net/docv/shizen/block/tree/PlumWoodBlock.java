package net.docv.shizen.block.tree;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlumWoodBlock extends Block {
	public PlumWoodBlock() {
		super(AbstractBlock.Properties
			       		   .create(Material.WOOD)
			       		   .hardnessAndResistance(2.5F)
			       		   .sound(SoundType.WOOD)
	 );
	}
}
