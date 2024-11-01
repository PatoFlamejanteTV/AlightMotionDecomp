package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.ui.graphics.StrokeJoin;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3516invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).m3287unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
    public final void m3516invokekLtJ_vA(PathComponent pathComponent, int i8) {
        pathComponent.m3508setStrokeLineJoinWw9F2mQ(i8);
    }
}
