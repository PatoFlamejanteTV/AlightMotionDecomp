package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class MagnifierStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MagnifierStyle Default;
    private static final MagnifierStyle TextDefault;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i8);
        }

        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public final boolean isStyleSupported$foundation_release(MagnifierStyle style, int i8) {
            AbstractC3292y.i(style, "style");
            if (!MagnifierKt.isPlatformMagnifierSupported(i8) || style.getFishEyeEnabled$foundation_release()) {
                return false;
            }
            if (!style.getUseTextDefault$foundation_release() && !AbstractC3292y.d(style, getDefault()) && i8 < 29) {
                return false;
            }
            return true;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (AbstractC3284p) null);
        Default = magnifierStyle;
        TextDefault = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (AbstractC3284p) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j8, float f8, float f9, boolean z8, boolean z9, AbstractC3284p abstractC3284p) {
        this(j8, f8, f9, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) obj;
        if (this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m5250equalsimpl0(this.size, magnifierStyle.size) && Dp.m5160equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && Dp.m5160equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled$foundation_release() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release, reason: not valid java name */
    public final float m321getCornerRadiusD9Ej5fM$foundation_release() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release, reason: not valid java name */
    public final float m322getElevationD9Ej5fM$foundation_release() {
        return this.elevation;
    }

    public final boolean getFishEyeEnabled$foundation_release() {
        return this.fishEyeEnabled;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release, reason: not valid java name */
    public final long m323getSizeMYxV2XQ$foundation_release() {
        return this.size;
    }

    public final boolean getUseTextDefault$foundation_release() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((a.a(this.useTextDefault) * 31) + DpSize.m5255hashCodeimpl(this.size)) * 31) + Dp.m5161hashCodeimpl(this.cornerRadius)) * 31) + Dp.m5161hashCodeimpl(this.elevation)) * 31) + a.a(this.clippingEnabled)) * 31) + a.a(this.fishEyeEnabled);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(Companion, this, 0, 2, null);
    }

    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.m5260toStringimpl(this.size)) + ", cornerRadius=" + ((Object) Dp.m5166toStringimpl(this.cornerRadius)) + ", elevation=" + ((Object) Dp.m5166toStringimpl(this.elevation)) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }

    public /* synthetic */ MagnifierStyle(boolean z8, long j8, float f8, float f9, boolean z9, boolean z10, AbstractC3284p abstractC3284p) {
        this(z8, j8, f8, f9, z9, z10);
    }

    private MagnifierStyle(boolean z8, long j8, float f8, float f9, boolean z9, boolean z10) {
        this.useTextDefault = z8;
        this.size = j8;
        this.cornerRadius = f8;
        this.elevation = f9;
        this.clippingEnabled = z9;
        this.fishEyeEnabled = z10;
    }

    public /* synthetic */ MagnifierStyle(long j8, float f8, float f9, boolean z8, boolean z9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? DpSize.Companion.m5262getUnspecifiedMYxV2XQ() : j8, (i8 & 2) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f8, (i8 & 4) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f9, (i8 & 8) != 0 ? true : z8, (i8 & 16) != 0 ? false : z9, (AbstractC3284p) null);
    }

    private MagnifierStyle(long j8, float f8, float f9, boolean z8, boolean z9) {
        this(false, j8, f8, f9, z8, z9, (AbstractC3284p) null);
    }
}
