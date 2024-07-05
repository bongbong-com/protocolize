package dev.simplix.protocolize.api.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.querz.nbt.tag.CompoundTag;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bee {
    CompoundTag entityData;
    int ticksInHive;
    int minTicksInHive;
}
