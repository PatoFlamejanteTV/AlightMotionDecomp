package androidx.compose.ui.hapticfeedback;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m3547getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3549getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m3548getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3550getTextHandleMove5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return AbstractC1435t.p(HapticFeedbackType.m3540boximpl(m3547getLongPress5zf0vsI()), HapticFeedbackType.m3540boximpl(m3548getTextHandleMove5zf0vsI()));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ HapticFeedbackType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3540boximpl(int i8) {
        return new HapticFeedbackType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3541constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3542equalsimpl(int i8, Object obj) {
        return (obj instanceof HapticFeedbackType) && i8 == ((HapticFeedbackType) obj).m3546unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3543equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3544hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3545toStringimpl(int i8) {
        Companion companion = Companion;
        if (m3543equalsimpl0(i8, companion.m3547getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m3543equalsimpl0(i8, companion.m3548getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3542equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3544hashCodeimpl(this.value);
    }

    public String toString() {
        return m3545toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3546unboximpl() {
        return this.value;
    }
}
