package androidx.navigation.compose;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import c6.InterfaceC2072n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$15 extends l implements InterfaceC2072n {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$15(Transition<NavBackStackEntry> transition, Map<String, Float> map, State<? extends List<NavBackStackEntry>> state, ComposeNavigator composeNavigator, d dVar) {
        super(2, dVar);
        this.$transition = transition;
        this.$zIndices = map;
        this.$visibleEntries$delegate = state;
        this.$composeNavigator = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new NavHostKt$NavHost$15(this.$transition, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List NavHost$lambda$6;
        b.e();
        if (this.label == 0) {
            t.b(obj);
            if (AbstractC3292y.d(this.$transition.getCurrentState(), this.$transition.getTargetState())) {
                NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
                ComposeNavigator composeNavigator = this.$composeNavigator;
                Iterator it = NavHost$lambda$6.iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
                Map<String, Float> map = this.$zIndices;
                Transition<NavBackStackEntry> transition = this.$transition;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!AbstractC3292y.d(entry.getKey(), transition.getTargetState().getId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map<String, Float> map2 = this.$zIndices;
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map2.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((NavHostKt$NavHost$15) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
