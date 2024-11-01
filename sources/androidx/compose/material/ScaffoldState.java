package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class ScaffoldState {
    public static final int $stable = 0;
    private final DrawerState drawerState;
    private final SnackbarHostState snackbarHostState;

    public ScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        AbstractC3292y.i(drawerState, "drawerState");
        AbstractC3292y.i(snackbarHostState, "snackbarHostState");
        this.drawerState = drawerState;
        this.snackbarHostState = snackbarHostState;
    }

    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
