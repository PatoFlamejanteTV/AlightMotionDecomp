package androidx.compose.foundation.relocation;

import U5.d;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Object a(BringIntoViewRequester bringIntoViewRequester, Rect rect, d dVar, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }
}
