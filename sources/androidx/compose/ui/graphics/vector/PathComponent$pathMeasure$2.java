package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PathComponent$pathMeasure$2 extends AbstractC3293z implements Function0 {
    public static final PathComponent$pathMeasure$2 INSTANCE = new PathComponent$pathMeasure$2();

    PathComponent$pathMeasure$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PathMeasure invoke() {
        return AndroidPathMeasure_androidKt.PathMeasure();
    }
}
