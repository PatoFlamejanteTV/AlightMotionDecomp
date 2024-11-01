package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activities, boolean z8) {
        AbstractC3292y.i(activities, "activities");
        this.activities = activities;
        this.isEmpty = z8;
    }

    public final boolean contains(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (!AbstractC3292y.d(this.activities, activityStack.activities) && this.isEmpty != activityStack.isEmpty) {
            return true;
        }
        return false;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(AbstractC3292y.q("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ ActivityStack(List list, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(list, (i8 & 2) != 0 ? false : z8);
    }
}
