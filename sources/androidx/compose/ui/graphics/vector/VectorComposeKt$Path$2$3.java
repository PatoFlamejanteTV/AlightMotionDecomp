package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.ui.graphics.PathFillType;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$3 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3515invokepweu1eQ((PathComponent) obj, ((PathFillType) obj2).m3207unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-pweu1eQ, reason: not valid java name */
    public final void m3515invokepweu1eQ(PathComponent pathComponent, int i8) {
        pathComponent.m3506setPathFillTypeoQ8Xj4U(i8);
    }
}
