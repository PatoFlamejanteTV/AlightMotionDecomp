package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface ViewRootForInspector {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector) {
            AbstractComposeView a9;
            a9 = a1.a(viewRootForInspector);
            return a9;
        }

        @Deprecated
        public static View getViewRoot(ViewRootForInspector viewRootForInspector) {
            View b9;
            b9 = a1.b(viewRootForInspector);
            return b9;
        }
    }

    AbstractComposeView getSubCompositionView();

    View getViewRoot();
}
