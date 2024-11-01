package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!n.G(str2, "*", false, 2, null)) {
            return false;
        }
        if (AbstractC3292y.d(str2, "*")) {
            return true;
        }
        if (n.R(str2, "*", 0, false, 6, null) == n.X(str2, "*", 0, false, 6, null) && n.r(str2, "*", false, 2, null)) {
            String substring = str2.substring(0, str2.length() - 1);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return n.B(str, substring, false, 2, null);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r7, android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.AbstractC3292y.i(r8, r0)
            java.lang.String r0 = "*"
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.AbstractC3292y.d(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.AbstractC3292y.d(r7, r0)
            if (r7 == 0) goto L20
            r1 = 1
        L20:
            return r1
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = l6.n.G(r3, r0, r1, r4, r5)
            r0 = r0 ^ r2
            if (r0 == 0) goto L8d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r0, r3)
            if (r0 != 0) goto L5c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.AbstractC3292y.h(r3, r4)
            boolean r0 = r6.wildcardMatch(r0, r3)
            if (r0 == 0) goto L5a
            goto L5c
        L5a:
            r0 = 0
            goto L5d
        L5c:
            r0 = 1
        L5d:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.AbstractC3292y.d(r3, r4)
            if (r3 != 0) goto L86
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.AbstractC3292y.h(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.AbstractC3292y.h(r8, r3)
            boolean r7 = r6.wildcardMatch(r7, r8)
            if (r7 == 0) goto L84
            goto L86
        L84:
            r7 = 0
            goto L87
        L86:
            r7 = 1
        L87:
            if (r0 == 0) goto L8c
            if (r7 == 0) goto L8c
            r1 = 1
        L8c:
            return r1
        L8d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
