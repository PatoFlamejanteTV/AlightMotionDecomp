package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavAction {
    private Bundle defaultArguments;

    @IdRes
    private final int destinationId;
    private NavOptions navOptions;

    public NavAction(@IdRes int i8) {
        this(i8, null, null, 6, null);
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.destinationId == navAction.destinationId && AbstractC3292y.d(this.navOptions, navAction.navOptions)) {
            if (AbstractC3292y.d(this.defaultArguments, navAction.defaultArguments)) {
                return true;
            }
            Bundle bundle = this.defaultArguments;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.defaultArguments;
                    Object obj3 = null;
                    if (bundle2 != null) {
                        obj2 = bundle2.get(str);
                    } else {
                        obj2 = null;
                    }
                    Bundle bundle3 = navAction.defaultArguments;
                    if (bundle3 != null) {
                        obj3 = bundle3.get(str);
                    }
                    if (!AbstractC3292y.d(obj2, obj3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        int i8;
        Set<String> keySet;
        Object obj;
        int i9;
        int i10 = this.destinationId * 31;
        NavOptions navOptions = this.navOptions;
        if (navOptions != null) {
            i8 = navOptions.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = i10 + i8;
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i12 = i11 * 31;
                Bundle bundle2 = this.defaultArguments;
                if (bundle2 != null) {
                    obj = bundle2.get(str);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i9 = obj.hashCode();
                } else {
                    i9 = 0;
                }
                i11 = i12 + i9;
            }
        }
        return i11;
    }

    public final void setDefaultArguments(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavAction.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    public NavAction(@IdRes int i8, NavOptions navOptions) {
        this(i8, navOptions, null, 4, null);
    }

    public NavAction(@IdRes int i8, NavOptions navOptions, Bundle bundle) {
        this.destinationId = i8;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public /* synthetic */ NavAction(int i8, NavOptions navOptions, Bundle bundle, int i9, AbstractC3284p abstractC3284p) {
        this(i8, (i9 & 2) != 0 ? null : navOptions, (i9 & 4) != 0 ? null : bundle);
    }
}
