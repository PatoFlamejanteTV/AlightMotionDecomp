package androidx.work;

import R5.AbstractC1435t;
import android.os.Build;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class OneTimeWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes3.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            AbstractC3292y.i(workerClass, "workerClass");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        public final Builder setInputMerger(Class<? extends InputMerger> inputMerger) {
            AbstractC3292y.i(inputMerger, "inputMerger");
            WorkSpec workSpec$work_runtime_release = getWorkSpec$work_runtime_release();
            String name = inputMerger.getName();
            AbstractC3292y.h(name, "inputMerger.name");
            workSpec$work_runtime_release.inputMergerClassName = name;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && Build.VERSION.SDK_INT >= 23 && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            return new OneTimeWorkRequest(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final OneTimeWorkRequest from(Class<? extends ListenableWorker> workerClass) {
            AbstractC3292y.i(workerClass, "workerClass");
            return new Builder(workerClass).build();
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final List<OneTimeWorkRequest> from(List<? extends Class<? extends ListenableWorker>> workerClasses) {
            AbstractC3292y.i(workerClasses, "workerClasses");
            List<? extends Class<? extends ListenableWorker>> list = workerClasses;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Builder((Class) it.next()).build());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        AbstractC3292y.i(builder, "builder");
    }

    public static final OneTimeWorkRequest from(Class<? extends ListenableWorker> cls) {
        return Companion.from(cls);
    }

    public static final List<OneTimeWorkRequest> from(List<? extends Class<? extends ListenableWorker>> list) {
        return Companion.from(list);
    }
}
