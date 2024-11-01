package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BringIntoViewResponderKt {
    @ExperimentalFoundationApi
    public static final Modifier bringIntoViewResponder(Modifier modifier, BringIntoViewResponder responder) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(responder, "responder");
        return modifier.then(new BringIntoViewResponderElement(responder));
    }

    private static final boolean completelyOverlaps(Rect rect, Rect rect2) {
        if (rect.getLeft() <= rect2.getLeft() && rect.getTop() <= rect2.getTop() && rect.getRight() >= rect2.getRight() && rect.getBottom() >= rect2.getBottom()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m2749translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m2747getTopLeftF1C5BW0());
    }
}
