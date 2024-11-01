package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TopAppBarState$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final TopAppBarState$Companion$Saver$2 INSTANCE = new TopAppBarState$Companion$Saver$2();

    TopAppBarState$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TopAppBarState invoke(List<Float> it) {
        AbstractC3292y.i(it, "it");
        return new TopAppBarState(it.get(0).floatValue(), it.get(1).floatValue(), it.get(2).floatValue());
    }
}
