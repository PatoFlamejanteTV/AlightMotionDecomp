package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class j implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final e f25492a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25493b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25494c;

    /* renamed from: d, reason: collision with root package name */
    private final StripeIntent f25495d;

    /* renamed from: e, reason: collision with root package name */
    private final d f25496e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25497f;

    /* renamed from: g, reason: collision with root package name */
    private final a f25498g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25499h;

    /* renamed from: i, reason: collision with root package name */
    private final Throwable f25500i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f25490j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25491k = 8;
    public static final Parcelable.Creator<j> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements z2.f {
        public static final Parcelable.Creator<a> CREATOR = new C0501a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f25501a;

        /* renamed from: b, reason: collision with root package name */
        private final List f25502b;

        /* renamed from: com.stripe.android.model.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0501a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(boolean z8, List preferredNetworks) {
            AbstractC3292y.i(preferredNetworks, "preferredNetworks");
            this.f25501a = z8;
            this.f25502b = preferredNetworks;
        }

        public final boolean a() {
            return this.f25501a;
        }

        public final List b() {
            return this.f25502b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25501a == aVar.f25501a && AbstractC3292y.d(this.f25502b, aVar.f25502b);
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f25501a) * 31) + this.f25502b.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.f25501a + ", preferredNetworks=" + this.f25502b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f25501a ? 1 : 0);
            out.writeStringList(this.f25502b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final j a(StripeIntent stripeIntent, Throwable th) {
            AbstractC3292y.i(stripeIntent, "stripeIntent");
            return new j(null, null, null, stripeIntent, null, null, null, true, th);
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new j(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (StripeIntent) parcel.readParcelable(j.class.getClassLoader()), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? a.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i8) {
            return new j[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements z2.f {
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25503d = 8;

        /* renamed from: a, reason: collision with root package name */
        private final List f25504a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25505b;

        /* renamed from: c, reason: collision with root package name */
        private final c f25506c;

        /* loaded from: classes4.dex */
        public static final class a implements z2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0502a();

            /* renamed from: a, reason: collision with root package name */
            private final c f25507a;

            /* renamed from: b, reason: collision with root package name */
            private final b f25508b;

            /* renamed from: com.stripe.android.model.j$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0502a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a((c) parcel.readParcelable(a.class.getClassLoader()), (b) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* loaded from: classes4.dex */
            public interface b extends z2.f {

                /* renamed from: com.stripe.android.model.j$d$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0503a implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0503a f25509a = new C0503a();
                    public static final Parcelable.Creator<C0503a> CREATOR = new C0504a();

                    /* renamed from: com.stripe.android.model.j$d$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0504a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0503a createFromParcel(Parcel parcel) {
                            AbstractC3292y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0503a.f25509a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0503a[] newArray(int i8) {
                            return new C0503a[i8];
                        }
                    }

                    private C0503a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0503a);
                    }

                    public int hashCode() {
                        return -269074152;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3292y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* renamed from: com.stripe.android.model.j$d$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0505b implements b {
                    public static final Parcelable.Creator<C0505b> CREATOR = new C0506a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f25510a;

                    /* renamed from: com.stripe.android.model.j$d$a$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0506a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0505b createFromParcel(Parcel parcel) {
                            AbstractC3292y.i(parcel, "parcel");
                            return new C0505b(parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0505b[] newArray(int i8) {
                            return new C0505b[i8];
                        }
                    }

                    public C0505b(boolean z8) {
                        this.f25510a = z8;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0505b) && this.f25510a == ((C0505b) obj).f25510a;
                    }

                    public int hashCode() {
                        return androidx.compose.foundation.a.a(this.f25510a);
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodRemoveEnabled=" + this.f25510a + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3292y.i(out, "out");
                        out.writeInt(this.f25510a ? 1 : 0);
                    }
                }
            }

            /* loaded from: classes4.dex */
            public interface c extends z2.f {

                /* renamed from: com.stripe.android.model.j$d$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0507a implements c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0507a f25511a = new C0507a();
                    public static final Parcelable.Creator<C0507a> CREATOR = new C0508a();

                    /* renamed from: com.stripe.android.model.j$d$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0508a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0507a createFromParcel(Parcel parcel) {
                            AbstractC3292y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0507a.f25511a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0507a[] newArray(int i8) {
                            return new C0507a[i8];
                        }
                    }

                    private C0507a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0507a);
                    }

                    public int hashCode() {
                        return -1145758141;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3292y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* loaded from: classes4.dex */
                public static final class b implements c {
                    public static final Parcelable.Creator<b> CREATOR = new C0509a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f25512a;

                    /* renamed from: b, reason: collision with root package name */
                    private final boolean f25513b;

                    /* renamed from: c, reason: collision with root package name */
                    private final o.b f25514c;

                    /* renamed from: com.stripe.android.model.j$d$a$c$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0509a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b createFromParcel(Parcel parcel) {
                            AbstractC3292y.i(parcel, "parcel");
                            return new b(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final b[] newArray(int i8) {
                            return new b[i8];
                        }
                    }

                    public b(boolean z8, boolean z9, o.b bVar) {
                        this.f25512a = z8;
                        this.f25513b = z9;
                        this.f25514c = bVar;
                    }

                    public final o.b a() {
                        return this.f25514c;
                    }

                    public final boolean b() {
                        return this.f25513b;
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
                        return this.f25512a == bVar.f25512a && this.f25513b == bVar.f25513b && this.f25514c == bVar.f25514c;
                    }

                    public final boolean f() {
                        return this.f25512a;
                    }

                    public int hashCode() {
                        int a9 = ((androidx.compose.foundation.a.a(this.f25512a) * 31) + androidx.compose.foundation.a.a(this.f25513b)) * 31;
                        o.b bVar = this.f25514c;
                        return a9 + (bVar == null ? 0 : bVar.hashCode());
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodSaveEnabled=" + this.f25512a + ", isPaymentMethodRemoveEnabled=" + this.f25513b + ", allowRedisplayOverride=" + this.f25514c + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3292y.i(out, "out");
                        out.writeInt(this.f25512a ? 1 : 0);
                        out.writeInt(this.f25513b ? 1 : 0);
                        o.b bVar = this.f25514c;
                        if (bVar == null) {
                            out.writeInt(0);
                        } else {
                            out.writeInt(1);
                            bVar.writeToParcel(out, i8);
                        }
                    }
                }
            }

            public a(c mobilePaymentElement, b customerSheet) {
                AbstractC3292y.i(mobilePaymentElement, "mobilePaymentElement");
                AbstractC3292y.i(customerSheet, "customerSheet");
                this.f25507a = mobilePaymentElement;
                this.f25508b = customerSheet;
            }

            public final c a() {
                return this.f25507a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC3292y.d(this.f25507a, aVar.f25507a) && AbstractC3292y.d(this.f25508b, aVar.f25508b);
            }

            public int hashCode() {
                return (this.f25507a.hashCode() * 31) + this.f25508b.hashCode();
            }

            public String toString() {
                return "Components(mobilePaymentElement=" + this.f25507a + ", customerSheet=" + this.f25508b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f25507a, i8);
                out.writeParcelable(this.f25508b, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(o.CREATOR.createFromParcel(parcel));
                }
                return new d(arrayList, parcel.readString(), c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements z2.f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25515a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25516b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25517c;

            /* renamed from: d, reason: collision with root package name */
            private final int f25518d;

            /* renamed from: e, reason: collision with root package name */
            private final String f25519e;

            /* renamed from: f, reason: collision with root package name */
            private final a f25520f;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), a.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String id, boolean z8, String apiKey, int i8, String customerId, a components) {
                AbstractC3292y.i(id, "id");
                AbstractC3292y.i(apiKey, "apiKey");
                AbstractC3292y.i(customerId, "customerId");
                AbstractC3292y.i(components, "components");
                this.f25515a = id;
                this.f25516b = z8;
                this.f25517c = apiKey;
                this.f25518d = i8;
                this.f25519e = customerId;
                this.f25520f = components;
            }

            public final String a() {
                return this.f25517c;
            }

            public final a b() {
                return this.f25520f;
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
                return AbstractC3292y.d(this.f25515a, cVar.f25515a) && this.f25516b == cVar.f25516b && AbstractC3292y.d(this.f25517c, cVar.f25517c) && this.f25518d == cVar.f25518d && AbstractC3292y.d(this.f25519e, cVar.f25519e) && AbstractC3292y.d(this.f25520f, cVar.f25520f);
            }

            public final String f() {
                return this.f25519e;
            }

            public int hashCode() {
                return (((((((((this.f25515a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25516b)) * 31) + this.f25517c.hashCode()) * 31) + this.f25518d) * 31) + this.f25519e.hashCode()) * 31) + this.f25520f.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f25515a + ", liveMode=" + this.f25516b + ", apiKey=" + this.f25517c + ", apiKeyExpiry=" + this.f25518d + ", customerId=" + this.f25519e + ", components=" + this.f25520f + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25515a);
                out.writeInt(this.f25516b ? 1 : 0);
                out.writeString(this.f25517c);
                out.writeInt(this.f25518d);
                out.writeString(this.f25519e);
                this.f25520f.writeToParcel(out, i8);
            }
        }

        public d(List paymentMethods, String str, c session) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            AbstractC3292y.i(session, "session");
            this.f25504a = paymentMethods;
            this.f25505b = str;
            this.f25506c = session;
        }

        public final List a() {
            return this.f25504a;
        }

        public final c b() {
            return this.f25506c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f25504a, dVar.f25504a) && AbstractC3292y.d(this.f25505b, dVar.f25505b) && AbstractC3292y.d(this.f25506c, dVar.f25506c);
        }

        public int hashCode() {
            int hashCode = this.f25504a.hashCode() * 31;
            String str = this.f25505b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25506c.hashCode();
        }

        public String toString() {
            return "Customer(paymentMethods=" + this.f25504a + ", defaultPaymentMethod=" + this.f25505b + ", session=" + this.f25506c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            List list = this.f25504a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o) it.next()).writeToParcel(out, i8);
            }
            out.writeString(this.f25505b);
            this.f25506c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements z2.f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final List f25521a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25522b;

        /* renamed from: c, reason: collision with root package name */
        private final g3.y f25523c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f25524d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25525e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                boolean z8 = parcel.readInt() != 0;
                g3.y valueOf = parcel.readInt() == 0 ? null : g3.y.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new e(createStringArrayList, z8, valueOf, linkedHashMap, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(List linkFundingSources, boolean z8, g3.y yVar, Map linkFlags, boolean z9) {
            AbstractC3292y.i(linkFundingSources, "linkFundingSources");
            AbstractC3292y.i(linkFlags, "linkFlags");
            this.f25521a = linkFundingSources;
            this.f25522b = z8;
            this.f25523c = yVar;
            this.f25524d = linkFlags;
            this.f25525e = z9;
        }

        public final boolean a() {
            return this.f25525e;
        }

        public final Map b() {
            return this.f25524d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3292y.d(this.f25521a, eVar.f25521a) && this.f25522b == eVar.f25522b && this.f25523c == eVar.f25523c && AbstractC3292y.d(this.f25524d, eVar.f25524d) && this.f25525e == eVar.f25525e;
        }

        public final g3.y f() {
            return this.f25523c;
        }

        public final boolean h() {
            return this.f25522b;
        }

        public int hashCode() {
            int hashCode = ((this.f25521a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25522b)) * 31;
            g3.y yVar = this.f25523c;
            return ((((hashCode + (yVar == null ? 0 : yVar.hashCode())) * 31) + this.f25524d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25525e);
        }

        public String toString() {
            return "LinkSettings(linkFundingSources=" + this.f25521a + ", linkPassthroughModeEnabled=" + this.f25522b + ", linkMode=" + this.f25523c + ", linkFlags=" + this.f25524d + ", disableLinkSignup=" + this.f25525e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeStringList(this.f25521a);
            out.writeInt(this.f25522b ? 1 : 0);
            g3.y yVar = this.f25523c;
            if (yVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(yVar.name());
            }
            Map map = this.f25524d;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
            out.writeInt(this.f25525e ? 1 : 0);
        }
    }

    public j(e eVar, String str, String str2, StripeIntent stripeIntent, d dVar, String str3, a aVar, boolean z8, Throwable th) {
        AbstractC3292y.i(stripeIntent, "stripeIntent");
        this.f25492a = eVar;
        this.f25493b = str;
        this.f25494c = str2;
        this.f25495d = stripeIntent;
        this.f25496e = dVar;
        this.f25497f = str3;
        this.f25498g = aVar;
        this.f25499h = z8;
        this.f25500i = th;
    }

    public final a a() {
        return this.f25498g;
    }

    public final d b() {
        return this.f25496e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC3292y.d(this.f25492a, jVar.f25492a) && AbstractC3292y.d(this.f25493b, jVar.f25493b) && AbstractC3292y.d(this.f25494c, jVar.f25494c) && AbstractC3292y.d(this.f25495d, jVar.f25495d) && AbstractC3292y.d(this.f25496e, jVar.f25496e) && AbstractC3292y.d(this.f25497f, jVar.f25497f) && AbstractC3292y.d(this.f25498g, jVar.f25498g) && this.f25499h == jVar.f25499h && AbstractC3292y.d(this.f25500i, jVar.f25500i);
    }

    public final boolean f() {
        e eVar = this.f25492a;
        if (eVar != null) {
            return eVar.a();
        }
        return false;
    }

    public final String h() {
        return this.f25494c;
    }

    public int hashCode() {
        e eVar = this.f25492a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        String str = this.f25493b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25494c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25495d.hashCode()) * 31;
        d dVar = this.f25496e;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str3 = this.f25497f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.f25498g;
        int hashCode6 = (((hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25499h)) * 31;
        Throwable th = this.f25500i;
        return hashCode6 + (th != null ? th.hashCode() : 0);
    }

    public final Map i() {
        Map b9;
        e eVar = this.f25492a;
        if (eVar == null || (b9 = eVar.b()) == null) {
            return Q.h();
        }
        return b9;
    }

    public final boolean l() {
        e eVar = this.f25492a;
        if (eVar != null) {
            return eVar.h();
        }
        return false;
    }

    public final e p() {
        return this.f25492a;
    }

    public final String s() {
        return this.f25497f;
    }

    public String toString() {
        return "ElementsSession(linkSettings=" + this.f25492a + ", paymentMethodSpecs=" + this.f25493b + ", externalPaymentMethodData=" + this.f25494c + ", stripeIntent=" + this.f25495d + ", customer=" + this.f25496e + ", merchantCountry=" + this.f25497f + ", cardBrandChoice=" + this.f25498g + ", isGooglePayEnabled=" + this.f25499h + ", sessionsError=" + this.f25500i + ")";
    }

    public final String u() {
        return this.f25493b;
    }

    public final Throwable v() {
        return this.f25500i;
    }

    public final StripeIntent w() {
        return this.f25495d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        e eVar = this.f25492a;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25493b);
        out.writeString(this.f25494c);
        out.writeParcelable(this.f25495d, i8);
        d dVar = this.f25496e;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25497f);
        a aVar = this.f25498g;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f25499h ? 1 : 0);
        out.writeSerializable(this.f25500i);
    }

    public final boolean x() {
        return this.f25499h;
    }

    public final boolean y() {
        Set set;
        boolean z8;
        boolean contains = this.f25495d.e().contains(o.p.f25754h.f25773a);
        List<String> J8 = this.f25495d.J();
        if (!(J8 instanceof Collection) || !J8.isEmpty()) {
            for (String str : J8) {
                set = g3.u.f32249a;
                if (set.contains(str)) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        if ((contains && z8) || l()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ j(e eVar, String str, String str2, StripeIntent stripeIntent, d dVar, String str3, a aVar, boolean z8, Throwable th, int i8, AbstractC3284p abstractC3284p) {
        this(eVar, str, str2, stripeIntent, dVar, str3, aVar, z8, (i8 & 256) != 0 ? null : th);
    }
}
