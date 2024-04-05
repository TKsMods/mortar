package dev.worldgen.mortar.config;

import com.google.gson.*;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import dev.worldgen.mortar.Mortar;
import net.fabricmc.loader.api.FabricLoader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class ConfigHandler {
    private static final Codec<Boolean> CODEC = Codec.BOOL.fieldOf("enable_structure_integrations").codec();
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve("mortar.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static boolean integrationsEnabled;
    public static void load() {
        if (!Files.isRegularFile(CONFIG_PATH)) {
            writeToFile(true);
        }
        try {
            JsonElement json = JsonParser.parseString(new String(Files.readAllBytes(CONFIG_PATH)));
            Optional<Boolean> parsedResult = CODEC.parse(JsonOps.INSTANCE, json).result();
            if (parsedResult.isEmpty()) {
                Mortar.LOGGER.error("Config file has missing or invalid data, default config will be used");
                writeToFile(true);
            } else {
                writeToFile(parsedResult.get());
            }
        } catch (IOException e) {
            Mortar.LOGGER.error("Malformed json in config file found, default config will be used");
            writeToFile(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean integrationsEnabled() {
        return integrationsEnabled;
    }

    private static void writeToFile(boolean structureIntegrations) {
        try(BufferedWriter writer = Files.newBufferedWriter(CONFIG_PATH)) {
            var dataResult = CODEC.encodeStart(JsonOps.INSTANCE, structureIntegrations).get();
            dataResult.ifRight(consumer -> {
                throw new RuntimeException("Failed to write config file");
            });
            if (!(dataResult.left().get() instanceof JsonObject jsonObject)) {
                throw new IllegalStateException("A critical error occurred whilst parsing config file");
            }
            writer.write(GSON.toJson(jsonObject));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        integrationsEnabled = structureIntegrations;
    }
}
