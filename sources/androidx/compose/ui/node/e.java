package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    static {
        Owner.Companion companion = Owner.Companion;
    }

    public static Placeable.PlacementScope a(Owner owner) {
        return PlaceableKt.PlacementScope(owner);
    }

    public static /* synthetic */ void b(Owner owner, LayoutNode layoutNode, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            owner.forceMeasureTheSubtree(layoutNode, z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
    }

    public static /* synthetic */ void f(Owner owner, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                z8 = true;
            }
            owner.measureAndLayout(z8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    public static /* synthetic */ void g(Owner owner, LayoutNode layoutNode, boolean z8, boolean z9, boolean z10, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            if ((i8 & 8) != 0) {
                z10 = true;
            }
            owner.onRequestMeasure(layoutNode, z8, z9, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    public static /* synthetic */ void h(Owner owner, LayoutNode layoutNode, boolean z8, boolean z9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            owner.onRequestRelayout(layoutNode, z8, z9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
