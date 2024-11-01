package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.datastore.core.DataMigrationInitializer;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataMigrationInitializer$Companion$getInitializer$1 extends l implements InterfaceC2072n {
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends DataMigration<T>> list, d dVar) {
        super(2, dVar);
        this.$migrations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, dVar);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(InitializerApi<T> initializerApi, d dVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(initializerApi, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object runMigrations;
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
            InitializerApi initializerApi = (InitializerApi) this.L$0;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.Companion;
            List<DataMigration<T>> list = this.$migrations;
            this.label = 1;
            runMigrations = companion.runMigrations(list, initializerApi, this);
            if (runMigrations == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
