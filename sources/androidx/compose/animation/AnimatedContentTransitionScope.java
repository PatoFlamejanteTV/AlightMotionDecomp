package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    /* renamed from: androidx.compose.animation.AnimatedContentTransitionScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EnterTransition a(AnimatedContentTransitionScope animatedContentTransitionScope, int i8, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
                }
                if ((i9 & 4) != 0) {
                    function1 = AnimatedContentTransitionScope$slideIntoContainer$1.INSTANCE;
                }
                return animatedContentTransitionScope.mo110slideIntoContainermOhB8PU(i8, finiteAnimationSpec, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExitTransition b(AnimatedContentTransitionScope animatedContentTransitionScope, int i8, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
                }
                if ((i9 & 4) != 0) {
                    function1 = AnimatedContentTransitionScope$slideOutOfContainer$1.INSTANCE;
                }
                return animatedContentTransitionScope.mo111slideOutOfContainermOhB8PU(i8, finiteAnimationSpec, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
    }

    @Immutable
    /* loaded from: classes.dex */
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m113constructorimpl(0);
        private static final int Right = m113constructorimpl(1);
        private static final int Up = m113constructorimpl(2);
        private static final int Down = m113constructorimpl(3);
        private static final int Start = m113constructorimpl(4);
        private static final int End = m113constructorimpl(5);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m119getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m120getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m121getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m122getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m123getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m124getUpDKzdypw() {
                return SlideDirection.Up;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ SlideDirection(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m112boximpl(int i8) {
            return new SlideDirection(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m113constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m114equalsimpl(int i8, Object obj) {
            return (obj instanceof SlideDirection) && i8 == ((SlideDirection) obj).m118unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m115equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m116hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m117toStringimpl(int i8) {
            if (m115equalsimpl0(i8, Left)) {
                return "Left";
            }
            if (m115equalsimpl0(i8, Right)) {
                return "Right";
            }
            if (m115equalsimpl0(i8, Up)) {
                return "Up";
            }
            if (m115equalsimpl0(i8, Down)) {
                return "Down";
            }
            if (m115equalsimpl0(i8, Start)) {
                return "Start";
            }
            if (m115equalsimpl0(i8, End)) {
                return "End";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m114equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m116hashCodeimpl(this.value);
        }

        public String toString() {
            return m117toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m118unboximpl() {
            return this.value;
        }
    }

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo110slideIntoContainermOhB8PU(int i8, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1 function1);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo111slideOutOfContainermOhB8PU(int i8, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1 function1);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);
}
