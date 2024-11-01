package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$UrlAnnotationSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$UrlAnnotationSaver$1 INSTANCE = new SaversKt$UrlAnnotationSaver$1();

    SaversKt$UrlAnnotationSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return SaversKt.save(urlAnnotation.getUrl());
    }
}
