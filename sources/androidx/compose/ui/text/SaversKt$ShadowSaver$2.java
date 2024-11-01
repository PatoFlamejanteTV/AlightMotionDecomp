package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$ShadowSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    SaversKt$ShadowSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Shadow invoke(Object obj) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
        Boolean bool = Boolean.FALSE;
        Color restore = (AbstractC3292y.d(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
        AbstractC3292y.f(restore);
        long m2958unboximpl = restore.m2958unboximpl();
        Object obj3 = list.get(1);
        Offset restore2 = (AbstractC3292y.d(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(Offset.Companion).restore(obj3);
        AbstractC3292y.f(restore2);
        long m2722unboximpl = restore2.m2722unboximpl();
        Object obj4 = list.get(2);
        Float f8 = obj4 != null ? (Float) obj4 : null;
        AbstractC3292y.f(f8);
        return new Shadow(m2958unboximpl, m2722unboximpl, f8.floatValue(), null);
    }
}
