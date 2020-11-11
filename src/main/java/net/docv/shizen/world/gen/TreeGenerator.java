package net.docv.shizen.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import com.google.common.collect.Lists;

import net.docv.shizen.world.gen.feature.ApricotTreeFeature;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class TreeGenerator {
	public static ApricotTreeFeature APRICOT;
	//public static BananaTreeFeature BANANA;
	public static ConfiguredFeature<?, ?> CONFIGURED_APRICOT;

	public static void init() {
		ForgeRegistries.FEATURES.register(new ApricotTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:apricot"));
		//ForgeRegistries.FEATURES.register(new BananaTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:banana"));

		APRICOT = (ApricotTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:apricot"));
		CONFIGURED_APRICOT = Registry.register(WorldGenRegistries.field_243653_e, "shizen:apricot", APRICOT.configure());
	}

	public static void setup() {
		addTreeToOverWorld(CONFIGURED_APRICOT);
	}

	private static void addTreeToOverWorld(ConfiguredFeature<?, ?> featureIn) {
		for (Map.Entry<RegistryKey<Biome>, Biome> biome : WorldGenRegistries.field_243657_i.func_239659_c_()) {
			if (!biome.getValue().getCategory().equals(Biome.Category.NETHER) && !biome.getValue().getCategory().equals(Biome.Category.THEEND)) {
				addFeatureToBiome(biome.getValue(), GenerationStage.Decoration.VEGETAL_DECORATION, featureIn);
			}
		}
	}

	public static void addFeatureToBiome(Biome biome, GenerationStage.Decoration decoration, ConfiguredFeature<?, ?> configuredFeature) {
		List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.func_242440_e().func_242498_c());
		while (biomeFeatures.size() <= decoration.ordinal()) {
			biomeFeatures.add(Lists.newArrayList());
		}
		List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
		features.add(() -> configuredFeature);
		biomeFeatures.set(decoration.ordinal(), features);

		ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures, "field_242484_f");
	}
}
