package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.ui.graphics.StrokeCap;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m3514invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).m3277unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
    public final void m3514invokeCSYIeUk(PathComponent pathComponent, int i8) {
        pathComponent.m3507setStrokeLineCapBeK7IIE(i8);
    }
}
