package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static boolean a(ScrollableState scrollableState) {
        return true;
    }

    public static boolean b(ScrollableState scrollableState) {
        return true;
    }

    public static /* synthetic */ Object e(ScrollableState scrollableState, MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, interfaceC2072n, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }
}
