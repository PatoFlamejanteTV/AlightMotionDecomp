package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$AnnotatedStringSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$AnnotatedStringSaver$2 INSTANCE = new SaversKt$AnnotatedStringSaver$2();

    SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnnotatedString invoke(Object obj) {
        Saver saver;
        Saver saver2;
        List list;
        List list2;
        Saver saver3;
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        saver = SaversKt.AnnotationRangeListSaver;
        Boolean bool = Boolean.FALSE;
        List list4 = null;
        List list5 = (AbstractC3292y.d(obj2, bool) || obj2 == null) ? null : (List) saver.restore(obj2);
        Object obj3 = list3.get(2);
        saver2 = SaversKt.AnnotationRangeListSaver;
        List list6 = (AbstractC3292y.d(obj3, bool) || obj3 == null) ? null : (List) saver2.restore(obj3);
        Object obj4 = list3.get(0);
        String str = obj4 != null ? (String) obj4 : null;
        AbstractC3292y.f(str);
        if (list5 != null) {
            List list7 = list5;
            if (list7.isEmpty()) {
                list7 = null;
            }
            list = list7;
        } else {
            list = null;
        }
        if (list6 != null) {
            List list8 = list6;
            if (list8.isEmpty()) {
                list8 = null;
            }
            list2 = list8;
        } else {
            list2 = null;
        }
        Object obj5 = list3.get(3);
        saver3 = SaversKt.AnnotationRangeListSaver;
        if (!AbstractC3292y.d(obj5, bool) && obj5 != null) {
            list4 = (List) saver3.restore(obj5);
        }
        return new AnnotatedString(str, list, list2, list4);
    }
}
