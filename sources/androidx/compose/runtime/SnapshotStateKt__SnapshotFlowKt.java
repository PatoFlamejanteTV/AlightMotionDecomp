package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    public static final <T> State<T> collectAsState(InterfaceC3813L interfaceC3813L, U5.g gVar, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1439883919);
        if ((i9 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        U5.g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:47)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(interfaceC3813L, interfaceC3813L.getValue(), gVar2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(IdentityArraySet<T> identityArraySet, Set<? extends T> set) {
        if (identityArraySet.size() < set.size()) {
            int size = identityArraySet.size();
            if (size != 0) {
                Object[] values = identityArraySet.getValues();
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj = values[i8];
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (set.contains(obj)) {
                        return true;
                    }
                }
            }
        } else if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet2 = (IdentityArraySet) set;
            int size2 = identityArraySet2.size();
            if (size2 != 0) {
                Object[] values2 = identityArraySet2.getValues();
                for (int i9 = 0; i9 < size2; i9++) {
                    Object obj2 = values2[i9];
                    AbstractC3292y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (identityArraySet.contains(obj2)) {
                        return true;
                    }
                }
            }
        } else {
            Set<? extends T> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (identityArraySet.contains(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final <T> InterfaceC3821f snapshotFlow(Function0 function0) {
        return AbstractC3823h.z(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(function0, null));
    }

    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC3821f interfaceC3821f, R r8, U5.g gVar, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-606625098);
        if ((i9 & 2) != 0) {
            gVar = U5.h.f10149a;
        }
        U5.g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:62)");
        }
        int i10 = i8 >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r8, interfaceC3821f, gVar2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(gVar2, interfaceC3821f, null), composer, (i10 & 8) | 4672 | (i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }
}
