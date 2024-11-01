package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;

    @IdRes
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;

        @IdRes
        private int popUpToId = -1;

        @AnimRes
        @AnimatorRes
        private int enterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int exitAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popEnterAnim = -1;

        @AnimRes
        @AnimatorRes
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i8, boolean z8, boolean z9, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo(i8, z8, z9);
        }

        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final Builder setEnterAnim(@AnimRes @AnimatorRes int i8) {
            this.enterAnim = i8;
            return this;
        }

        public final Builder setExitAnim(@AnimRes @AnimatorRes int i8) {
            this.exitAnim = i8;
            return this;
        }

        public final Builder setLaunchSingleTop(boolean z8) {
            this.singleTop = z8;
            return this;
        }

        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int i8) {
            this.popEnterAnim = i8;
            return this;
        }

        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int i8) {
            this.popExitAnim = i8;
            return this;
        }

        public final Builder setPopUpTo(@IdRes int i8, boolean z8) {
            return setPopUpTo$default(this, i8, z8, false, 4, (Object) null);
        }

        public final Builder setRestoreState(boolean z8) {
            this.restoreState = z8;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z8, boolean z9, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            return builder.setPopUpTo(str, z8, z9);
        }

        public final Builder setPopUpTo(String str, boolean z8) {
            return setPopUpTo$default(this, str, z8, false, 4, (Object) null);
        }

        public final Builder setPopUpTo(@IdRes int i8, boolean z8, boolean z9) {
            this.popUpToId = i8;
            this.popUpToRoute = null;
            this.popUpToInclusive = z8;
            this.popUpToSaveState = z9;
            return this;
        }

        public final Builder setPopUpTo(String str, boolean z8, boolean z9) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z8;
            this.popUpToSaveState = z9;
            return this;
        }
    }

    public NavOptions(boolean z8, boolean z9, @IdRes int i8, boolean z10, boolean z11, @AnimRes @AnimatorRes int i9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        this.singleTop = z8;
        this.restoreState = z9;
        this.popUpToId = i8;
        this.popUpToInclusive = z10;
        this.popUpToSaveState = z11;
        this.enterAnim = i9;
        this.exitAnim = i10;
        this.popEnterAnim = i11;
        this.popExitAnim = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && AbstractC3292y.d(this.popUpToRoute, navOptions.popUpToRoute) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
            return true;
        }
        return false;
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.exitAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @IdRes
    public final int getPopUpTo() {
        return this.popUpToId;
    }

    @IdRes
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public int hashCode() {
        int i8;
        int i9 = (((((shouldLaunchSingleTop() ? 1 : 0) * 31) + (shouldRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        return ((((((((((((i9 + i8) * 31) + (isPopUpToInclusive() ? 1 : 0)) * 31) + (shouldPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final boolean isPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.singleTop;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean shouldRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavOptions.class.getSimpleName());
        sb.append("(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(this.popUpToId));
            }
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    public NavOptions(boolean z8, boolean z9, String str, boolean z10, boolean z11, int i8, int i9, int i10, int i11) {
        this(z8, z9, NavDestination.Companion.createRoute(str).hashCode(), z10, z11, i8, i9, i10, i11);
        this.popUpToRoute = str;
    }
}
