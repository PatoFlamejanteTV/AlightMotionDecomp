package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes.dex */
public interface WindowInsets {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    int getBottom(Density density);

    int getLeft(Density density, LayoutDirection layoutDirection);

    int getRight(Density density, LayoutDirection layoutDirection);

    int getTop(Density density);
}
