package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;

@InternalComposeUiApi
/* loaded from: classes.dex */
public interface WindowRecomposerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowRecomposerFactory LifecycleAware = new WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.c1
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            public final Recomposer createRecomposer(View view) {
                Recomposer createLifecycleAwareWindowRecomposer$default;
                createLifecycleAwareWindowRecomposer$default = WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
                return createLifecycleAwareWindowRecomposer$default;
            }
        };

        private Companion() {
        }

        public static /* synthetic */ void getLifecycleAware$annotations() {
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }
    }

    Recomposer createRecomposer(View view);
}
