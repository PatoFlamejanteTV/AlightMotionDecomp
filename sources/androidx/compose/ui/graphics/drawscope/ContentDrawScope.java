package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;

/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3406drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9) {
            a.a(contentDrawScope, imageBitmap, j8, j9, j10, j11, f8, drawStyle, colorFilter, i8, i9);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3407getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return a.b(contentDrawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3408getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return a.c(contentDrawScope);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3409roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j8) {
            return a.d(contentDrawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3410roundToPx0680j_4(ContentDrawScope contentDrawScope, float f8) {
            return a.e(contentDrawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3411toDpGaN1DYA(ContentDrawScope contentDrawScope, long j8) {
            return a.f(contentDrawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3412toDpu2uoSUM(ContentDrawScope contentDrawScope, float f8) {
            return a.g(contentDrawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3414toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j8) {
            return a.i(contentDrawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3415toPxR2X_6o(ContentDrawScope contentDrawScope, long j8) {
            return a.j(contentDrawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3416toPx0680j_4(ContentDrawScope contentDrawScope, float f8) {
            return a.k(contentDrawScope, f8);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return a.l(contentDrawScope, dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3417toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j8) {
            return a.m(contentDrawScope, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3418toSp0xMU5do(ContentDrawScope contentDrawScope, float f8) {
            return a.n(contentDrawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3419toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f8) {
            return a.o(contentDrawScope, f8);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3413toDpu2uoSUM(ContentDrawScope contentDrawScope, int i8) {
            return a.h(contentDrawScope, i8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3420toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i8) {
            return a.p(contentDrawScope, i8);
        }
    }

    void drawContent();
}
