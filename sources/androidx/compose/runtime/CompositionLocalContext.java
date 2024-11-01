package androidx.compose.runtime;

@Stable
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    public final PersistentCompositionLocalMap getCompositionLocals$runtime_release() {
        return this.compositionLocals;
    }
}
