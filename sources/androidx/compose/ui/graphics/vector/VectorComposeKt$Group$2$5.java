package androidx.compose.ui.graphics.vector;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$5 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Group$2$5 INSTANCE = new VectorComposeKt$Group$2$5();

    VectorComposeKt$Group$2$5() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return I.f8786a;
    }

    public final void invoke(GroupComponent groupComponent, float f8) {
        groupComponent.setScaleX(f8);
    }
}
