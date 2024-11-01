package androidx.compose.foundation.lazy.layout;

import U5.d;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public interface LazyAnimateScrollScope {
    float expectedDistanceTo(int i8, int i9);

    Density getDensity();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    int getNumOfItemsForTeleport();

    Integer getTargetItemOffset(int i8);

    Object scroll(InterfaceC2072n interfaceC2072n, d dVar);

    void snapToItem(ScrollScope scrollScope, int i8, int i9);
}
