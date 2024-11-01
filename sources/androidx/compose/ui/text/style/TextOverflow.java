package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m5099constructorimpl(1);
    private static final int Ellipsis = m5099constructorimpl(2);
    private static final int Visible = m5099constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5105getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5106getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m5107getVisiblegIe3tQ8$annotations() {
        }

        /* renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m5108getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m5109getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m5110getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TextOverflow(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m5098boximpl(int i8) {
        return new TextOverflow(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5099constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5100equalsimpl(int i8, Object obj) {
        return (obj instanceof TextOverflow) && i8 == ((TextOverflow) obj).m5104unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5101equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5102hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5103toStringimpl(int i8) {
        if (m5101equalsimpl0(i8, Clip)) {
            return "Clip";
        }
        if (m5101equalsimpl0(i8, Ellipsis)) {
            return "Ellipsis";
        }
        if (m5101equalsimpl0(i8, Visible)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5100equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5102hashCodeimpl(this.value);
    }

    public String toString() {
        return m5103toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5104unboximpl() {
        return this.value;
    }
}
