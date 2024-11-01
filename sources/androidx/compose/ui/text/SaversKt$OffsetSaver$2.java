package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    SaversKt$OffsetSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Offset invoke(Object obj) {
        Float f8;
        if (AbstractC3292y.d(obj, Boolean.FALSE)) {
            return Offset.m2701boximpl(Offset.Companion.m2727getUnspecifiedF1C5BW0());
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f9 = null;
        if (obj2 != null) {
            f8 = (Float) obj2;
        } else {
            f8 = null;
        }
        AbstractC3292y.f(f8);
        float floatValue = f8.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f9 = (Float) obj3;
        }
        AbstractC3292y.f(f9);
        return Offset.m2701boximpl(OffsetKt.Offset(floatValue, f9.floatValue()));
    }
}
