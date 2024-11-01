package androidx.compose.ui.graphics.vector;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$14 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Path$2$14 INSTANCE = new VectorComposeKt$Path$2$14();

    VectorComposeKt$Path$2$14() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, ((Number) obj2).floatValue());
        return I.f8786a;
    }

    public final void invoke(PathComponent pathComponent, float f8) {
        pathComponent.setTrimPathOffset(f8);
    }
}
