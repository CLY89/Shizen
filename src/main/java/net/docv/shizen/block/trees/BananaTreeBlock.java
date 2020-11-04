package net.docv.shizen.block.trees;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BananaTreeBlock extends Block {
	public BananaTreeBlock() {
		super(AbstractBlock.Properties
					 	   .create(Material.WOOD)
					       .hardnessAndResistance(2.5F)
					       .sound(SoundType.WOOD)
			 );
	}
}
