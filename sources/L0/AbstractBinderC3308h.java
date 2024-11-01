package l0;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC2097b0;
import com.google.android.gms.internal.measurement.AbstractC2088a0;
import com.google.android.gms.measurement.internal.C2335e;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.Y5;
import java.util.List;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3308h extends AbstractBinderC2097b0 implements InterfaceC3306f {
    public AbstractBinderC3308h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2097b0
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                com.google.android.gms.measurement.internal.E e8 = (com.google.android.gms.measurement.internal.E) AbstractC2088a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                M5 m52 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                p0(e8, m52);
                parcel2.writeNoException();
                return true;
            case 2:
                Y5 y52 = (Y5) AbstractC2088a0.a(parcel, Y5.CREATOR);
                M5 m53 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                B(y52, m53);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                M5 m54 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                p(m54);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.E e9 = (com.google.android.gms.measurement.internal.E) AbstractC2088a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC2088a0.f(parcel);
                X(e9, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                M5 m55 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                n0(m55);
                parcel2.writeNoException();
                return true;
            case 7:
                M5 m56 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                boolean h8 = AbstractC2088a0.h(parcel);
                AbstractC2088a0.f(parcel);
                List l02 = l0(m56, h8);
                parcel2.writeNoException();
                parcel2.writeTypedList(l02);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.E e10 = (com.google.android.gms.measurement.internal.E) AbstractC2088a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String readString3 = parcel.readString();
                AbstractC2088a0.f(parcel);
                byte[] k02 = k0(e10, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(k02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                AbstractC2088a0.f(parcel);
                J(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                M5 m57 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                String E8 = E(m57);
                parcel2.writeNoException();
                parcel2.writeString(E8);
                return true;
            case 12:
                C2335e c2335e = (C2335e) AbstractC2088a0.a(parcel, C2335e.CREATOR);
                M5 m58 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                H(c2335e, m58);
                parcel2.writeNoException();
                return true;
            case 13:
                C2335e c2335e2 = (C2335e) AbstractC2088a0.a(parcel, C2335e.CREATOR);
                AbstractC2088a0.f(parcel);
                Q(c2335e2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h9 = AbstractC2088a0.h(parcel);
                M5 m59 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                List f02 = f0(readString7, readString8, h9, m59);
                parcel2.writeNoException();
                parcel2.writeTypedList(f02);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean h10 = AbstractC2088a0.h(parcel);
                AbstractC2088a0.f(parcel);
                List s8 = s(readString9, readString10, readString11, h10);
                parcel2.writeNoException();
                parcel2.writeTypedList(s8);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                M5 m510 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                List m8 = m(readString12, readString13, m510);
                parcel2.writeNoException();
                parcel2.writeTypedList(m8);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                AbstractC2088a0.f(parcel);
                List P8 = P(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(P8);
                return true;
            case 18:
                M5 m511 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                u(m511);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC2088a0.a(parcel, Bundle.CREATOR);
                M5 m512 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                z(bundle, m512);
                parcel2.writeNoException();
                return true;
            case 20:
                M5 m513 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                A(m513);
                parcel2.writeNoException();
                return true;
            case 21:
                M5 m514 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                C3302b b02 = b0(m514);
                parcel2.writeNoException();
                AbstractC2088a0.g(parcel2, b02);
                return true;
            case 24:
                M5 m515 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC2088a0.a(parcel, Bundle.CREATOR);
                AbstractC2088a0.f(parcel);
                List j02 = j0(m515, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(j02);
                return true;
            case 25:
                M5 m516 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                a0(m516);
                parcel2.writeNoException();
                return true;
            case 26:
                M5 m517 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                i0(m517);
                parcel2.writeNoException();
                return true;
            case 27:
                M5 m518 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                O(m518);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) AbstractC2088a0.a(parcel, Bundle.CREATOR);
                M5 m519 = (M5) AbstractC2088a0.a(parcel, M5.CREATOR);
                AbstractC2088a0.f(parcel);
                n(bundle3, m519);
                parcel2.writeNoException();
                return true;
        }
    }
}
