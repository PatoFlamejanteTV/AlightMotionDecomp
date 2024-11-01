package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    private final List<Range<? extends Object>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Object>> annotations;
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        private final List<MutableRange<SpanStyle>> spanStyles;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public final void addStringAnnotation(String str, String str2, int i8, int i9) {
            this.annotations.add(new MutableRange<>(str2, i8, i9, str));
        }

        public final void addStyle(SpanStyle spanStyle, int i8, int i9) {
            this.spanStyles.add(new MutableRange<>(spanStyle, i8, i9, null, 8, null));
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i8, int i9) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i8, i9, null, 8, null));
        }

        @ExperimentalTextApi
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i8, int i9) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i8, i9, null, 8, null));
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void pop() {
            if (!this.styleStack.isEmpty()) {
                this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(str2, this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @ExperimentalTextApi
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(list.get(i8).toRange(this.text.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList3.add(list2.get(i9).toRange(this.text.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                arrayList4.add(list3.get(i10).toRange(this.text.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new AnnotatedString(sb, arrayList, arrayList3, arrayList2);
        }

        public Builder(int i8) {
            this.text = new StringBuilder(i8);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i8, int i9) {
            this.paragraphStyles.add(new MutableRange<>(paragraphStyle, i8, i9, null, 8, null));
        }

        public final void append(String str) {
            this.text.append(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public MutableRange(T t8, int i8, int i9, String str) {
                this.item = t8;
                this.start = i8;
                this.end = i9;
                this.tag = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i8, int i9, String str, int i10, Object obj2) {
                if ((i10 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i10 & 2) != 0) {
                    i8 = mutableRange.start;
                }
                if ((i10 & 4) != 0) {
                    i9 = mutableRange.end;
                }
                if ((i10 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i8, i9, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i8, int i9, Object obj) {
                if ((i9 & 1) != 0) {
                    i8 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i8);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t8, int i8, int i9, String str) {
                return new MutableRange<>(t8, i8, i9, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return AbstractC3292y.d(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && AbstractC3292y.d(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t8 = this.item;
                return ((((((t8 == null ? 0 : t8.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i8) {
                this.end = i8;
            }

            public final Range<T> toRange(int i8) {
                int i9 = this.end;
                if (i9 != Integer.MIN_VALUE) {
                    i8 = i9;
                }
                if (i8 != Integer.MIN_VALUE) {
                    return new Range<>(this.item, this.start, i8, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public /* synthetic */ MutableRange(Object obj, int i8, int i9, String str, int i10, AbstractC3284p abstractC3284p) {
                this(obj, i8, (i10 & 4) != 0 ? Integer.MIN_VALUE : i9, (i10 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i8) {
            if (i8 < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= i8) {
                    pop();
                }
            } else {
                throw new IllegalStateException((i8 + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<ParagraphStyle> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.text.append(charSequence);
            }
            return this;
        }

        public /* synthetic */ Builder(int i8, int i9, AbstractC3284p abstractC3284p) {
            this((i9 & 1) != 0 ? 16 : i8);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i8, int i9) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i8, i9);
            } else {
                this.text.append(charSequence, i8, i9);
            }
            return this;
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        public Builder append(char c8) {
            this.text.append(c8);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i8 = 0; i8 < size; i8++) {
                    Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i8);
                    addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i9);
                    addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    Range<? extends Object> range3 = annotations$ui_text_release.get(i10);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(AnnotatedString annotatedString, int i8, int i9) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i8, i9);
            List access$getLocalSpanStyles = AnnotatedStringKt.access$getLocalSpanStyles(annotatedString, i8, i9);
            if (access$getLocalSpanStyles != null) {
                int size = access$getLocalSpanStyles.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range range = (Range) access$getLocalSpanStyles.get(i10);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List access$getLocalParagraphStyles = AnnotatedStringKt.access$getLocalParagraphStyles(annotatedString, i8, i9);
            if (access$getLocalParagraphStyles != null) {
                int size2 = access$getLocalParagraphStyles.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Range range2 = (Range) access$getLocalParagraphStyles.get(i11);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List access$getLocalAnnotations = AnnotatedStringKt.access$getLocalAnnotations(annotatedString, i8, i9);
            if (access$getLocalAnnotations != null) {
                int size3 = access$getLocalAnnotations.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Range range3 = (Range) access$getLocalAnnotations.get(i12);
                    this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List P02;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (P02 = AbstractC1435t.P0(list2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return T5.a.a(Integer.valueOf(((AnnotatedString.Range) t8).getStart()), Integer.valueOf(((AnnotatedString.Range) t9).getStart()));
            }
        })) == null) {
            return;
        }
        int size = P02.size();
        int i8 = -1;
        for (int i9 = 0; i9 < size; i9++) {
            Range range = (Range) P02.get(i9);
            if (range.getStart() >= i8) {
                if (range.getEnd() <= this.text.length()) {
                    i8 = range.getEnd();
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i8) {
        return get(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (AbstractC3292y.d(this.text, annotatedString.text) && AbstractC3292y.d(this.spanStylesOrNull, annotatedString.spanStylesOrNull) && AbstractC3292y.d(this.paragraphStylesOrNull, annotatedString.paragraphStylesOrNull) && AbstractC3292y.d(this.annotations, annotatedString.annotations)) {
            return true;
        }
        return false;
    }

    public char get(int i8) {
        return this.text.charAt(i8);
    }

    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        if (list == null) {
            return AbstractC1435t.m();
        }
        return list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i8, int i9) {
        List m8;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            m8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && AbstractC3292y.d(str, range2.getTag()) && AnnotatedStringKt.intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                    m8.add(range);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        AbstractC3292y.g(m8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return m8;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i8, int i9) {
        List m8;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            m8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                    m8.add(range);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        AbstractC3292y.g(m8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return m8;
    }

    @ExperimentalTextApi
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i8, int i9) {
        List m8;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            m8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                    m8.add(range);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        AbstractC3292y.g(m8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return m8;
    }

    public final boolean hasStringAnnotations(String str, int i8, int i9) {
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            if ((range.getItem() instanceof String) && AbstractC3292y.d(str, range.getTag()) && AnnotatedStringKt.intersect(i8, i9, range.getStart(), range.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int i9;
        int hashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int i10 = 0;
        if (list != null) {
            i8 = list.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (hashCode + i8) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        if (list2 != null) {
            i9 = list2.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return i12 + i10;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Stable
    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m4535subSequence5zctL8(long j8) {
        return subSequence(TextRange.m4667getMinimpl(j8), TextRange.m4666getMaximpl(j8));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i8, int i9) {
        if (i8 <= i9) {
            if (i8 == 0 && i9 == this.text.length()) {
                return this;
            }
            String substring = this.text.substring(i8, i9);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(substring, AnnotatedStringKt.access$filterRanges(this.spanStylesOrNull, i8, i9), AnnotatedStringKt.access$filterRanges(this.paragraphStylesOrNull, i8, i9), AnnotatedStringKt.access$filterRanges(this.annotations, i8, i9));
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less or equal to end (" + i9 + ')').toString());
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t8, int i8, int i9, String str) {
            this.item = t8;
            this.start = i8;
            this.end = i9;
            this.tag = str;
            if (i8 > i9) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i8, int i9, String str, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = range.item;
            }
            if ((i10 & 2) != 0) {
                i8 = range.start;
            }
            if ((i10 & 4) != 0) {
                i9 = range.end;
            }
            if ((i10 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i8, i9, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t8, int i8, int i9, String str) {
            return new Range<>(t8, i8, i9, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return AbstractC3292y.d(this.item, range.item) && this.start == range.start && this.end == range.end && AbstractC3292y.d(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t8 = this.item;
            return ((((((t8 == null ? 0 : t8.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t8, int i8, int i9) {
            this(t8, i8, i9, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int i8, int i9) {
        List m8;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            m8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && AnnotatedStringKt.intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                    m8.add(range);
                }
            }
        } else {
            m8 = AbstractC1435t.m();
        }
        AbstractC3292y.g(m8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return m8;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? null : list, (i8 & 4) != 0 ? null : list2, (i8 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? AbstractC1435t.m() : list, (i8 & 4) != 0 ? AbstractC1435t.m() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(java.lang.String r3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> r4, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> r5) {
        /*
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            r4 = r1
        La:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            r5 = r1
        L15:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
