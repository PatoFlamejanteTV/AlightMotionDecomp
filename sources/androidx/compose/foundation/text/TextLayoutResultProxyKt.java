package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m939coerceIn3MmeM6k(long j8, Rect rect) {
        float m2712getXimpl;
        float m2713getYimpl;
        if (Offset.m2712getXimpl(j8) < rect.getLeft()) {
            m2712getXimpl = rect.getLeft();
        } else if (Offset.m2712getXimpl(j8) > rect.getRight()) {
            m2712getXimpl = rect.getRight();
        } else {
            m2712getXimpl = Offset.m2712getXimpl(j8);
        }
        if (Offset.m2713getYimpl(j8) < rect.getTop()) {
            m2713getYimpl = rect.getTop();
        } else if (Offset.m2713getYimpl(j8) > rect.getBottom()) {
            m2713getYimpl = rect.getBottom();
        } else {
            m2713getYimpl = Offset.m2713getYimpl(j8);
        }
        return OffsetKt.Offset(m2712getXimpl, m2713getYimpl);
    }
}
