package androidx.work.impl.constraints;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import U5.d;
import V5.b;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;
import r6.k;

/* loaded from: classes3.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController<?>> controllers;

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController<?>> controllers) {
        AbstractC3292y.i(controllers, "controllers");
        this.controllers = controllers;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        AbstractC3292y.i(workSpec, "workSpec");
        List<ConstraintController<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.access$getTAG$p(), "Work " + workSpec.id + " constrained by " + AbstractC1435t.w0(arrayList, null, null, null, 0, null, WorkConstraintsTracker$areAllConstraintsMet$1.INSTANCE, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC3821f track(WorkSpec spec) {
        AbstractC3292y.i(spec, "spec");
        List<ConstraintController<?>> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).track());
        }
        final InterfaceC3821f[] interfaceC3821fArr = (InterfaceC3821f[]) AbstractC1435t.W0(arrayList2).toArray(new InterfaceC3821f[0]);
        return AbstractC3823h.p(new InterfaceC3821f() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
                final /* synthetic */ InterfaceC3821f[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC3821f[] interfaceC3821fArr) {
                    super(0);
                    this.$flowArray = interfaceC3821fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final ConstraintsState[] invoke() {
                    return new ConstraintsState[this.$flowArray.length];
                }
            }

            @f(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass3 extends l implements InterfaceC2073o {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
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
                        InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.L$0;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                constraintsState = constraintsStateArr[i9];
                                if (!AbstractC3292y.d(constraintsState, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                    break;
                                }
                                i9++;
                            } else {
                                constraintsState = null;
                                break;
                            }
                        }
                        if (constraintsState == null) {
                            constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (interfaceC3822g.emit(constraintsState, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2073o
                public final Object invoke(InterfaceC3822g interfaceC3822g, ConstraintsState[] constraintsStateArr, d dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = interfaceC3822g;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(I.f8786a);
                }
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, d dVar) {
                InterfaceC3821f[] interfaceC3821fArr2 = interfaceC3821fArr;
                Object a9 = k.a(interfaceC3822g, interfaceC3821fArr2, new AnonymousClass2(interfaceC3821fArr2), new AnonymousClass3(null), dVar);
                if (a9 == b.e()) {
                    return a9;
                }
                return I.f8786a;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController<?>>) AbstractC1435t.p(new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker())));
        AbstractC3292y.i(trackers, "trackers");
    }
}
