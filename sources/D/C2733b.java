package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.InterfaceC2732a;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2733b implements Parcelable {
    public static final Parcelable.Creator<C2733b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f31272a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f31273b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC2732a f31274c;

    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2733b createFromParcel(Parcel parcel) {
            return new C2733b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2733b[] newArray(int i8) {
            return new C2733b[i8];
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0714b extends InterfaceC2732a.AbstractBinderC0712a {
        BinderC0714b() {
        }

        @Override // d.InterfaceC2732a
        public void q0(int i8, Bundle bundle) {
            C2733b c2733b = C2733b.this;
            Handler handler = c2733b.f31273b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
            } else {
                c2733b.a(i8, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f31276a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f31277b;

        c(int i8, Bundle bundle) {
            this.f31276a = i8;
            this.f31277b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733b.this.a(this.f31276a, this.f31277b);
        }
    }

    C2733b(Parcel parcel) {
        this.f31274c = InterfaceC2732a.AbstractBinderC0712a.h(parcel.readStrongBinder());
    }

    public void b(int i8, Bundle bundle) {
        if (this.f31272a) {
            Handler handler = this.f31273b;
            if (handler != null) {
                handler.post(new c(i8, bundle));
                return;
            } else {
                a(i8, bundle);
                return;
            }
        }
        InterfaceC2732a interfaceC2732a = this.f31274c;
        if (interfaceC2732a != null) {
            try {
                interfaceC2732a.q0(i8, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        synchronized (this) {
            try {
                if (this.f31274c == null) {
                    this.f31274c = new BinderC0714b();
                }
                parcel.writeStrongBinder(this.f31274c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i8, Bundle bundle) {
    }
}
