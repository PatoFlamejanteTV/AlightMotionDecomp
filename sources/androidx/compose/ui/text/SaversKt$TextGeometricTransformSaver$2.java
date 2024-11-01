package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextGeometricTransformSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();

    SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TextGeometricTransform invoke(Object obj) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
