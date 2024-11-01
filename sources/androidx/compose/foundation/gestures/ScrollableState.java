package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public interface ScrollableState {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            boolean a9;
            a9 = c.a(scrollableState);
            return a9;
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            boolean b9;
            b9 = c.b(scrollableState);
            return b9;
        }
    }

    float dispatchRawDelta(float f8);

    boolean getCanScrollBackward();

    boolean getCanScrollForward();

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar);
}
