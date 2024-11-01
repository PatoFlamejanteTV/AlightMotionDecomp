package androidx.datastore.preferences;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import androidx.datastore.preferences.core.Preferences;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, d dVar) {
        super(2, dVar);
        this.$keysToMigrate = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, dVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(Preferences preferences, d dVar) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(preferences, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            Set<Preferences.Key<?>> keySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z8 = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                }
                z8 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z8);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
