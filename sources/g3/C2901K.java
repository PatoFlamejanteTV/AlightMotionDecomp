package g3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.BankAccount;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: g3.K, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2901K implements z2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32030a;

    /* renamed from: b, reason: collision with root package name */
    private final c f32031b;

    /* renamed from: c, reason: collision with root package name */
    private final Date f32032c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32033d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32034e;

    /* renamed from: f, reason: collision with root package name */
    private final BankAccount f32035f;

    /* renamed from: g, reason: collision with root package name */
    private final C2905d f32036g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f32029h = new a(null);
    public static final Parcelable.Creator<C2901K> CREATOR = new b();

    /* renamed from: g3.K$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: g3.K$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2901K createFromParcel(Parcel parcel) {
            boolean z8;
            BankAccount createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            c valueOf = c.valueOf(parcel.readString());
            Date date = (Date) parcel.readSerializable();
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                z9 = false;
            }
            C2905d c2905d = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = BankAccount.CREATOR.createFromParcel(parcel);
            }
            BankAccount bankAccount = createFromParcel;
            if (parcel.readInt() != 0) {
                c2905d = C2905d.CREATOR.createFromParcel(parcel);
            }
            return new C2901K(readString, valueOf, date, z8, z9, bankAccount, c2905d);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2901K[] newArray(int i8) {
            return new C2901K[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: g3.K$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32037b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f32038c = new c("Card", 0, "card");

        /* renamed from: d, reason: collision with root package name */
        public static final c f32039d = new c("BankAccount", 1, "bank_account");

        /* renamed from: e, reason: collision with root package name */
        public static final c f32040e = new c("Pii", 2, "pii");

        /* renamed from: f, reason: collision with root package name */
        public static final c f32041f = new c("Account", 3, "account");

        /* renamed from: g, reason: collision with root package name */
        public static final c f32042g = new c("CvcUpdate", 4, "cvc_update");

        /* renamed from: h, reason: collision with root package name */
        public static final c f32043h = new c("Person", 5, "person");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f32044i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ W5.a f32045j;

        /* renamed from: a, reason: collision with root package name */
        private final String f32046a;

        /* renamed from: g3.K$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final c a(String str) {
                Object obj;
                Iterator<E> it = c.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((c) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (c) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            c[] a9 = a();
            f32044i = a9;
            f32045j = W5.b.a(a9);
            f32037b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f32046a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f32038c, f32039d, f32040e, f32041f, f32042g, f32043h};
        }

        public static W5.a c() {
            return f32045j;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f32044i.clone();
        }

        public final String b() {
            return this.f32046a;
        }
    }

    public C2901K(String id, c type, Date created, boolean z8, boolean z9, BankAccount bankAccount, C2905d c2905d) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(created, "created");
        this.f32030a = id;
        this.f32031b = type;
        this.f32032c = created;
        this.f32033d = z8;
        this.f32034e = z9;
        this.f32035f = bankAccount;
        this.f32036g = c2905d;
    }

    public final C2905d a() {
        return this.f32036g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2901K)) {
            return false;
        }
        C2901K c2901k = (C2901K) obj;
        if (AbstractC3292y.d(this.f32030a, c2901k.f32030a) && this.f32031b == c2901k.f32031b && AbstractC3292y.d(this.f32032c, c2901k.f32032c) && this.f32033d == c2901k.f32033d && this.f32034e == c2901k.f32034e && AbstractC3292y.d(this.f32035f, c2901k.f32035f) && AbstractC3292y.d(this.f32036g, c2901k.f32036g)) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f32030a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.f32030a.hashCode() * 31) + this.f32031b.hashCode()) * 31) + this.f32032c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32033d)) * 31) + androidx.compose.foundation.a.a(this.f32034e)) * 31;
        BankAccount bankAccount = this.f32035f;
        int i8 = 0;
        if (bankAccount == null) {
            hashCode = 0;
        } else {
            hashCode = bankAccount.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        C2905d c2905d = this.f32036g;
        if (c2905d != null) {
            i8 = c2905d.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "Token(id=" + this.f32030a + ", type=" + this.f32031b + ", created=" + this.f32032c + ", livemode=" + this.f32033d + ", used=" + this.f32034e + ", bankAccount=" + this.f32035f + ", card=" + this.f32036g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f32030a);
        out.writeString(this.f32031b.name());
        out.writeSerializable(this.f32032c);
        out.writeInt(this.f32033d ? 1 : 0);
        out.writeInt(this.f32034e ? 1 : 0);
        BankAccount bankAccount = this.f32035f;
        if (bankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bankAccount.writeToParcel(out, i8);
        }
        C2905d c2905d = this.f32036g;
        if (c2905d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2905d.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ C2901K(String str, c cVar, Date date, boolean z8, boolean z9, BankAccount bankAccount, C2905d c2905d, int i8, AbstractC3284p abstractC3284p) {
        this(str, cVar, date, z8, z9, (i8 & 32) != 0 ? null : bankAccount, (i8 & 64) != 0 ? null : c2905d);
    }
}
