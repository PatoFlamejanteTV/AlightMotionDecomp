package P;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import f0.HandlerC2840e;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class B extends Fragment implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f7944d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f7945a = DesugarCollections.synchronizedMap(new ArrayMap());

    /* renamed from: b, reason: collision with root package name */
    private int f7946b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f7947c;

    public static B f(Activity activity) {
        B b9;
        WeakHashMap weakHashMap = f7944d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (b9 = (B) weakReference.get()) != null) {
            return b9;
        }
        try {
            B b10 = (B) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (b10 == null || b10.isRemoving()) {
                b10 = new B();
                activity.getFragmentManager().beginTransaction().add(b10, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(b10));
            return b10;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // P.e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7945a.containsKey(str)) {
            this.f7945a.put(str, lifecycleCallback);
            if (this.f7946b > 0) {
                new HandlerC2840e(Looper.getMainLooper()).post(new A(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // P.e
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f7945a.get(str));
    }

    @Override // P.e
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f7946b = 1;
        this.f7947c = bundle;
        for (Map.Entry entry : this.f7945a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7946b = 5;
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7946b = 3;
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f7945a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7946b = 2;
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7946b = 4;
        Iterator it = this.f7945a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
