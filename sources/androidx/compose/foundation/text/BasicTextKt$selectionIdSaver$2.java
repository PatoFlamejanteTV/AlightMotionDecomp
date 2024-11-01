package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$2 extends AbstractC3293z implements Function1 {
    public static final BasicTextKt$selectionIdSaver$2 INSTANCE = new BasicTextKt$selectionIdSaver$2();

    BasicTextKt$selectionIdSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Long invoke(long j8) {
        return Long.valueOf(j8);
    }
}
