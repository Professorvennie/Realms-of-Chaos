package com.eternaldoom.realmsofchaos.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.BlockPos;

public class TileEntityNetherChest extends TileEntityChest{
	
	private int xCoord = this.getPos().getX(), yCoord = this.getPos().getY(), zCoord = this.getPos().getZ();
	
	public TileEntityNetherChest(){
		setCustomName("Nether Chest");
	}
	
	private int cachedChestType;
	public TileEntityNetherChest adjacentChestZNeg;
    public TileEntityNetherChest adjacentChestXPos;
    public TileEntityNetherChest adjacentChestXNeg;
    public TileEntityNetherChest adjacentChestZPos;
	@Override
	public void closeInventory(EntityPlayer player)
    {
        if (this.getBlockType() instanceof BlockNetherChest)
        {
            --this.numPlayersUsing;
            this.worldObj.addBlockEvent(this.getPos(), this.getBlockType(), 1, this.numPlayersUsing);
            this.worldObj.notifyNeighborsOfStateChange(this.pos, this.getBlockType());
            this.worldObj.notifyNeighborsOfStateChange(this.pos.down(), this.getBlockType());
        }
    }
	
	@Override
	public int getChestType()
    {
        return 0;
    }
	
	@Override
	public boolean hasCustomName()
    {
        return true;
    }
	
	private void checkforte(TileEntityNetherChest tile, int par2)
    {
        if (tile.isInvalid())
        {
            this.adjacentChestChecked = false;
        }
        else if (this.adjacentChestChecked)
        {
            switch (par2)
            {
                case 0:
                    if (this.adjacentChestZPos != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 1:
                    if (this.adjacentChestXNeg != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 2:
                    if (this.adjacentChestZNeg != tile)
                    {
                        this.adjacentChestChecked = false;
                    }

                    break;
                case 3:
                    if (this.adjacentChestXPos != tile)
                    {
                        this.adjacentChestChecked = false;
                    }
            }
        }
    }

	@Override
    public void checkForAdjacentChests()
    {
        if (!this.adjacentChestChecked)
        {
            this.adjacentChestChecked = true;
            this.adjacentChestZNeg = null;
            this.adjacentChestXPos = null;
            this.adjacentChestXNeg = null;
            this.adjacentChestZPos = null;

            if (this.checkforblock(this.getPos().add(-1, 0, 0)))
            {
                this.adjacentChestXNeg = (TileEntityNetherChest)this.worldObj.getTileEntity(this.getPos().add(-1, 0, 0));
            }

            if (this.checkforblock(this.getPos().add(1, 0, 0)))
            {
                this.adjacentChestXPos = (TileEntityNetherChest)this.worldObj.getTileEntity(this.getPos().add(1, 0, 0));
            }

            if (this.checkforblock(this.getPos().add(0, 0, -1)))
            {
                this.adjacentChestZNeg = (TileEntityNetherChest)this.worldObj.getTileEntity(this.getPos().add(0, 0, -1));
            }

            if (this.checkforblock(this.getPos().add(0, 0, 1)))
            {
                this.adjacentChestZPos = (TileEntityNetherChest)this.worldObj.getTileEntity(this.getPos().add(0, 0, 1));
            }

            if (this.adjacentChestZNeg != null)
            {
                this.adjacentChestZNeg.checkforte(this, 0);
            }

            if (this.adjacentChestZPos != null)
            {
                this.adjacentChestZPos.checkforte(this, 2);
            }

            if (this.adjacentChestXPos != null)
            {
                this.adjacentChestXPos.checkforte(this, 1);
            }

            if (this.adjacentChestXNeg != null)
            {
                this.adjacentChestXNeg.checkforte(this, 3);
            }
        }
    }
	
	private boolean checkforblock(BlockPos pos)
    {
        if (this.worldObj == null)
        {
            return false;
        }
        else
        {
            Block block = this.worldObj.getBlockState(pos).getBlock();
            return block instanceof BlockNetherChest;
        }
    }

}
