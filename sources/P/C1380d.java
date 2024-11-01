package P;

import Q.AbstractC1396p;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1380d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7959a;

    public C1380d(Activity activity) {
        AbstractC1396p.m(activity, "Activity must not be null");
        this.f7959a = activity;
    }

    public final Activity a() {
        return (Activity) this.f7959a;
    }

    public final FragmentActivity b() {
        return (FragmentActivity) this.f7959a;
    }

    public final boolean c() {
        return this.f7959a instanceof Activity;
    }

    public final boolean d() {
        return this.f7959a instanceof FragmentActivity;
    }
}
