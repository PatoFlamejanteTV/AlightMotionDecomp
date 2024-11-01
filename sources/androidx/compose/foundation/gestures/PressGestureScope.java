package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m406roundToPxR2X_6o(PressGestureScope pressGestureScope, long j8) {
            int a9;
            a9 = androidx.compose.ui.unit.a.a(pressGestureScope, j8);
            return a9;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m407roundToPx0680j_4(PressGestureScope pressGestureScope, float f8) {
            int b9;
            b9 = androidx.compose.ui.unit.a.b(pressGestureScope, f8);
            return b9;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m408toDpGaN1DYA(PressGestureScope pressGestureScope, long j8) {
            float a9;
            a9 = androidx.compose.ui.unit.b.a(pressGestureScope, j8);
            return a9;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m409toDpu2uoSUM(PressGestureScope pressGestureScope, float f8) {
            float c8;
            c8 = androidx.compose.ui.unit.a.c(pressGestureScope, f8);
            return c8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m411toDpSizekrfVVM(PressGestureScope pressGestureScope, long j8) {
            long e8;
            e8 = androidx.compose.ui.unit.a.e(pressGestureScope, j8);
            return e8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m412toPxR2X_6o(PressGestureScope pressGestureScope, long j8) {
            float f8;
            f8 = androidx.compose.ui.unit.a.f(pressGestureScope, j8);
            return f8;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m413toPx0680j_4(PressGestureScope pressGestureScope, float f8) {
            float g8;
            g8 = androidx.compose.ui.unit.a.g(pressGestureScope, f8);
            return g8;
        }

        @Stable
        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect receiver) {
            Rect h8;
            AbstractC3292y.i(receiver, "$receiver");
            h8 = androidx.compose.ui.unit.a.h(pressGestureScope, receiver);
            return h8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m414toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j8) {
            long i8;
            i8 = androidx.compose.ui.unit.a.i(pressGestureScope, j8);
            return i8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m415toSp0xMU5do(PressGestureScope pressGestureScope, float f8) {
            long b9;
            b9 = androidx.compose.ui.unit.b.b(pressGestureScope, f8);
            return b9;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m416toSpkPz2Gy4(PressGestureScope pressGestureScope, float f8) {
            long j8;
            j8 = androidx.compose.ui.unit.a.j(pressGestureScope, f8);
            return j8;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m410toDpu2uoSUM(PressGestureScope pressGestureScope, int i8) {
            float d8;
            d8 = androidx.compose.ui.unit.a.d(pressGestureScope, i8);
            return d8;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m417toSpkPz2Gy4(PressGestureScope pressGestureScope, int i8) {
            long k8;
            k8 = androidx.compose.ui.unit.a.k(pressGestureScope, i8);
            return k8;
        }
    }

    Object awaitRelease(U5.d dVar);

    Object tryAwaitRelease(U5.d dVar);
}
