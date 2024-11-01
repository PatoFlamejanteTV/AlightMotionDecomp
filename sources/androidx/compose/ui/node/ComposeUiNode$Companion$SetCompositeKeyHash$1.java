package androidx.compose.ui.node;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 INSTANCE = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(ComposeUiNode composeUiNode, int i8) {
        composeUiNode.setCompositeKeyHash(i8);
    }
}
