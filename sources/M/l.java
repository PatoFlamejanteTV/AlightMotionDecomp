package M;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    Messenger f5468a;

    public l(IBinder iBinder) {
        this.f5468a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f5468a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f5468a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Messenger messenger = this.f5468a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
