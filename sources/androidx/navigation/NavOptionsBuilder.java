package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavOptions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@NavOptionsDsl
/* loaded from: classes3.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private String popUpToRoute;
    private boolean restoreState;
    private boolean saveState;
    private final NavOptions.Builder builder = new NavOptions.Builder();

    @IdRes
    private int popUpToId = -1;

    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i8, Function1 function1, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$1.INSTANCE;
        }
        navOptionsBuilder.popUpTo(i8, function1);
    }

    private final void setPopUpToRoute(String str) {
        if (str != null) {
            if (!n.T(str)) {
                this.popUpToRoute = str;
                this.inclusive = false;
                return;
            }
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
    }

    public final void anim(Function1 animBuilder) {
        AbstractC3292y.i(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.setEnterAnim(animBuilder2.getEnter()).setExitAnim(animBuilder2.getExit()).setPopEnterAnim(animBuilder2.getPopEnter()).setPopExitAnim(animBuilder2.getPopExit());
    }

    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
        }
        return builder.build();
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final int getPopUpTo() {
        return this.popUpToId;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void popUpTo(@IdRes int i8, Function1 popUpToBuilder) {
        AbstractC3292y.i(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(i8);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }

    public final void setLaunchSingleTop(boolean z8) {
        this.launchSingleTop = z8;
    }

    public final void setPopUpTo(int i8) {
        popUpTo$default(this, i8, (Function1) null, 2, (Object) null);
    }

    public final void setPopUpToId$navigation_common_release(int i8) {
        this.popUpToId = i8;
        this.inclusive = false;
    }

    public final void setRestoreState(boolean z8) {
        this.restoreState = z8;
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$2.INSTANCE;
        }
        navOptionsBuilder.popUpTo(str, function1);
    }

    public final void popUpTo(String route, Function1 popUpToBuilder) {
        AbstractC3292y.i(route, "route");
        AbstractC3292y.i(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }
}
