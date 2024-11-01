package d4;

import Q5.C1413h;
import Q5.s;
import Q5.t;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2757a implements Serializable, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31350a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31351b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31352c;

    /* renamed from: d, reason: collision with root package name */
    private final q f31353d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31354e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC0719a f31355f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31356g;

    /* renamed from: h, reason: collision with root package name */
    private final List f31357h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f31358i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f31359j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f31349k = new b(null);
    public static final Parcelable.Creator<C2757a> CREATOR = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: d4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0719a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0719a f31360b = new EnumC0719a("UserSelected", 0, "01");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0719a f31361c = new EnumC0719a("Reserved", 1, "02");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0719a f31362d = new EnumC0719a("TransactionTimedOutDecoupled", 2, "03");

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0719a f31363e = new EnumC0719a("TransactionTimedOutOther", 3, "04");

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0719a f31364f = new EnumC0719a("TransactionTimedOutFirstCreq", 4, "05");

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0719a f31365g = new EnumC0719a("TransactionError", 5, "06");

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0719a f31366h = new EnumC0719a("Unknown", 6, "07");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumC0719a[] f31367i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ W5.a f31368j;

        /* renamed from: a, reason: collision with root package name */
        private final String f31369a;

        static {
            EnumC0719a[] a9 = a();
            f31367i = a9;
            f31368j = W5.b.a(a9);
        }

        private EnumC0719a(String str, int i8, String str2) {
            this.f31369a = str2;
        }

        private static final /* synthetic */ EnumC0719a[] a() {
            return new EnumC0719a[]{f31360b, f31361c, f31362d, f31363e, f31364f, f31365g, f31366h};
        }

        public static EnumC0719a valueOf(String str) {
            return (EnumC0719a) Enum.valueOf(EnumC0719a.class, str);
        }

        public static EnumC0719a[] values() {
            return (EnumC0719a[]) f31367i.clone();
        }

        public final String b() {
            return this.f31369a;
        }
    }

    /* renamed from: d4.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: d4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2757a createFromParcel(Parcel parcel) {
            EnumC0719a valueOf;
            ArrayList arrayList;
            boolean z8;
            Boolean valueOf2;
            Boolean valueOf3;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            q createFromParcel = q.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = EnumC0719a.valueOf(parcel.readString());
            }
            String readString5 = parcel.readString();
            boolean z9 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(e.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                valueOf2 = Boolean.valueOf(z8);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                valueOf3 = Boolean.valueOf(z9);
            }
            return new C2757a(readString, readString2, readString3, createFromParcel, readString4, valueOf, readString5, arrayList, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2757a[] newArray(int i8) {
            return new C2757a[i8];
        }
    }

    public C2757a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0719a enumC0719a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3292y.i(messageVersion, "messageVersion");
        AbstractC3292y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3292y.i(acsTransId, "acsTransId");
        AbstractC3292y.i(sdkTransId, "sdkTransId");
        this.f31350a = messageVersion;
        this.f31351b = threeDsServerTransId;
        this.f31352c = acsTransId;
        this.f31353d = sdkTransId;
        this.f31354e = str;
        this.f31355f = enumC0719a;
        this.f31356g = str2;
        this.f31357h = list;
        this.f31358i = bool;
        this.f31359j = bool2;
    }

    public static /* synthetic */ C2757a b(C2757a c2757a, String str, String str2, String str3, q qVar, String str4, EnumC0719a enumC0719a, String str5, List list, Boolean bool, Boolean bool2, int i8, Object obj) {
        String str6;
        String str7;
        String str8;
        q qVar2;
        String str9;
        EnumC0719a enumC0719a2;
        String str10;
        List list2;
        Boolean bool3;
        Boolean bool4;
        if ((i8 & 1) != 0) {
            str6 = c2757a.f31350a;
        } else {
            str6 = str;
        }
        if ((i8 & 2) != 0) {
            str7 = c2757a.f31351b;
        } else {
            str7 = str2;
        }
        if ((i8 & 4) != 0) {
            str8 = c2757a.f31352c;
        } else {
            str8 = str3;
        }
        if ((i8 & 8) != 0) {
            qVar2 = c2757a.f31353d;
        } else {
            qVar2 = qVar;
        }
        if ((i8 & 16) != 0) {
            str9 = c2757a.f31354e;
        } else {
            str9 = str4;
        }
        if ((i8 & 32) != 0) {
            enumC0719a2 = c2757a.f31355f;
        } else {
            enumC0719a2 = enumC0719a;
        }
        if ((i8 & 64) != 0) {
            str10 = c2757a.f31356g;
        } else {
            str10 = str5;
        }
        if ((i8 & 128) != 0) {
            list2 = c2757a.f31357h;
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            bool3 = c2757a.f31358i;
        } else {
            bool3 = bool;
        }
        if ((i8 & 512) != 0) {
            bool4 = c2757a.f31359j;
        } else {
            bool4 = bool2;
        }
        return c2757a.a(str6, str7, str8, qVar2, str9, enumC0719a2, str10, list2, bool3, bool4);
    }

    public final C2757a a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0719a enumC0719a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3292y.i(messageVersion, "messageVersion");
        AbstractC3292y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3292y.i(acsTransId, "acsTransId");
        AbstractC3292y.i(sdkTransId, "sdkTransId");
        return new C2757a(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str, enumC0719a, str2, list, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2757a)) {
            return false;
        }
        C2757a c2757a = (C2757a) obj;
        if (AbstractC3292y.d(this.f31350a, c2757a.f31350a) && AbstractC3292y.d(this.f31351b, c2757a.f31351b) && AbstractC3292y.d(this.f31352c, c2757a.f31352c) && AbstractC3292y.d(this.f31353d, c2757a.f31353d) && AbstractC3292y.d(this.f31354e, c2757a.f31354e) && this.f31355f == c2757a.f31355f && AbstractC3292y.d(this.f31356g, c2757a.f31356g) && AbstractC3292y.d(this.f31357h, c2757a.f31357h) && AbstractC3292y.d(this.f31358i, c2757a.f31358i) && AbstractC3292y.d(this.f31359j, c2757a.f31359j)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31352c;
    }

    public final EnumC0719a h() {
        return this.f31355f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((((((this.f31350a.hashCode() * 31) + this.f31351b.hashCode()) * 31) + this.f31352c.hashCode()) * 31) + this.f31353d.hashCode()) * 31;
        String str = this.f31354e;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode) * 31;
        EnumC0719a enumC0719a = this.f31355f;
        if (enumC0719a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC0719a.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31356g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list = this.f31357h;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool = this.f31358i;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool2 = this.f31359j;
        if (bool2 != null) {
            i8 = bool2.hashCode();
        }
        return i13 + i8;
    }

    public final List i() {
        return this.f31357h;
    }

    public final String p() {
        return this.f31350a;
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.f31350a + ", threeDsServerTransId=" + this.f31351b + ", acsTransId=" + this.f31352c + ", sdkTransId=" + this.f31353d + ", challengeDataEntry=" + this.f31354e + ", cancelReason=" + this.f31355f + ", challengeHtmlDataEntry=" + this.f31356g + ", messageExtensions=" + this.f31357h + ", oobContinue=" + this.f31358i + ", shouldResendChallenge=" + this.f31359j + ")";
    }

    public final q u() {
        return this.f31353d;
    }

    public final String v() {
        return this.f31351b;
    }

    public final C2757a w() {
        return b(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31350a);
        out.writeString(this.f31351b);
        out.writeString(this.f31352c);
        this.f31353d.writeToParcel(out, i8);
        out.writeString(this.f31354e);
        EnumC0719a enumC0719a = this.f31355f;
        if (enumC0719a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC0719a.name());
        }
        out.writeString(this.f31356g);
        List list = this.f31357h;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).writeToParcel(out, i8);
            }
        }
        Boolean bool = this.f31358i;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f31359j;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final JSONObject x() {
        String str;
        try {
            s.a aVar = s.f8810b;
            JSONObject put = new JSONObject().put("messageType", "CReq").put("messageVersion", this.f31350a).put("sdkTransID", this.f31353d.a()).put("threeDSServerTransID", this.f31351b).put("acsTransID", this.f31352c);
            EnumC0719a enumC0719a = this.f31355f;
            if (enumC0719a != null) {
                put.put("challengeCancel", enumC0719a.b());
            }
            String str2 = this.f31354e;
            if (str2 != null) {
                put.put("challengeDataEntry", str2);
            }
            String str3 = this.f31356g;
            if (str3 != null) {
                put.put("challengeHTMLDataEntry", str3);
            }
            JSONArray c8 = e.f31431e.c(this.f31357h);
            if (c8 != null) {
                put.put("messageExtensions", c8);
            }
            Boolean bool = this.f31358i;
            if (bool != null) {
                put.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.f31359j;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "Y";
                } else {
                    str = "N";
                }
                put.put("resendChallenge", str);
            }
            AbstractC3292y.f(put);
            return put;
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            Throwable e8 = s.e(s.b(t.a(th)));
            if (e8 == null) {
                throw new C1413h();
            }
            throw new W3.b(e8);
        }
    }

    public /* synthetic */ C2757a(String str, String str2, String str3, q qVar, String str4, EnumC0719a enumC0719a, String str5, List list, Boolean bool, Boolean bool2, int i8, AbstractC3284p abstractC3284p) {
        this(str, str2, str3, qVar, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : enumC0719a, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : list, (i8 & 256) != 0 ? null : bool, (i8 & 512) != 0 ? null : bool2);
    }
}
