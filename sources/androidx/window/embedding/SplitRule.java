package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final Rect getBounds(WindowMetrics windowMetrics) {
            AbstractC3292y.i(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            AbstractC3292y.h(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean checkParentMetrics(WindowMetrics parentMetrics) {
        boolean z8;
        boolean z9;
        AbstractC3292y.i(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(parentMetrics);
        if (this.minWidth != 0 && bounds.width() < this.minWidth) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (this.minSmallestWidth != 0 && Math.min(bounds.width(), bounds.height()) < this.minSmallestWidth) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.minWidth == splitRule.minWidth && this.minSmallestWidth == splitRule.minSmallestWidth && this.splitRatio == splitRule.splitRatio && this.layoutDirection == splitRule.layoutDirection) {
            return true;
        }
        return false;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public /* synthetic */ SplitRule(int i8, int i9, float f8, int i10, int i11, AbstractC3284p abstractC3284p) {
        this((i11 & 1) != 0 ? 0 : i8, (i11 & 2) != 0 ? 0 : i9, (i11 & 4) != 0 ? 0.5f : f8, (i11 & 8) != 0 ? 3 : i10);
    }

    public SplitRule(int i8, int i9, float f8, int i10) {
        this.minWidth = i8;
        this.minSmallestWidth = i9;
        this.splitRatio = f8;
        this.layoutDirection = i10;
    }
}
