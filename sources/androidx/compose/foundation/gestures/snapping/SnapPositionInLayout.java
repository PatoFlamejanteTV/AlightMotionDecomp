package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface SnapPositionInLayout {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SnapPositionInLayout CenterToCenter = new SnapPositionInLayout() { // from class: androidx.compose.foundation.gestures.snapping.SnapPositionInLayout$Companion$CenterToCenter$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
            public final int position(Density SnapPositionInLayout, int i8, int i9, int i10) {
                AbstractC3292y.i(SnapPositionInLayout, "$this$SnapPositionInLayout");
                return (i8 / 2) - (i9 / 2);
            }
        };

        private Companion() {
        }

        public final SnapPositionInLayout getCenterToCenter() {
            return CenterToCenter;
        }
    }

    int position(Density density, int i8, int i9, int i10);
}
