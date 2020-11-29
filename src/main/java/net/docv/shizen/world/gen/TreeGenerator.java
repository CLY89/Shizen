package net.docv.shizen.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import com.google.common.collect.Lists;

import net.docv.shizen.tree.ApricotTreeFeature;
import net.docv.shizen.tree.BananaTreeFeature;
import net.docv.shizen.tree.GrapeTreeFeature;
import net.docv.shizen.tree.LemonTreeFeature;
import net.docv.shizen.tree.OrangeTreeFeature;
import net.docv.shizen.tree.PeachTreeFeature;
import net.docv.shizen.tree.PearTreeFeature;
import net.docv.shizen.tree.PlumTreeFeature;
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
	public static BananaTreeFeature BANANA;
	public static GrapeTreeFeature GRAPE;
	public static LemonTreeFeature LEMON;
	public static OrangeTreeFeature ORANGE;
	public static PeachTreeFeature PEACH;
	public static PearTreeFeature PEAR;
	public static PlumTreeFeature PLUM;
	public static ConfiguredFeature<?, ?> CONFIGURED_APRICOT;
	public static ConfiguredFeature<?, ?> CONFIGURED_BANANA;
	public static ConfiguredFeature<?, ?> CONFIGURED_GRAPE;
	public static ConfiguredFeature<?, ?> CONFIGURED_LEMON;
	public static ConfiguredFeature<?, ?> CONFIGURED_ORANGE;
	public static ConfiguredFeature<?, ?> CONFIGURED_PEACH;
	public static ConfiguredFeature<?, ?> CONFIGURED_PEAR;
	public static ConfiguredFeature<?, ?> CONFIGURED_PLUM;

	public static void init() {
		ForgeRegistries.FEATURES.register(new ApricotTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:apricot"));
		ForgeRegistries.FEATURES.register(new BananaTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:banana"));
		ForgeRegistries.FEATURES.register(new GrapeTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:grape"));
		ForgeRegistries.FEATURES.register(new LemonTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:lemon"));
		ForgeRegistries.FEATURES.register(new OrangeTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:orange"));
		ForgeRegistries.FEATURES.register(new PeachTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:peach"));
		ForgeRegistries.FEATURES.register(new PearTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:pear"));
		ForgeRegistries.FEATURES.register(new PlumTreeFeature(BaseTreeFeatureConfig.field_236676_a_).setRegistryName("shizen:plum"));

		APRICOT = (ApricotTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:apricot"));
		BANANA = (BananaTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:banana"));
		GRAPE = (GrapeTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:grape"));
		LEMON = (LemonTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:lemon"));
		ORANGE = (OrangeTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:orange"));
		PEACH = (PeachTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:peach"));
		PEAR = (PearTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:pear"));
		PLUM = (PlumTreeFeature) ForgeRegistries.FEATURES.getValue(ResourceLocation.tryCreate("shizen:plum"));

		CONFIGURED_APRICOT = Registry.register(WorldGenRegistries.field_243653_e, "shizen:apricot", APRICOT.configure());
		CONFIGURED_BANANA = Registry.register(WorldGenRegistries.field_243653_e, "shizen:banana", BANANA.configure());
		CONFIGURED_GRAPE = Registry.register(WorldGenRegistries.field_243653_e, "shizen:grape", GRAPE.configure());
		CONFIGURED_LEMON = Registry.register(WorldGenRegistries.field_243653_e, "shizen:lemon", LEMON.configure());
		CONFIGURED_ORANGE = Registry.register(WorldGenRegistries.field_243653_e, "shizen:orange", ORANGE.configure());
		CONFIGURED_PEACH = Registry.register(WorldGenRegistries.field_243653_e, "shizen:peach", PEACH.configure());
		CONFIGURED_PEAR = Registry.register(WorldGenRegistries.field_243653_e, "shizen:pear", PEAR.configure());
		CONFIGURED_PLUM = Registry.register(WorldGenRegistries.field_243653_e, "shizen:plum", PLUM.configure());
	}

	public static void setup() {
		addTreeToOverWorld(CONFIGURED_APRICOT);
		addTreeToOverWorld(CONFIGURED_BANANA);
		addTreeToOverWorld(CONFIGURED_GRAPE);
		addTreeToOverWorld(CONFIGURED_LEMON);
		addTreeToOverWorld(CONFIGURED_ORANGE);
		addTreeToOverWorld(CONFIGURED_PEACH);
		addTreeToOverWorld(CONFIGURED_PEAR);
		addTreeToOverWorld(CONFIGURED_PLUM);
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
