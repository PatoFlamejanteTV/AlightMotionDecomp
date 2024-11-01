package P;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
public final class D extends Fragment implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f7951d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f7952a = DesugarCollections.synchronizedMap(new ArrayMap());

    /* renamed from: b, reason: collision with root package name */
    private int f7953b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f7954c;

    public static D j(FragmentActivity fragmentActivity) {
        D d8;
        WeakHashMap weakHashMap = f7951d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (d8 = (D) weakReference.get()) != null) {
            return d8;
        }
        try {
            D d9 = (D) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (d9 == null || d9.isRemoving()) {
                d9 = new D();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add(d9, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(d9));
            return d9;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
        }
    }

    @Override // P.e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7952a.containsKey(str)) {
            this.f7952a.put(str, lifecycleCallback);
            if (this.f7953b > 0) {
                new HandlerC2840e(Looper.getMainLooper()).post(new C(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // P.e
    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f7952a.get(str));
    }

    @Override // P.e
    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f7953b = 1;
        this.f7954c = bundle;
        for (Map.Entry entry : this.f7952a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7953b = 5;
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7953b = 3;
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f7952a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7953b = 2;
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7953b = 4;
        Iterator it = this.f7952a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
