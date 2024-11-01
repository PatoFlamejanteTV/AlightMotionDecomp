package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
/* loaded from: classes.dex */
public final class NavigationRailItemColors {
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationRailItemColors(long j8, long j9, long j10, long j11, long j12, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        if (Color.m2949equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m2949equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m2949equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m2949equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m2949equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor)) {
            return true;
        }
        return false;
    }

    @Composable
    public final long getIndicatorColor(Composer composer, int i8) {
        composer.startReplaceableGroup(618271448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618271448, i8, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:341)");
        }
        long j8 = this.selectedIndicatorColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j8;
    }

    public int hashCode() {
        return (((((((Color.m2955hashCodeimpl(this.selectedIconColor) * 31) + Color.m2955hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.selectedIndicatorColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(665215869);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(665215869, i8, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:318)");
        }
        if (z8) {
            j8 = this.selectedIconColor;
        } else {
            j8 = this.unselectedIconColor;
        }
        State<Color> m163animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j8, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m163animateColorAsStateKTwxG1Y;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(253888561);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(253888561, i8, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:331)");
        }
        if (z8) {
            j8 = this.selectedTextColor;
        } else {
            j8 = this.unselectedTextColor;
        }
        State<Color> m163animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j8, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m163animateColorAsStateKTwxG1Y;
    }

    private NavigationRailItemColors(long j8, long j9, long j10, long j11, long j12) {
        this.selectedIconColor = j8;
        this.selectedTextColor = j9;
        this.selectedIndicatorColor = j10;
        this.unselectedIconColor = j11;
        this.unselectedTextColor = j12;
    }
}
