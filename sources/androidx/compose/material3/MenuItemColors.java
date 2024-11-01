package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class MenuItemColors {
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    public /* synthetic */ MenuItemColors(long j8, long j9, long j10, long j11, long j12, long j13, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        if (Color.m2949equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m2949equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m2949equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m2949equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m2949equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m2949equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m2955hashCodeimpl(this.textColor) * 31) + Color.m2955hashCodeimpl(this.leadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.trailingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTextColor)) * 31) + Color.m2955hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m2955hashCodeimpl(this.disabledTrailingIconColor);
    }

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1521013607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1521013607, i8, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:393)");
        }
        if (z8) {
            j8 = this.leadingIconColor;
        } else {
            j8 = this.disabledLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1023108655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1023108655, i8, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:383)");
        }
        if (z8) {
            j8 = this.textColor;
        } else {
            j8 = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1024062809);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1024062809, i8, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:403)");
        }
        if (z8) {
            j8 = this.trailingIconColor;
        } else {
            j8 = this.disabledTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private MenuItemColors(long j8, long j9, long j10, long j11, long j12, long j13) {
        this.textColor = j8;
        this.leadingIconColor = j9;
        this.trailingIconColor = j10;
        this.disabledTextColor = j11;
        this.disabledLeadingIconColor = j12;
        this.disabledTrailingIconColor = j13;
    }
}
