package themeparkcraft.core.api;

import org.bukkit.plugin.java.JavaPlugin;
import themeparkcraft.core.api.server.Server;

import javax.annotation.Nonnull;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public final class Core {

    private static CoreServer server;

    /**
     * Get the JavaPlugin instance of CorePlugin.
     * <br>
     * This gives you access to some Bukkit features that rely on this instance.
     *
     * @return JavaPlugin instance of CorePlugin
     */
    @Nonnull
    public static JavaPlugin getInstance() {
        return server.getInstance();
    }

    /**
     * Get the {@link Server} object, granting access to all server-related features.
     *
     * @return Server object
     */
    @Nonnull
    public static Server server() {
        return server.server();
    }
}