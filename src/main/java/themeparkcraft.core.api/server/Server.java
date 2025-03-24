package themeparkcraft.core.api.server;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Server {

    /**
     * Get the server type.
     *
     * @return the server type
     */
    @Nonnull
    ServerType type();

    /**
     * Gets whether the server is fully started.
     *
     * @return true, if the server is fully started
     */
    boolean isFullyStarted();

    /**
     * Restarts the server.
     */
    void restart();
}
