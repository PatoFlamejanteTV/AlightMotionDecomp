package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p4.InterfaceC3578c;

/* renamed from: r4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3910i implements Parcelable {

    /* renamed from: r4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3910i implements InterfaceC3578c {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f38450a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f38451b;

        /* renamed from: c, reason: collision with root package name */
        private final W f38452c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f38453d;

        /* renamed from: r4.i$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new b(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3292y.i(phoneNumberState, "phoneNumberState");
            AbstractC3292y.i(onNavigation, "onNavigation");
            this.f38450a = str;
            this.f38451b = set;
            this.f38452c = phoneNumberState;
            this.f38453d = onNavigation;
        }

        @Override // p4.InterfaceC3578c
        public boolean a(String str, I i8) {
            return InterfaceC3578c.a.a(this, str, i8);
        }

        @Override // p4.InterfaceC3578c
        public String b() {
            return this.f38450a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f38450a, bVar.f38450a) && AbstractC3292y.d(this.f38451b, bVar.f38451b) && this.f38452c == bVar.f38452c && AbstractC3292y.d(this.f38453d, bVar.f38453d)) {
                return true;
            }
            return false;
        }

        @Override // p4.InterfaceC3578c
        public Function0 f() {
            return this.f38453d;
        }

        @Override // p4.InterfaceC3578c
        public Set h() {
            return this.f38451b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f38450a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f38451b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f38452c.hashCode()) * 31) + this.f38453d.hashCode();
        }

        @Override // r4.AbstractC3910i
        public W i() {
            return this.f38452c;
        }

        public String toString() {
            return "ShippingCondensed(googleApiKey=" + this.f38450a + ", autocompleteCountries=" + this.f38451b + ", phoneNumberState=" + this.f38452c + ", onNavigation=" + this.f38453d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f38450a);
            Set set = this.f38451b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f38452c.name());
            out.writeSerializable((Serializable) this.f38453d);
        }
    }

    /* renamed from: r4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3910i implements InterfaceC3578c {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f38454a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f38455b;

        /* renamed from: c, reason: collision with root package name */
        private final W f38456c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f38457d;

        /* renamed from: r4.i$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new c(readString, linkedHashSet, W.valueOf(parcel.readString()), (Function0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Set set, W phoneNumberState, Function0 onNavigation) {
            super(null);
            AbstractC3292y.i(phoneNumberState, "phoneNumberState");
            AbstractC3292y.i(onNavigation, "onNavigation");
            this.f38454a = str;
            this.f38455b = set;
            this.f38456c = phoneNumberState;
            this.f38457d = onNavigation;
        }

        @Override // p4.InterfaceC3578c
        public boolean a(String str, I i8) {
            return InterfaceC3578c.a.a(this, str, i8);
        }

        @Override // p4.InterfaceC3578c
        public String b() {
            return this.f38454a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f38454a, cVar.f38454a) && AbstractC3292y.d(this.f38455b, cVar.f38455b) && this.f38456c == cVar.f38456c && AbstractC3292y.d(this.f38457d, cVar.f38457d)) {
                return true;
            }
            return false;
        }

        @Override // p4.InterfaceC3578c
        public Function0 f() {
            return this.f38457d;
        }

        @Override // p4.InterfaceC3578c
        public Set h() {
            return this.f38455b;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f38454a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            Set set = this.f38455b;
            if (set != null) {
                i8 = set.hashCode();
            }
            return ((((i9 + i8) * 31) + this.f38456c.hashCode()) * 31) + this.f38457d.hashCode();
        }

        @Override // r4.AbstractC3910i
        public W i() {
            return this.f38456c;
        }

        public String toString() {
            return "ShippingExpanded(googleApiKey=" + this.f38454a + ", autocompleteCountries=" + this.f38455b + ", phoneNumberState=" + this.f38456c + ", onNavigation=" + this.f38457d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f38454a);
            Set set = this.f38455b;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            out.writeString(this.f38456c.name());
            out.writeSerializable((Serializable) this.f38457d);
        }
    }

    public /* synthetic */ AbstractC3910i(AbstractC3284p abstractC3284p) {
        this();
    }

    public abstract W i();

    /* renamed from: r4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3910i {
        public static final Parcelable.Creator<a> CREATOR = new C0868a();

        /* renamed from: a, reason: collision with root package name */
        private final W f38449a;

        /* renamed from: r4.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0868a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(W.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public /* synthetic */ a(W w8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? W.f38207b : w8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f38449a == ((a) obj).f38449a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f38449a.hashCode();
        }

        @Override // r4.AbstractC3910i
        public W i() {
            return this.f38449a;
        }

        public String toString() {
            return "Normal(phoneNumberState=" + this.f38449a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f38449a.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W phoneNumberState) {
            super(null);
            AbstractC3292y.i(phoneNumberState, "phoneNumberState");
            this.f38449a = phoneNumberState;
        }
    }

    private AbstractC3910i() {
    }
}
