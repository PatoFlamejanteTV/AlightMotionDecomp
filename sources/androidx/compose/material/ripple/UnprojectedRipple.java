package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import i6.m;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        @DoNotInline
        public final void setRadius(RippleDrawable ripple, int i8) {
            AbstractC3292y.i(ripple, "ripple");
            ripple.setRadius(i8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnprojectedRipple(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.bounded = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.UnprojectedRipple.<init>(boolean):void");
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m1425calculateRippleColor5vOe2sY(long j8, float f8) {
        if (Build.VERSION.SDK_INT < 28) {
            f8 *= 2;
        }
        return Color.m2947copywmQWz5c$default(j8, m.f(f8, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        AbstractC3292y.h(dirtyBounds, "super.getDirtyBounds()");
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m1426setColorDxMtmZc(long j8, float f8) {
        boolean m2949equalsimpl0;
        long m1425calculateRippleColor5vOe2sY = m1425calculateRippleColor5vOe2sY(j8, f8);
        Color color = this.rippleColor;
        if (color == null) {
            m2949equalsimpl0 = false;
        } else {
            m2949equalsimpl0 = Color.m2949equalsimpl0(color.m2958unboximpl(), m1425calculateRippleColor5vOe2sY);
        }
        if (!m2949equalsimpl0) {
            this.rippleColor = Color.m2938boximpl(m1425calculateRippleColor5vOe2sY);
            setColor(ColorStateList.valueOf(ColorKt.m3002toArgb8_81llA(m1425calculateRippleColor5vOe2sY)));
        }
    }

    public final void trySetRadius(int i8) {
        Integer num = this.rippleRadius;
        if (num == null || num.intValue() != i8) {
            this.rippleRadius = Integer.valueOf(i8);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!setMaxRadiusFetched) {
                        setMaxRadiusFetched = true;
                        setMaxRadiusMethod = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = setMaxRadiusMethod;
                    if (method != null) {
                        method.invoke(this, Integer.valueOf(i8));
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            MRadiusHelper.INSTANCE.setRadius(this, i8);
        }
    }
}
