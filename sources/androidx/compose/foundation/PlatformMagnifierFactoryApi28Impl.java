package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(28)
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    @StabilityInferred(parameters = 0)
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;
        private final Magnifier magnifier;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            AbstractC3292y.i(magnifier, "magnifier");
            this.magnifier = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }

        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: getSize-YbymL2g */
        public long mo344getSizeYbymL2g() {
            return IntSizeKt.IntSize(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo345updateWko1d7g(long j8, long j9, float f8) {
            this.magnifier.show(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }
    }

    private PlatformMagnifierFactoryApi28Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifierImpl create(MagnifierStyle style, View view, Density density, float f8) {
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(density, "density");
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
