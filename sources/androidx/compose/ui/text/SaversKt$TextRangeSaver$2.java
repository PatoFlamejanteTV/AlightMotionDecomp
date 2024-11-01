package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();

    SaversKt$TextRangeSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
    public final TextRange invoke(Object obj) {
        Integer num;
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num2 = null;
        if (obj2 != null) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        AbstractC3292y.f(num);
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num2 = (Integer) obj3;
        }
        AbstractC3292y.f(num2);
        return TextRange.m4657boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
    }
}
