package themeparkcraft.core.api;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.ApiStatus;
import themeparkcraft.core.api.server.Server;

import javax.annotation.Nonnull;

@ApiStatus.Internal
public interface CoreServer {

    @Nonnull
    JavaPlugin getInstance();

    @Nonnull
    Server server();
}
