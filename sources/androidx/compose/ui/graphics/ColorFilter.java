package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public class ColorFilter {
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m2989tintxETnrds$default(Companion companion, long j8, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = BlendMode.Companion.m2894getSrcIn0nO6VwU();
            }
            return companion.m2992tintxETnrds(j8, i8);
        }

        @Stable
        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m2990colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (AbstractC3284p) null);
        }

        @Stable
        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m2991lightingOWjLjI(long j8, long j9) {
            return new LightingColorFilter(j8, j9, (AbstractC3284p) null);
        }

        @Stable
        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m2992tintxETnrds(long j8, int i8) {
            return new BlendModeColorFilter(j8, i8, (AbstractC3284p) null);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
