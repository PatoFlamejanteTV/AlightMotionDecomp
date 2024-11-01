package androidx.compose.ui.unit;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface FontScalingLinear {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5268toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j8) {
            float a9;
            a9 = c.a(fontScalingLinear, j8);
            return a9;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5269toSp0xMU5do(FontScalingLinear fontScalingLinear, float f8) {
            long b9;
            b9 = c.b(fontScalingLinear, f8);
            return b9;
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    float m5266toDpGaN1DYA(long j8);

    @Stable
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    long m5267toSp0xMU5do(float f8);
}
