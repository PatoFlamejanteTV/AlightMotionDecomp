package androidx.compose.ui.text;

import Q5.p;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
        Saver saver;
        Saver saver2;
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        AbstractC3292y.f(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        AbstractC3292y.f(num);
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        AbstractC3292y.f(num2);
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        AbstractC3292y.f(str);
        int i8 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i8 == 1) {
            Object obj6 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!AbstractC3292y.d(obj6, Boolean.FALSE) && obj6 != null) {
                r1 = paragraphStyleSaver.restore(obj6);
            }
            AbstractC3292y.f(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i8 == 2) {
            Object obj7 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!AbstractC3292y.d(obj7, Boolean.FALSE) && obj7 != null) {
                r1 = spanStyleSaver.restore(obj7);
            }
            AbstractC3292y.f(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i8 == 3) {
            Object obj8 = list.get(1);
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!AbstractC3292y.d(obj8, Boolean.FALSE) && obj8 != null) {
                r1 = (VerbatimTtsAnnotation) saver.restore(obj8);
            }
            AbstractC3292y.f(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        if (i8 != 4) {
            if (i8 != 5) {
                throw new p();
            }
            Object obj9 = list.get(1);
            r1 = obj9 != null ? (String) obj9 : null;
            AbstractC3292y.f(r1);
            return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
        }
        Object obj10 = list.get(1);
        saver2 = SaversKt.UrlAnnotationSaver;
        if (!AbstractC3292y.d(obj10, Boolean.FALSE) && obj10 != null) {
            r1 = (UrlAnnotation) saver2.restore(obj10);
        }
        AbstractC3292y.f(r1);
        return new AnnotatedString.Range<>(r1, intValue, intValue2, str);
    }
}
