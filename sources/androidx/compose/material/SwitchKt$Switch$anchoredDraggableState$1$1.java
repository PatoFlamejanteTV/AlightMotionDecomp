package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$anchoredDraggableState$1$1 extends AbstractC3293z implements Function1 {
    public static final SwitchKt$Switch$anchoredDraggableState$1$1 INSTANCE = new SwitchKt$Switch$anchoredDraggableState$1$1();

    SwitchKt$Switch$anchoredDraggableState$1$1() {
        super(1);
    }

    public final Float invoke(float f8) {
        return Float.valueOf(f8 * 0.7f);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
