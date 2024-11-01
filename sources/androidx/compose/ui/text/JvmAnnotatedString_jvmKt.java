package androidx.compose.ui.text;

import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import androidx.compose.ui.text.AnnotatedString;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                AnnotatedString.Range<?> range = list.get(i8);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    public static final AnnotatedString transform(AnnotatedString annotatedString, InterfaceC2073o interfaceC2073o) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeSet e8 = a0.e(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), e8);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), e8);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), e8);
        T t8 = new T();
        t8.f34573a = "";
        Map m8 = Q.m(x.a(0, 0));
        AbstractC1435t.d1(e8, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(t8, interfaceC2073o, annotatedString, m8), 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i8 = 0; i8 < size; i8++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i8);
                SpanStyle item = range.getItem();
                Object obj = m8.get(Integer.valueOf(range.getStart()));
                AbstractC3292y.f(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = m8.get(Integer.valueOf(range.getEnd()));
                AbstractC3292y.f(obj2);
                arrayList.add(new AnnotatedString.Range(item, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i9);
                ParagraphStyle item2 = range2.getItem();
                Object obj3 = m8.get(Integer.valueOf(range2.getStart()));
                AbstractC3292y.f(obj3);
                int intValue2 = ((Number) obj3).intValue();
                Object obj4 = m8.get(Integer.valueOf(range2.getEnd()));
                AbstractC3292y.f(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, intValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i10 = 0; i10 < size3; i10++) {
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i10);
                Object item3 = range3.getItem();
                Object obj5 = m8.get(Integer.valueOf(range3.getStart()));
                AbstractC3292y.f(obj5);
                int intValue3 = ((Number) obj5).intValue();
                Object obj6 = m8.get(Integer.valueOf(range3.getEnd()));
                AbstractC3292y.f(obj6);
                arrayList3.add(new AnnotatedString.Range(item3, intValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) t8.f34573a, arrayList, arrayList2, arrayList3);
    }
}
