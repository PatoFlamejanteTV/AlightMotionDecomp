package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import c6.InterfaceC2072n;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, AbstractC1435t.e(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? AbstractC1435t.m() : AbstractC1435t.e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(Function1 function1) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$capitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i8, int i9, int i10, int i11) {
        if (i8 > i10 || i11 > i9) {
            return false;
        }
        if (i9 == i11) {
            if ((i10 == i11) != (i8 == i9)) {
                return false;
            }
        }
        return true;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$decapitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i8, int i9) {
        if (i8 <= i9) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<? extends T> range = list.get(i10);
                AnnotatedString.Range<? extends T> range2 = range;
                if (intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i11);
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i8, range3.getStart()) - i8, Math.min(i9, range3.getEnd()) - i8, range3.getTag()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less than or equal to end (" + i9 + ')').toString());
    }

    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i8, int i9) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i8 == i9 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i10);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i11);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), m.k(range3.getStart(), i8, i9) - i8, m.k(range3.getEnd(), i8, i9) - i8, range3.getTag()));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i8, int i9) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i8 == i9 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i10);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i11);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), m.k(range3.getStart(), i8, i9) - i8, m.k(range3.getEnd(), i8, i9) - i8));
        }
        return arrayList2;
    }

    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i8, int i9) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i8 == i9 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i10);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i11);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), m.k(range3.getStart(), i8, i9) - i8, m.k(range3.getEnd(), i8, i9) - i8));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i8, int i9, int i10, int i11) {
        if (Math.max(i8, i10) >= Math.min(i9, i11) && !contains(i8, i9, i10, i11) && !contains(i10, i11, i8, i9)) {
            return false;
        }
        return true;
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, InterfaceC2072n interfaceC2072n) {
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i8);
            arrayList.add(interfaceC2072n.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = AbstractC1435t.m();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i8);
            ParagraphStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i9) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i9, component2));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(component1), component2, component3));
            i8++;
            i9 = component3;
        }
        if (i9 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i9, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i8, int i9) {
        String str;
        if (i8 != i9) {
            str = annotatedString.getText().substring(i8, i9);
            AbstractC3292y.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new AnnotatedString(str, getLocalSpanStyles(annotatedString, i8, i9), null, null, 12, null);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toLowerCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toUpperCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1 function1) {
        int pushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) function1.invoke(builder);
        } finally {
            AbstractC3290w.b(1);
            builder.pop(pushStringAnnotation);
            AbstractC3290w.a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1 function1) {
        int pushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) function1.invoke(builder);
        } finally {
            AbstractC3290w.b(1);
            builder.pop(pushStyle);
            AbstractC3290w.a(1);
        }
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1 function1) {
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) function1.invoke(builder);
        } finally {
            AbstractC3290w.b(1);
            builder.pop(pushTtsAnnotation);
            AbstractC3290w.a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1 function1) {
        int pushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) function1.invoke(builder);
        } finally {
            AbstractC3290w.b(1);
            builder.pop(pushStyle);
            AbstractC3290w.a(1);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, AbstractC1435t.m(), AbstractC1435t.e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1 function1) {
        int pushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) function1.invoke(builder);
        } finally {
            AbstractC3290w.b(1);
            builder.pop(pushUrlAnnotation);
            AbstractC3290w.a(1);
        }
    }
}
