package com.lilydev.welcome

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object WelcomeServer : ModInitializer {

    const val MOD_ID: String = "welcome"
    const val MOD_NAME: String = "Welcome"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_NAME)

    override fun onInitialize() {
        LOGGER.info("Hello Fabric world from $MOD_NAME")
    }
}