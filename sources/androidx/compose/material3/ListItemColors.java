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
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class ListItemColors {
    private final long containerColor;
    private final long disabledHeadlineColor;
    private final long disabledLeadingIconColor;
    private final long disabledTrailingIconColor;
    private final long headlineColor;
    private final long leadingIconColor;
    private final long overlineColor;
    private final long supportingTextColor;
    private final long trailingIconColor;

    public /* synthetic */ ListItemColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Composable
    public final State<Color> containerColor$material3_release(Composer composer, int i8) {
        composer.startReplaceableGroup(-380363090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-380363090, i8, -1, "androidx.compose.material3.ListItemColors.containerColor (ListItem.kt:447)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(this.containerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> headlineColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-1254314043);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1254314043, i8, -1, "androidx.compose.material3.ListItemColors.headlineColor (ListItem.kt:453)");
        }
        if (z8) {
            j8 = this.headlineColor;
        } else {
            j8 = this.disabledHeadlineColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(694213044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(694213044, i8, -1, "androidx.compose.material3.ListItemColors.leadingIconColor (ListItem.kt:461)");
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
    public final State<Color> overlineColor$material3_release(Composer composer, int i8) {
        composer.startReplaceableGroup(-1467587733);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1467587733, i8, -1, "androidx.compose.material3.ListItemColors.overlineColor (ListItem.kt:469)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(this.overlineColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> supportingColor$material3_release(Composer composer, int i8) {
        composer.startReplaceableGroup(-1251828896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251828896, i8, -1, "androidx.compose.material3.ListItemColors.supportingColor (ListItem.kt:475)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(this.supportingTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z8, Composer composer, int i8) {
        long j8;
        composer.startReplaceableGroup(-778325338);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778325338, i8, -1, "androidx.compose.material3.ListItemColors.trailingIconColor (ListItem.kt:481)");
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

    private ListItemColors(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.containerColor = j8;
        this.headlineColor = j9;
        this.leadingIconColor = j10;
        this.overlineColor = j11;
        this.supportingTextColor = j12;
        this.trailingIconColor = j13;
        this.disabledHeadlineColor = j14;
        this.disabledLeadingIconColor = j15;
        this.disabledTrailingIconColor = j16;
    }
}
