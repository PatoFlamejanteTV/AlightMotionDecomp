package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetDensity$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposeUiNode$Companion$SetDensity$1 INSTANCE = new ComposeUiNode$Companion$SetDensity$1();

    ComposeUiNode$Companion$SetDensity$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (Density) obj2);
        return I.f8786a;
    }

    public final void invoke(ComposeUiNode composeUiNode, Density density) {
        composeUiNode.setDensity(density);
    }
}