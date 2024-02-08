package raccoonman.reterraforged.world.worldgen.surface;

import java.util.BitSet;
import java.util.Set;
import java.util.function.Predicate;

import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public interface RTFSurfaceContext {
	void applyBiomeMasks();
	
	MutableObject<BitSet> addBiomeMask(Predicate<ResourceKey<Biome>> predicate);
	
	@Nullable
	Set<ResourceKey<Biome>> getSurroundingBiomes();
}