package androidx.window.embedding;

import R5.AbstractC1435t;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        AbstractC3292y.i(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        AbstractC3292y.i(pair, "<this>");
        return (S) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3, reason: not valid java name */
    public static final boolean m5450translateActivityIntentPredicates$lambda3(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(splitPairFilters, "$splitPairFilters");
        AbstractC3292y.h(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Intent intent = (Intent) this$0.component2(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1, reason: not valid java name */
    public static final boolean m5451translateActivityPairPredicates$lambda1(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(splitPairFilters, "$splitPairFilters");
        AbstractC3292y.h(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Activity activity2 = (Activity) this$0.component2(pair);
        Set set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6, reason: not valid java name */
    public static final boolean m5452translateActivityPredicates$lambda6(Set activityFilters, Activity activity) {
        AbstractC3292y.i(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            AbstractC3292y.h(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8, reason: not valid java name */
    public static final boolean m5453translateIntentPredicates$lambda8(Set activityFilters, Intent intent) {
        AbstractC3292y.i(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            AbstractC3292y.h(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4, reason: not valid java name */
    public static final boolean m5454translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        AbstractC3292y.i(splitRule, "$splitRule");
        AbstractC3292y.h(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        AbstractC3292y.i(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(final Set<SplitPairFilter> splitPairFilters) {
        AbstractC3292y.i(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m5450translateActivityIntentPredicates$lambda3;
                m5450translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m5450translateActivityIntentPredicates$lambda3(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m5450translateActivityIntentPredicates$lambda3;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(final Set<SplitPairFilter> splitPairFilters) {
        AbstractC3292y.i(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.c
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m5451translateActivityPairPredicates$lambda1;
                m5451translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m5451translateActivityPairPredicates$lambda1(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m5451translateActivityPairPredicates$lambda1;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> translateActivityPredicates(final Set<ActivityFilter> activityFilters) {
        AbstractC3292y.i(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m5452translateActivityPredicates$lambda6;
                m5452translateActivityPredicates$lambda6 = EmbeddingAdapter.m5452translateActivityPredicates$lambda6(activityFilters, (Activity) obj);
                return m5452translateActivityPredicates$lambda6;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> translateIntentPredicates(final Set<ActivityFilter> activityFilters) {
        AbstractC3292y.i(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.a
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m5453translateIntentPredicates$lambda8;
                m5453translateIntentPredicates$lambda8 = EmbeddingAdapter.m5453translateIntentPredicates$lambda8(activityFilters, (Intent) obj);
                return m5453translateIntentPredicates$lambda8;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(final SplitRule splitRule) {
        AbstractC3292y.i(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.b
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m5454translateParentMetricsPredicate$lambda4;
                m5454translateParentMetricsPredicate$lambda4 = EmbeddingAdapter.m5454translateParentMetricsPredicate$lambda4(SplitRule.this, (WindowMetrics) obj);
                return m5454translateParentMetricsPredicate$lambda4;
            }
        };
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z8;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        AbstractC3292y.h(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z9 = false;
        try {
            z8 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z8 = false;
        }
        List activities = primaryActivityStack.getActivities();
        AbstractC3292y.h(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z8);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        AbstractC3292y.h(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z9 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        AbstractC3292y.h(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z9), splitInfo.getSplitRatio());
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule build;
        AbstractC3292y.i(rules, "rules");
        Set<? extends EmbeddingRule> set = rules;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                build = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                AbstractC3292y.h(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                AbstractC3292y.h(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                build = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                AbstractC3292y.h(build, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) build);
        }
        return AbstractC1435t.b1(arrayList);
    }
}
