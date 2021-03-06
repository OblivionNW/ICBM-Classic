package icbm.classic.content.explosive.handlers;

import icbm.classic.content.explosive.Explosives;
import icbm.classic.content.explosive.blast.BlastShrapnel;
import icbm.classic.prefab.tile.EnumTier;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExShrapnel extends Explosion
{
    public ExShrapnel(String name, EnumTier tier)
    {
        super(name, tier);
    }

    @Override
    public void doCreateExplosion(World world, BlockPos pos, Entity entity, float scale)
    {
        if (this.getTier() == EnumTier.TWO)
        {
            new BlastShrapnel(world, entity, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, 15 * scale, true, true, false).runBlast();
        }
        else if (this == Explosives.ANVIL.handler)
        {
            new BlastShrapnel(world, entity, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, 25 * scale, false, false, true).runBlast();
        }
        else
        {
            new BlastShrapnel(world, entity, pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, 30 * scale, true, false, false).runBlast();
        }
    }
}
