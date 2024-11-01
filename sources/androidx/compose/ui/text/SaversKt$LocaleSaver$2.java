package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$LocaleSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$LocaleSaver$2 INSTANCE = new SaversKt$LocaleSaver$2();

    SaversKt$LocaleSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Locale invoke(Object obj) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new Locale((String) obj);
    }
}
