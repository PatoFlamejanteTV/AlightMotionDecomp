package androidx.compose.ui.text;

import Q5.p;
import R5.AbstractC1435t;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1();

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

    SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
        AnnotationType annotationType;
        Object save;
        Saver saver;
        Saver saver2;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else {
            annotationType = item instanceof UrlAnnotation ? AnnotationType.Url : AnnotationType.String;
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i8 == 1) {
            Object item2 = range.getItem();
            AbstractC3292y.g(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
            save = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
        } else if (i8 == 2) {
            Object item3 = range.getItem();
            AbstractC3292y.g(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
            save = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
        } else if (i8 == 3) {
            Object item4 = range.getItem();
            AbstractC3292y.g(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            save = SaversKt.save((VerbatimTtsAnnotation) item4, saver, saverScope);
        } else if (i8 == 4) {
            Object item5 = range.getItem();
            AbstractC3292y.g(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
            saver2 = SaversKt.UrlAnnotationSaver;
            save = SaversKt.save((UrlAnnotation) item5, saver2, saverScope);
        } else {
            if (i8 != 5) {
                throw new p();
            }
            save = SaversKt.save(range.getItem());
        }
        return AbstractC1435t.g(SaversKt.save(annotationType), save, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
    }
}
