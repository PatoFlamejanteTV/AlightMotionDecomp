package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = m3030constructorimpl(0);
    private static final int Offscreen = m3030constructorimpl(1);
    private static final int ModulateAlpha = m3030constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto--NrFUSI, reason: not valid java name */
        public final int m3036getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI, reason: not valid java name */
        public final int m3037getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI, reason: not valid java name */
        public final int m3038getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ CompositingStrategy(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m3029boximpl(int i8) {
        return new CompositingStrategy(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3030constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3031equalsimpl(int i8, Object obj) {
        return (obj instanceof CompositingStrategy) && i8 == ((CompositingStrategy) obj).m3035unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3032equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3033hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3034toStringimpl(int i8) {
        return "CompositingStrategy(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m3031equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3033hashCodeimpl(this.value);
    }

    public String toString() {
        return m3034toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3035unboximpl() {
        return this.value;
    }
}
