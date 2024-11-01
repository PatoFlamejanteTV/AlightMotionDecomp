package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m4086constructorimpl(1);
        private static final int After = m4086constructorimpl(2);
        private static final int Left = m4086constructorimpl(3);
        private static final int Right = m4086constructorimpl(4);
        private static final int Above = m4086constructorimpl(5);
        private static final int Below = m4086constructorimpl(6);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m4092getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m4093getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m4094getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m4095getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m4096getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m4097getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ LayoutDirection(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m4085boximpl(int i8) {
            return new LayoutDirection(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4086constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4087equalsimpl(int i8, Object obj) {
            return (obj instanceof LayoutDirection) && i8 == ((LayoutDirection) obj).m4091unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4088equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4089hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4090toStringimpl(int i8) {
            if (m4088equalsimpl0(i8, Before)) {
                return "Before";
            }
            if (m4088equalsimpl0(i8, After)) {
                return "After";
            }
            if (m4088equalsimpl0(i8, Left)) {
                return "Left";
            }
            if (m4088equalsimpl0(i8, Right)) {
                return "Right";
            }
            if (m4088equalsimpl0(i8, Above)) {
                return "Above";
            }
            if (m4088equalsimpl0(i8, Below)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m4087equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4089hashCodeimpl(this.value);
        }

        public String toString() {
            return m4090toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4091unboximpl() {
            return this.value;
        }
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo729layouto7g1Pn8(int i8, Function1 function1);
}
