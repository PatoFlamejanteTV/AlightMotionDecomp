package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    /* renamed from: invoke-KMgbckE, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(Offset offset, IntRect bounds) {
        AbstractC3292y.i(bounds, "bounds");
        boolean z8 = false;
        if (offset != null && (Offset.m2712getXimpl(offset.m2722unboximpl()) < bounds.getLeft() || Offset.m2712getXimpl(offset.m2722unboximpl()) > bounds.getRight() || Offset.m2713getYimpl(offset.m2722unboximpl()) < bounds.getTop() || Offset.m2713getYimpl(offset.m2722unboximpl()) > bounds.getBottom())) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }
}
