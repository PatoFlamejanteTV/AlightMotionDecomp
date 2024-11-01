package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;

/* loaded from: classes3.dex */
public final class Transformations {
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        AbstractC3292y.i(liveData, "<this>");
        O o8 = new O();
        o8.f34569a = true;
        if (liveData.isInitialized()) {
            o8.f34569a = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$distinctUntilChanged$1(mediatorLiveData, o8)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, Function1 transform) {
        MediatorLiveData mediatorLiveData;
        AbstractC3292y.i(liveData, "<this>");
        AbstractC3292y.i(transform, "transform");
        if (liveData.isInitialized()) {
            mediatorLiveData = new MediatorLiveData(transform.invoke(liveData.getValue()));
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$1(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, Function1 transform) {
        MediatorLiveData mediatorLiveData;
        AbstractC3292y.i(liveData, "<this>");
        AbstractC3292y.i(transform, "transform");
        T t8 = new T();
        if (liveData.isInitialized()) {
            LiveData liveData2 = (LiveData) transform.invoke(liveData.getValue());
            if (liveData2 != null && liveData2.isInitialized()) {
                mediatorLiveData = new MediatorLiveData(liveData2.getValue());
            } else {
                mediatorLiveData = new MediatorLiveData();
            }
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1(transform, t8, mediatorLiveData)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        AbstractC3292y.i(liveData, "<this>");
        AbstractC3292y.i(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$2(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        AbstractC3292y.i(liveData, "<this>");
        AbstractC3292y.i(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations$switchMap$2
            private LiveData liveData;

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) Function.this.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                if (liveData3 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    AbstractC3292y.f(liveData3);
                    mediatorLiveData2.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData3 = mediatorLiveData;
                    AbstractC3292y.f(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
