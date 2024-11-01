package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
/* loaded from: classes.dex */
public interface FontScaling {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5264toDpGaN1DYA(FontScaling fontScaling, long j8) {
            return b.c(fontScaling, j8);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5265toSp0xMU5do(FontScaling fontScaling, float f8) {
            return b.d(fontScaling, f8);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA */
    float mo420toDpGaN1DYA(long j8);

    @Stable
    /* renamed from: toSp-0xMU5do */
    long mo427toSp0xMU5do(float f8);
}
