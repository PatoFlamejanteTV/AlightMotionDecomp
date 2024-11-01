package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends l implements Function1 {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, d dVar) {
        super(1, dVar);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
