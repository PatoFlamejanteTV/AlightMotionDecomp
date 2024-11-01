package androidx.compose.foundation.text.selection;

import Q5.r;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ r a(Selectable selectable, long j8, long j9, Offset offset, boolean z8, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i8, Object obj) {
        boolean z9;
        Selection selection2;
        if (obj == null) {
            if ((i8 & 8) != 0) {
                z9 = true;
            } else {
                z9 = z8;
            }
            if ((i8 & 64) != 0) {
                selection2 = null;
            } else {
                selection2 = selection;
            }
            return selectable.mo990updateSelectionqCDeeow(j8, j9, offset, z9, layoutCoordinates, selectionAdjustment, selection2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
