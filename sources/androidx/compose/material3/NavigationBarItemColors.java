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
public final class NavigationBarItemColors {
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ NavigationBarItemColors(long j8, long j9, long j10, long j11, long j12, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        if (Color.m2949equalsimpl0(this.selectedIconColor, navigationBarItemColors.selectedIconColor) && Color.m2949equalsimpl0(this.unselectedIconColor, navigationBarItemColors.unselectedIconColor) && Color.m2949equalsimpl0(this.selectedTextColor, navigationBarItemColors.selectedTextColor) && Color.m2949equalsimpl0(this.unselectedTextColor, navigationBarItemColors.unselectedTextColor) && Color.m2949equalsimpl0(this.selectedIndicatorColor, navigationBarItemColors.selectedIndicatorColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m1673getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    public int hashCode() {
        return (((((((Color.m2955hashCodeimpl(this.selectedIconColor) * 31) + Color.m2955hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.selectedIndicatorColor);
    }

    @Composable
    public final State<Color> iconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1510597389);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1510597389, i8, -1, "androidx.compose.material3.NavigationBarItemColors.iconColor (NavigationBar.kt:320)");
        }
        if (z8) {
            j8 = this.selectedIconColor;
        } else {
            j8 = this.unselectedIconColor;
        }
        State<Color> m163animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j8, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m163animateColorAsStateKTwxG1Y;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1773887143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1773887143, i8, -1, "androidx.compose.material3.NavigationBarItemColors.textColor (NavigationBar.kt:333)");
        }
        if (z8) {
            j8 = this.selectedTextColor;
        } else {
            j8 = this.unselectedTextColor;
        }
        State<Color> m163animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m163animateColorAsStateKTwxG1Y(j8, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m163animateColorAsStateKTwxG1Y;
    }

    private NavigationBarItemColors(long j8, long j9, long j10, long j11, long j12) {
        this.selectedIconColor = j8;
        this.selectedTextColor = j9;
        this.selectedIndicatorColor = j10;
        this.unselectedIconColor = j11;
        this.unselectedTextColor = j12;
    }
}
