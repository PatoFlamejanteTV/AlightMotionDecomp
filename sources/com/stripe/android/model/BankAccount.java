package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class BankAccount implements z2.f, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f25202a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25203b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f25204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25205d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25206e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25207f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25208g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25209h;

    /* renamed from: i, reason: collision with root package name */
    private final String f25210i;

    /* renamed from: j, reason: collision with root package name */
    private final Status f25211j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25212b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25213c = new Status("New", 0, "new");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25214d = new Status("Validated", 1, "validated");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25215e = new Status("Verified", 2, "verified");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25216f = new Status("VerificationFailed", 3, "verification_failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25217g = new Status("Errored", 4, "errored");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25218h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25219i;

        /* renamed from: a, reason: collision with root package name */
        private final String f25220a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            Status[] a9 = a();
            f25218h = a9;
            f25219i = W5.b.a(a9);
            f25212b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25220a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25213c, f25214d, f25215e, f25216f, f25217g};
        }

        public static W5.a c() {
            return f25219i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25218h.clone();
        }

        public final String b() {
            return this.f25220a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25220a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25221b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f25222c = new Type("Company", 0, "company");

        /* renamed from: d, reason: collision with root package name */
        public static final Type f25223d = new Type("Individual", 1, "individual");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Type[] f25224e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25225f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25226a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Type a(String str) {
                Object obj;
                Iterator<E> it = Type.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((Type) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Type) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            Type[] a9 = a();
            f25224e = a9;
            f25225f = W5.b.a(a9);
            f25221b = new a(null);
        }

        private Type(String str, int i8, String str2) {
            this.f25226a = str2;
        }

        private static final /* synthetic */ Type[] a() {
            return new Type[]{f25222c, f25223d};
        }

        public static W5.a c() {
            return f25225f;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f25224e.clone();
        }

        public final String b() {
            return this.f25226a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25226a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BankAccount createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BankAccount[] newArray(int i8) {
            return new BankAccount[i8];
        }
    }

    public BankAccount(String str, String str2, Type type, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.f25202a = str;
        this.f25203b = str2;
        this.f25204c = type;
        this.f25205d = str3;
        this.f25206e = str4;
        this.f25207f = str5;
        this.f25208g = str6;
        this.f25209h = str7;
        this.f25210i = str8;
        this.f25211j = status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        return AbstractC3292y.d(this.f25202a, bankAccount.f25202a) && AbstractC3292y.d(this.f25203b, bankAccount.f25203b) && this.f25204c == bankAccount.f25204c && AbstractC3292y.d(this.f25205d, bankAccount.f25205d) && AbstractC3292y.d(this.f25206e, bankAccount.f25206e) && AbstractC3292y.d(this.f25207f, bankAccount.f25207f) && AbstractC3292y.d(this.f25208g, bankAccount.f25208g) && AbstractC3292y.d(this.f25209h, bankAccount.f25209h) && AbstractC3292y.d(this.f25210i, bankAccount.f25210i) && this.f25211j == bankAccount.f25211j;
    }

    public int hashCode() {
        String str = this.f25202a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25203b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.f25204c;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        String str3 = this.f25205d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25206e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25207f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f25208g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25209h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f25210i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.f25211j;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.f25202a + ", accountHolderName=" + this.f25203b + ", accountHolderType=" + this.f25204c + ", bankName=" + this.f25205d + ", countryCode=" + this.f25206e + ", currency=" + this.f25207f + ", fingerprint=" + this.f25208g + ", last4=" + this.f25209h + ", routingNumber=" + this.f25210i + ", status=" + this.f25211j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25202a);
        out.writeString(this.f25203b);
        Type type = this.f25204c;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.f25205d);
        out.writeString(this.f25206e);
        out.writeString(this.f25207f);
        out.writeString(this.f25208g);
        out.writeString(this.f25209h);
        out.writeString(this.f25210i);
        Status status = this.f25211j;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
    }
}
