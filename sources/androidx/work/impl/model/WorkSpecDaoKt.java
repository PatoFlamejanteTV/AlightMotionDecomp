package androidx.work.impl.model;

import R5.AbstractC1435t;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3292y;
import n6.I;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes3.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final InterfaceC3821f dedup(final InterfaceC3821f interfaceC3821f, I dispatcher) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        AbstractC3292y.i(dispatcher, "dispatcher");
        return AbstractC3823h.C(AbstractC3823h.p(new InterfaceC3821f() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3822g {
                final /* synthetic */ InterfaceC3822g $this_unsafeFlow;

                @f(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {223}, m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3822g interfaceC3822g) {
                    this.$this_unsafeFlow = interfaceC3822g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Q5.t.b(r7)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        Q5.t.b(r7)
                        q6.g r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = R5.AbstractC1435t.x(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L49:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5d
                        java.lang.Object r4 = r6.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r4 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r4
                        androidx.work.WorkInfo r4 = r4.toWorkInfo()
                        r2.add(r4)
                        goto L49
                    L5d:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L66
                        return r1
                    L66:
                        Q5.I r6 = Q5.I.f8786a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                Object collect = InterfaceC3821f.this.collect(new AnonymousClass2(interfaceC3822g), dVar);
                if (collect == V5.b.e()) {
                    return collect;
                }
                return Q5.I.f8786a;
            }
        }), dispatcher);
    }

    public static final InterfaceC3821f getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID id) {
        AbstractC3292y.i(workSpecDao, "<this>");
        AbstractC3292y.i(id, "id");
        final InterfaceC3821f workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(AbstractC1435t.e(String.valueOf(id)));
        return AbstractC3823h.p(new InterfaceC3821f() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3822g {
                final /* synthetic */ InterfaceC3822g $this_unsafeFlow;

                @f(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {223}, m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3822g interfaceC3822g) {
                    this.$this_unsafeFlow = interfaceC3822g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Q5.t.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        Q5.t.b(r6)
                        q6.g r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = R5.AbstractC1435t.o0(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L45
                        androidx.work.WorkInfo r5 = r5.toWorkInfo()
                        goto L46
                    L45:
                        r5 = 0
                    L46:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        Q5.I r5 = Q5.I.f8786a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                Object collect = InterfaceC3821f.this.collect(new AnonymousClass2(interfaceC3822g), dVar);
                if (collect == V5.b.e()) {
                    return collect;
                }
                return Q5.I.f8786a;
            }
        });
    }

    public static final InterfaceC3821f getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, I dispatcher, String name) {
        AbstractC3292y.i(workSpecDao, "<this>");
        AbstractC3292y.i(dispatcher, "dispatcher");
        AbstractC3292y.i(name, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    public static final InterfaceC3821f getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, I dispatcher, String tag) {
        AbstractC3292y.i(workSpecDao, "<this>");
        AbstractC3292y.i(dispatcher, "dispatcher");
        AbstractC3292y.i(tag, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}
