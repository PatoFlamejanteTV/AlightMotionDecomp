package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import androidx.navigation.ActivityNavigator;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private InterfaceC3214c activityClass;
    private Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, @IdRes int i8) {
        super(navigator, i8);
        AbstractC3292y.i(navigator, "navigator");
        this.context = navigator.getContext();
    }

    public final String getAction() {
        return this.action;
    }

    public final InterfaceC3214c getActivityClass() {
        return this.activityClass;
    }

    public final Uri getData() {
        return this.data;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityClass(InterfaceC3214c interfaceC3214c) {
        this.activityClass = interfaceC3214c;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.NavDestinationBuilder
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        InterfaceC3214c interfaceC3214c = this.activityClass;
        if (interfaceC3214c != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) AbstractC1989a.a(interfaceC3214c)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator navigator, String route) {
        super(navigator, route);
        AbstractC3292y.i(navigator, "navigator");
        AbstractC3292y.i(route, "route");
        this.context = navigator.getContext();
    }
}
