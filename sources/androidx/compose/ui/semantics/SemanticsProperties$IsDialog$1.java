package androidx.compose.ui.semantics;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SemanticsProperties$IsDialog$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SemanticsProperties$IsDialog$1 INSTANCE = new SemanticsProperties$IsDialog$1();

    SemanticsProperties$IsDialog$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final I invoke(I i8, I i9) {
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
