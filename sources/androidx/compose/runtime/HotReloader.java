package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
final class HotReloader {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        public final void invalidateGroupsWithKey$runtime_release(int i8) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i8);
        }

        public final void simulateHotReload$runtime_release(Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
