package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.ui.graphics.Brush;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$4 extends AbstractC3293z implements InterfaceC2072n {
    public static final VectorComposeKt$Path$2$4 INSTANCE = new VectorComposeKt$Path$2$4();

    VectorComposeKt$Path$2$4() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (Brush) obj2);
        return I.f8786a;
    }

    public final void invoke(PathComponent pathComponent, Brush brush) {
        pathComponent.setFill(brush);
    }
}
