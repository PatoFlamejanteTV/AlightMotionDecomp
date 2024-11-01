package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m3278getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m3289getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m3481getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m3482getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ Stroke(float f8, float f9, int i8, int i9, PathEffect pathEffect, AbstractC3284p abstractC3284p) {
        this(f8, f9, i8, i9, pathEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m3274equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m3284equalsimpl0(this.join, stroke.join) && AbstractC3292y.d(this.pathEffect, stroke.pathEffect)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m3479getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m3480getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i8;
        int floatToIntBits = ((((((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.miter)) * 31) + StrokeCap.m3275hashCodeimpl(this.cap)) * 31) + StrokeJoin.m3285hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        if (pathEffect != null) {
            i8 = pathEffect.hashCode();
        } else {
            i8 = 0;
        }
        return floatToIntBits + i8;
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m3276toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m3286toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f8, float f9, int i8, int i9, PathEffect pathEffect, int i10, AbstractC3284p abstractC3284p) {
        this((i10 & 1) != 0 ? 0.0f : f8, (i10 & 2) != 0 ? 4.0f : f9, (i10 & 4) != 0 ? DefaultCap : i8, (i10 & 8) != 0 ? DefaultJoin : i9, (i10 & 16) != 0 ? null : pathEffect, null);
    }

    private Stroke(float f8, float f9, int i8, int i9, PathEffect pathEffect) {
        super(null);
        this.width = f8;
        this.miter = f9;
        this.cap = i8;
        this.join = i9;
        this.pathEffect = pathEffect;
    }
}
