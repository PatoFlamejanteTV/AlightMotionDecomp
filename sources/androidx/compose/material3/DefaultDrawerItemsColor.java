package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {
    private final long selectedBadgeColor;
    private final long selectedContainerColor;
    private final long selectedIconColor;
    private final long selectedTextColor;
    private final long unselectedBadgeColor;
    private final long unselectedContainerColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> badgeColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-561675044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561675044, i8, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:815)");
        }
        if (z8) {
            j8 = this.selectedBadgeColor;
        } else {
            j8 = this.unselectedBadgeColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> containerColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-433512770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-433512770, i8, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:808)");
        }
        if (z8) {
            j8 = this.selectedContainerColor;
        } else {
            j8 = this.unselectedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.m2949equalsimpl0(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.m2949equalsimpl0(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.m2949equalsimpl0(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.m2949equalsimpl0(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.m2949equalsimpl0(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.m2949equalsimpl0(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.m2949equalsimpl0(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor) && Color.m2949equalsimpl0(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getSelectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1571getSelectedBadgeColor0d7_KjU() {
        return this.selectedBadgeColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1572getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1573getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1574getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m1575getUnselectedBadgeColor0d7_KjU() {
        return this.unselectedBadgeColor;
    }

    /* renamed from: getUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1576getUnselectedContainerColor0d7_KjU() {
        return this.unselectedContainerColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m1577getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m1578getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return (((((((((((((Color.m2955hashCodeimpl(this.selectedIconColor) * 31) + Color.m2955hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m2955hashCodeimpl(this.selectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m2955hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m2955hashCodeimpl(this.unselectedContainerColor)) * 31) + Color.m2955hashCodeimpl(this.selectedBadgeColor)) * 31) + Color.m2955hashCodeimpl(this.unselectedBadgeColor);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> iconColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1141354218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1141354218, i8, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:798)");
        }
        if (z8) {
            j8 = this.selectedIconColor;
        } else {
            j8 = this.unselectedIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    @Composable
    public State<Color> textColor(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(1275109558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275109558, i8, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:803)");
        }
        if (z8) {
            j8 = this.selectedTextColor;
        } else {
            j8 = this.unselectedTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    private DefaultDrawerItemsColor(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.selectedIconColor = j8;
        this.unselectedIconColor = j9;
        this.selectedTextColor = j10;
        this.unselectedTextColor = j11;
        this.selectedContainerColor = j12;
        this.unselectedContainerColor = j13;
        this.selectedBadgeColor = j14;
        this.unselectedBadgeColor = j15;
    }
}
