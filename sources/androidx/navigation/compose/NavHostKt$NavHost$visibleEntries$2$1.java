package androidx.navigation.compose;

import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$visibleEntries$2$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ State<List<NavBackStackEntry>> $allVisibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$visibleEntries$2$1(State<? extends List<NavBackStackEntry>> state) {
        super(0);
        this.$allVisibleEntries$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<NavBackStackEntry> invoke() {
        List NavHost$lambda$4;
        NavHost$lambda$4 = NavHostKt.NavHost$lambda$4(this.$allVisibleEntries$delegate);
        ArrayList arrayList = new ArrayList();
        for (Object obj : NavHost$lambda$4) {
            if (AbstractC3292y.d(((NavBackStackEntry) obj).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
