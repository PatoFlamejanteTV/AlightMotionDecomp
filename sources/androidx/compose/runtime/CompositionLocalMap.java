package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;

/* loaded from: classes.dex */
public interface CompositionLocalMap {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CompositionLocalMap Empty = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        private Companion() {
        }

        public final CompositionLocalMap getEmpty() {
            return Empty;
        }
    }

    <T> T get(CompositionLocal<T> compositionLocal);
}
