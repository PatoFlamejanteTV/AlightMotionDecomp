package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import i6.m;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@Navigator.Name("activity")
/* loaded from: classes3.dex */
public class ActivityNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final String LOG_TAG = "ActivityNavigator";
    private final Context context;
    private final Activity hostActivity;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final void applyPopAnimationsToPendingTransition(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
            if (intExtra != -1 || intExtra2 != -1) {
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                activity.overridePendingTransition(intExtra, intExtra2);
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @NavDestination.ClassType(Activity.class)
    /* loaded from: classes3.dex */
    public static class Destination extends NavDestination {
        private String action;
        private ComponentName component;
        private Uri data;
        private String dataPattern;
        private Intent intent;
        private String targetPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> activityNavigator) {
            super(activityNavigator);
            AbstractC3292y.i(activityNavigator, "activityNavigator");
        }

        private final String parseApplicationId(Context context, String str) {
            if (str != null) {
                String packageName = context.getPackageName();
                AbstractC3292y.h(packageName, "context.packageName");
                return n.z(str, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, null);
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object obj) {
            boolean z8;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Destination) && super.equals(obj)) {
                Intent intent = this.intent;
                if (intent != null) {
                    z8 = intent.filterEquals(((Destination) obj).intent);
                } else if (((Destination) obj).intent == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 && AbstractC3292y.d(this.dataPattern, ((Destination) obj).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public final String getDataPattern() {
            return this.dataPattern;
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int i8;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int i9 = 0;
            if (intent != null) {
                i8 = intent.filterHashCode();
            } else {
                i8 = 0;
            }
            int i10 = (hashCode + i8) * 31;
            String str = this.dataPattern;
            if (str != null) {
                i9 = str.hashCode();
            }
            return i10 + i9;
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attrs) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.ActivityNavigator);
            AbstractC3292y.h(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            setTargetPackage(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                setComponentName(new ComponentName(context, string));
            }
            setAction(obtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String parseApplicationId = parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (parseApplicationId != null) {
                setData(Uri.parse(parseApplicationId));
            }
            setDataPattern(parseApplicationId(context, obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            obtainAttributes.recycle();
        }

        public final Destination setAction(String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC3292y.f(intent);
            intent.setAction(str);
            return this;
        }

        public final Destination setComponentName(ComponentName componentName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC3292y.f(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final Destination setData(Uri uri) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC3292y.f(intent);
            intent.setData(uri);
            return this;
        }

        public final Destination setDataPattern(String str) {
            this.dataPattern = str;
            return this;
        }

        public final Destination setIntent(Intent intent) {
            this.intent = intent;
            return this;
        }

        public final Destination setTargetPackage(String str) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            AbstractC3292y.f(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            AbstractC3292y.i(navigatorProvider, "navigatorProvider");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Extras implements Navigator.Extras {
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        /* loaded from: classes3.dex */
        public static final class Builder {
            private ActivityOptionsCompat activityOptions;
            private int flags;

            public final Builder addFlags(int i8) {
                this.flags = i8 | this.flags;
                return this;
            }

            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }

            public final Builder setActivityOptions(ActivityOptionsCompat activityOptions) {
                AbstractC3292y.i(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public Extras(int i8, ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i8;
            this.activityOptions = activityOptionsCompat;
        }

        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        public final int getFlags() {
            return this.flags;
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        AbstractC3292y.i(context, "context");
        this.context = context;
        Iterator it = AbstractC3258j.h(context, ActivityNavigator$hostActivity$1.INSTANCE).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.hostActivity = (Activity) obj;
    }

    public static final void applyPopAnimationsToPendingTransition(Activity activity) {
        Companion.applyPopAnimationsToPendingTransition(activity);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.navigation.Navigator
    public NavDestination navigate(Destination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intent intent;
        int intExtra;
        AbstractC3292y.i(destination, "destination");
        if (destination.getIntent() != null) {
            Intent intent2 = new Intent(destination.getIntent());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String dataPattern = destination.getDataPattern();
                if (dataPattern != null && dataPattern.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + dataPattern);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z8 = extras instanceof Extras;
            if (z8) {
                intent2.addFlags(((Extras) extras).getFlags());
            }
            if (this.hostActivity == null) {
                intent2.addFlags(268435456);
            }
            if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.hostActivity;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
                intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
            }
            intent2.putExtra(EXTRA_NAV_CURRENT, destination.getId());
            Resources resources = this.context.getResources();
            if (navOptions != null) {
                int popEnterAnim = navOptions.getPopEnterAnim();
                int popExitAnim = navOptions.getPopExitAnim();
                if ((popEnterAnim > 0 && AbstractC3292y.d(resources.getResourceTypeName(popEnterAnim), "animator")) || (popExitAnim > 0 && AbstractC3292y.d(resources.getResourceTypeName(popExitAnim), "animator"))) {
                    Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
                } else {
                    intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                    intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim);
                }
            }
            if (z8) {
                ActivityOptionsCompat activityOptions = ((Extras) extras).getActivityOptions();
                if (activityOptions != null) {
                    ContextCompat.startActivity(this.context, intent2, activityOptions.toBundle());
                } else {
                    this.context.startActivity(intent2);
                }
            } else {
                this.context.startActivity(intent2);
            }
            if (navOptions == null || this.hostActivity == null) {
                return null;
            }
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim <= 0 || !AbstractC3292y.d(resources.getResourceTypeName(enterAnim), "animator")) && (exitAnim <= 0 || !AbstractC3292y.d(resources.getResourceTypeName(exitAnim), "animator"))) {
                if (enterAnim < 0 && exitAnim < 0) {
                    return null;
                }
                this.hostActivity.overridePendingTransition(m.d(enterAnim, 0), m.d(exitAnim, 0));
                return null;
            }
            Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
    }
}
