package cn.ksmcbrigade.les.mixin;

import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerInteractionManager.class)
public class InteractionManagerMixin {
    @Inject(method = "onRightClick",at = @At("HEAD"))
    public void right(ClientPlayerEntity player, ClientWorld world, ItemStack stack, BlockPos pos, Direction direction, Vec3d vec, CallbackInfoReturnable<Boolean> cir){
        if(world.getBlockAt(pos) instanceof AbstractSignBlock){
            player.openEditSignScreen((SignBlockEntity) world.getBlockEntity(pos));
        }
    }
}
