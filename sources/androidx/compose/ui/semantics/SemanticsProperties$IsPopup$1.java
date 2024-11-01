package androidx.compose.ui.semantics;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SemanticsProperties$IsPopup$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SemanticsProperties$IsPopup$1 INSTANCE = new SemanticsProperties$IsPopup$1();

    SemanticsProperties$IsPopup$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final I invoke(I i8, I i9) {
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
