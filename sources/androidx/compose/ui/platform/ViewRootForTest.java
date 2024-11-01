package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import kotlin.jvm.functions.Function1;

@VisibleForTesting
/* loaded from: classes.dex */
public interface ViewRootForTest extends RootForTest {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1 onViewCreatedCallback;

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        public final Function1 getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(Function1 function1) {
            onViewCreatedCallback = function1;
        }
    }

    boolean getHasPendingMeasureOrLayout();

    View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();
}
