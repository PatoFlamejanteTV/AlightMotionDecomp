package androidx.compose.ui.text.style;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m5053constructorimpl(1);
    private static final int Right = m5053constructorimpl(2);
    private static final int Center = m5053constructorimpl(3);
    private static final int Justify = m5053constructorimpl(4);
    private static final int Start = m5053constructorimpl(5);
    private static final int End = m5053constructorimpl(6);
    private static final int Unspecified = m5053constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m5059getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m5060getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m5061getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m5062getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m5063getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m5064getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m5065getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        public final List<TextAlign> values() {
            return AbstractC1435t.p(TextAlign.m5052boximpl(m5062getLefte0LSkKk()), TextAlign.m5052boximpl(m5063getRighte0LSkKk()), TextAlign.m5052boximpl(m5059getCentere0LSkKk()), TextAlign.m5052boximpl(m5061getJustifye0LSkKk()), TextAlign.m5052boximpl(m5064getStarte0LSkKk()), TextAlign.m5052boximpl(m5060getEnde0LSkKk()));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TextAlign(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m5052boximpl(int i8) {
        return new TextAlign(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5053constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5054equalsimpl(int i8, Object obj) {
        return (obj instanceof TextAlign) && i8 == ((TextAlign) obj).m5058unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5055equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5056hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5057toStringimpl(int i8) {
        if (m5055equalsimpl0(i8, Left)) {
            return "Left";
        }
        if (m5055equalsimpl0(i8, Right)) {
            return "Right";
        }
        if (m5055equalsimpl0(i8, Center)) {
            return "Center";
        }
        if (m5055equalsimpl0(i8, Justify)) {
            return "Justify";
        }
        if (m5055equalsimpl0(i8, Start)) {
            return "Start";
        }
        if (m5055equalsimpl0(i8, End)) {
            return "End";
        }
        if (m5055equalsimpl0(i8, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5054equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5056hashCodeimpl(this.value);
    }

    public String toString() {
        return m5057toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5058unboximpl() {
        return this.value;
    }
}
