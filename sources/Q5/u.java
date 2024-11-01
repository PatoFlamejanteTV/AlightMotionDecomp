package Q5;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u implements InterfaceC1416k, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8813d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8814e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* renamed from: a, reason: collision with root package name */
    private volatile Function0 f8815a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f8816b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8817c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public u(Function0 initializer) {
        AbstractC3292y.i(initializer, "initializer");
        this.f8815a = initializer;
        E e8 = E.f8780a;
        this.f8816b = e8;
        this.f8817c = e8;
    }

    @Override // Q5.InterfaceC1416k
    public Object getValue() {
        Object obj = this.f8816b;
        E e8 = E.f8780a;
        if (obj != e8) {
            return obj;
        }
        Function0 function0 = this.f8815a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            if (androidx.concurrent.futures.a.a(f8814e, this, e8, invoke)) {
                this.f8815a = null;
                return invoke;
            }
        }
        return this.f8816b;
    }

    @Override // Q5.InterfaceC1416k
    public boolean isInitialized() {
        if (this.f8816b != E.f8780a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
