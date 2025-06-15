package io.github.anjoismysign.skeramid;

import org.jetbrains.annotations.NotNull;

public interface Skeramid<T> {
    /**
     * Will get the parent of this floor.
     * In case of being the peak, will return itself.
     *
     * @return The parent, or itself if it's the peak.
     */
    @NotNull
    T getParent();

    /**
     * Will get the child of this floor.
     * If it doesn't exist, it will create it.
     *
     * @param argument The argument to get the child.
     * @return The child.
     */
    @NotNull
    T child(String argument);
}
