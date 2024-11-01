package h4;

import Q5.p;
import android.os.Parcel;
import android.os.Parcelable;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2949a extends Parcelable {

    /* renamed from: l0, reason: collision with root package name */
    public static final C0756a f32643l0 = C0756a.f32644a;

    /* renamed from: h4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0756a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0756a f32644a = new C0756a();

        private C0756a() {
        }

        public final InterfaceC2949a a(boolean z8, List preferredNetworks) {
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            if (z8) {
                return new b(preferredNetworks);
            }
            if (!z8) {
                return c.f32646a;
            }
            throw new p();
        }
    }

    /* renamed from: h4.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2949a {
        public static final Parcelable.Creator<b> CREATOR = new C0757a();

        /* renamed from: a, reason: collision with root package name */
        private final List f32645a;

        /* renamed from: h4.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0757a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2906e.valueOf(parcel.readString()));
                }
                return new b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(List preferredNetworks) {
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            this.f32645a = preferredNetworks;
        }

        public final List a() {
            return this.f32645a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f32645a, ((b) obj).f32645a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f32645a.hashCode();
        }

        public String toString() {
            return "Eligible(preferredNetworks=" + this.f32645a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            List list = this.f32645a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2906e) it.next()).name());
            }
        }
    }

    /* renamed from: h4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2949a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32646a = new c();
        public static final Parcelable.Creator<c> CREATOR = new C0758a();

        /* renamed from: h4.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0758a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return c.f32646a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        private c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }
}
