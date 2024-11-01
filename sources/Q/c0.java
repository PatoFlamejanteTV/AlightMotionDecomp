package Q;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f8210a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8211b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8212c;

    public c0(AbstractC1383c abstractC1383c, Object obj) {
        this.f8212c = abstractC1383c;
        this.f8210a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f8210a;
                if (this.f8211b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f8211b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f8210a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f8212c.f8200r;
        synchronized (arrayList) {
            arrayList2 = this.f8212c.f8200r;
            arrayList2.remove(this);
        }
    }
}
