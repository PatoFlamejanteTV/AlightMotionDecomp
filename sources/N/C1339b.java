package N;

import Q.AbstractC1394n;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1339b extends R.a {

    /* renamed from: a, reason: collision with root package name */
    final int f6351a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6352b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f6353c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6354d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1339b f6350e = new C1339b(0);

    @NonNull
    public static final Parcelable.Creator<C1339b> CREATOR = new r();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1339b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f6351a = i8;
        this.f6352b = i9;
        this.f6353c = pendingIntent;
        this.f6354d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String I(int i8) {
        if (i8 != 99) {
            if (i8 != 1500) {
                switch (i8) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i8) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1339b)) {
            return false;
        }
        C1339b c1339b = (C1339b) obj;
        if (this.f6352b == c1339b.f6352b && AbstractC1394n.a(this.f6353c, c1339b.f6353c) && AbstractC1394n.a(this.f6354d, c1339b.f6354d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1394n.b(Integer.valueOf(this.f6352b), this.f6353c, this.f6354d);
    }

    public int s() {
        return this.f6352b;
    }

    public String toString() {
        AbstractC1394n.a c8 = AbstractC1394n.c(this);
        c8.a("statusCode", I(this.f6352b));
        c8.a("resolution", this.f6353c);
        c8.a("message", this.f6354d);
        return c8.toString();
    }

    public String u() {
        return this.f6354d;
    }

    public PendingIntent v() {
        return this.f6353c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f6351a;
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, s());
        R.c.p(parcel, 3, v(), i8, false);
        R.c.q(parcel, 4, u(), false);
        R.c.b(parcel, a9);
    }

    public boolean y() {
        if (this.f6352b != 0 && this.f6353c != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        if (this.f6352b == 0) {
            return true;
        }
        return false;
    }

    public C1339b(int i8) {
        this(i8, null, null);
    }

    public C1339b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public C1339b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
