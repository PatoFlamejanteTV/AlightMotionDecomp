package androidx.compose.foundation.text.selection;

import Q5.r;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;

/* loaded from: classes.dex */
public interface Selectable {
    Rect getBoundingBox(int i8);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo988getHandlePositiondBAh8RU(Selection selection, boolean z8);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo989getRangeOfLineContainingjx7JFs(int i8);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    /* renamed from: updateSelection-qCDeeow */
    r mo990updateSelectionqCDeeow(long j8, long j9, Offset offset, boolean z8, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection);
}
