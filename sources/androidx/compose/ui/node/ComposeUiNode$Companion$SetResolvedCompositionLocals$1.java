package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.runtime.CompositionLocalMap;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetResolvedCompositionLocals$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ComposeUiNode$Companion$SetResolvedCompositionLocals$1 INSTANCE = new ComposeUiNode$Companion$SetResolvedCompositionLocals$1();

    ComposeUiNode$Companion$SetResolvedCompositionLocals$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (CompositionLocalMap) obj2);
        return I.f8786a;
    }

    public final void invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
        composeUiNode.setCompositionLocalMap(compositionLocalMap);
    }
}
