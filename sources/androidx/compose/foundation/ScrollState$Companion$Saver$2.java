package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final ScrollState$Companion$Saver$2 INSTANCE = new ScrollState$Companion$Saver$2();

    ScrollState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final ScrollState invoke(int i8) {
        return new ScrollState(i8);
    }
}
