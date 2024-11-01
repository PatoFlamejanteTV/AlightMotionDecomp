package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextGeometricTransform;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextGeometricTransformSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$TextGeometricTransformSaver$1 INSTANCE = new SaversKt$TextGeometricTransformSaver$1();

    SaversKt$TextGeometricTransformSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
        return AbstractC1435t.g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }
}
