package com.matthewstanciu.playerevolutions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
