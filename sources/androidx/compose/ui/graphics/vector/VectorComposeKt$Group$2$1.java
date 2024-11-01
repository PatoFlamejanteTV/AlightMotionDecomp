package androidx.compose.ui.graphics.vector;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Group$2$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Group$2$1 INSTANCE = new VectorComposeKt$Group$2$1();

    VectorComposeKt$Group$2$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, (String) obj2);
        return I.f8786a;
    }

    public final void invoke(GroupComponent groupComponent, String str) {
        groupComponent.setName(str);
    }
}
