package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntRect;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(MutableState<TransformOrigin> mutableState) {
        super(2);
        this.$transformOriginState = mutableState;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((IntRect) obj, (IntRect) obj2);
        return I.f8786a;
    }

    public final void invoke(IntRect parentBounds, IntRect menuBounds) {
        AbstractC3292y.i(parentBounds, "parentBounds");
        AbstractC3292y.i(menuBounds, "menuBounds");
        this.$transformOriginState.setValue(TransformOrigin.m3303boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
    }
}
