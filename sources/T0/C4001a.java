package t0;

import Q.AbstractC1394n;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4001a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39426a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f39427b;

    public C4001a(Object obj, Status status) {
        this.f39426a = obj;
        this.f39427b = status;
    }

    public Object a() {
        return this.f39426a;
    }

    public Status b() {
        return this.f39427b;
    }

    public String toString() {
        return AbstractC1394n.c(this).a(NotificationCompat.CATEGORY_STATUS, this.f39427b).a("result", this.f39426a).toString();
    }

    public C4001a(Status status) {
        this(null, status);
    }
}
