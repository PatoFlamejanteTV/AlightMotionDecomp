package androidx.datastore.core;

import Q5.I;
import U5.d;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$runMigrations$2 extends l implements InterfaceC2072n {
    final /* synthetic */ List<Function1> $cleanUps;
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<Function1> list2, d dVar) {
        super(2, dVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, dVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    public final Object invoke(T t8, d dVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t8, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r9.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.L$0
            java.util.List r4 = (java.util.List) r4
            Q5.t.b(r10)
            goto L46
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            androidx.datastore.core.DataMigration r4 = (androidx.datastore.core.DataMigration) r4
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.L$0
            java.util.List r6 = (java.util.List) r6
            Q5.t.b(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L68
        L37:
            Q5.t.b(r10)
            java.lang.Object r10 = r9.L$0
            java.util.List<androidx.datastore.core.DataMigration<T>> r1 = r9.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<kotlin.jvm.functions.Function1> r4 = r9.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.L$0 = r4
            r9.L$1 = r1
            r9.L$2 = r5
            r9.L$3 = r10
            r9.label = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L63
            return r0
        L63:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8c
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.L$0 = r4
            r9.L$1 = r5
            r9.L$2 = r7
            r9.L$3 = r7
            r9.label = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L8a
            return r0
        L8a:
            r1 = r5
            goto L46
        L8c:
            r10 = r1
            goto L8a
        L8e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((DataMigrationInitializer$Companion$runMigrations$2) obj, (d) obj2);
    }
}
