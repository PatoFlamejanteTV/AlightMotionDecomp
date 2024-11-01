package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        AbstractC3292y.i(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        AbstractC3292y.h(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        AbstractC3292y.h(className, "componentName.className");
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                if (n.G(packageName, "*", false, 2, null) && n.R(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
                    throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                }
                if (n.G(className, "*", false, 2, null) && n.R(className, "*", 0, false, 6, null) != className.length() - 1) {
                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        if (AbstractC3292y.d(this.componentName, activityFilter.componentName) && AbstractC3292y.d(this.intentAction, activityFilter.intentAction)) {
            return true;
        }
        return false;
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivity(Activity activity) {
        String action;
        AbstractC3292y.i(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    action = null;
                } else {
                    action = intent.getAction();
                }
                if (AbstractC3292y.d(str, action)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        AbstractC3292y.i(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str != null && !AbstractC3292y.d(str, intent.getAction())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
