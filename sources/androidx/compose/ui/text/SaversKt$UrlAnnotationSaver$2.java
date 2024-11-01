package androidx.compose.ui.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$UrlAnnotationSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$UrlAnnotationSaver$2 INSTANCE = new SaversKt$UrlAnnotationSaver$2();

    SaversKt$UrlAnnotationSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final UrlAnnotation invoke(Object obj) {
        String str = obj != null ? (String) obj : null;
        AbstractC3292y.f(str);
        return new UrlAnnotation(str);
    }
}
