package d4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import c4.q;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31413a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31414b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31415c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31416d;

    /* renamed from: e, reason: collision with root package name */
    private final c f31417e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31418f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31419g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31420h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31421i;

    /* renamed from: j, reason: collision with root package name */
    private final q f31422j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f31412k = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(JSONObject payload) {
            q qVar;
            AbstractC3292y.i(payload, "payload");
            String optString = payload.optString("threeDSServerTransID");
            String optString2 = payload.optString("acsTransID");
            String optString3 = payload.optString("dsTransID");
            String optString4 = payload.optString("errorCode");
            AbstractC3292y.h(optString4, "optString(...)");
            c a9 = c.f31423b.a(payload.optString("errorComponent"));
            String optString5 = payload.optString("errorDescription");
            AbstractC3292y.h(optString5, "optString(...)");
            String optString6 = payload.optString("errorDetail");
            AbstractC3292y.h(optString6, "optString(...)");
            String optString7 = payload.optString("errorMessageType");
            String optString8 = payload.optString("messageVersion");
            AbstractC3292y.h(optString8, "optString(...)");
            String optString9 = payload.optString("sdkTransID");
            if (optString9 != null) {
                qVar = new q(optString9);
            } else {
                qVar = null;
            }
            return new d(optString, optString2, optString3, optString4, a9, optString5, optString6, optString7, optString8, qVar);
        }

        public final boolean b(JSONObject payload) {
            AbstractC3292y.i(payload, "payload");
            return AbstractC3292y.d("Erro", payload.optString("messageType"));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            c valueOf;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            q qVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = c.valueOf(parcel.readString());
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                qVar = q.CREATOR.createFromParcel(parcel);
            }
            return new d(readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, readString8, qVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f31423b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f31424c = new c("ThreeDsSdk", 0, "C");

        /* renamed from: d, reason: collision with root package name */
        public static final c f31425d = new c("ThreeDsServer", 1, ExifInterface.LATITUDE_SOUTH);

        /* renamed from: e, reason: collision with root package name */
        public static final c f31426e = new c("DirectoryServer", 2, "D");

        /* renamed from: f, reason: collision with root package name */
        public static final c f31427f = new c("Acs", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ c[] f31428g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ W5.a f31429h;

        /* renamed from: a, reason: collision with root package name */
        private final String f31430a;

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
            f31428g = a9;
            f31429h = W5.b.a(a9);
            f31423b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f31430a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f31424c, f31425d, f31426e, f31427f};
        }

        public static W5.a c() {
            return f31429h;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f31428g.clone();
        }

        public final String b() {
            return this.f31430a;
        }
    }

    public d(String str, String str2, String str3, String errorCode, c cVar, String errorDescription, String errorDetail, String str4, String messageVersion, q qVar) {
        AbstractC3292y.i(errorCode, "errorCode");
        AbstractC3292y.i(errorDescription, "errorDescription");
        AbstractC3292y.i(errorDetail, "errorDetail");
        AbstractC3292y.i(messageVersion, "messageVersion");
        this.f31413a = str;
        this.f31414b = str2;
        this.f31415c = str3;
        this.f31416d = errorCode;
        this.f31417e = cVar;
        this.f31418f = errorDescription;
        this.f31419g = errorDetail;
        this.f31420h = str4;
        this.f31421i = messageVersion;
        this.f31422j = qVar;
    }

    public final JSONObject a() {
        JSONObject put = new JSONObject().put("messageType", "Erro").put("messageVersion", this.f31421i).put("sdkTransID", this.f31422j).put("errorCode", this.f31416d).put("errorDescription", this.f31418f).put("errorDetail", this.f31419g);
        String str = this.f31413a;
        if (str != null) {
            put.put("threeDSServerTransID", str);
        }
        String str2 = this.f31414b;
        if (str2 != null) {
            put.put("acsTransID", str2);
        }
        String str3 = this.f31415c;
        if (str3 != null) {
            put.put("dsTransID", str3);
        }
        c cVar = this.f31417e;
        if (cVar != null) {
            put.put("errorComponent", cVar.b());
        }
        String str4 = this.f31420h;
        if (str4 != null) {
            put.put("errorMessageType", str4);
        }
        AbstractC3292y.f(put);
        return put;
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
        if (AbstractC3292y.d(this.f31413a, dVar.f31413a) && AbstractC3292y.d(this.f31414b, dVar.f31414b) && AbstractC3292y.d(this.f31415c, dVar.f31415c) && AbstractC3292y.d(this.f31416d, dVar.f31416d) && this.f31417e == dVar.f31417e && AbstractC3292y.d(this.f31418f, dVar.f31418f) && AbstractC3292y.d(this.f31419g, dVar.f31419g) && AbstractC3292y.d(this.f31420h, dVar.f31420h) && AbstractC3292y.d(this.f31421i, dVar.f31421i) && AbstractC3292y.d(this.f31422j, dVar.f31422j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f31413a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f31414b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f31415c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode6 = (((i10 + hashCode3) * 31) + this.f31416d.hashCode()) * 31;
        c cVar = this.f31417e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int hashCode7 = (((((hashCode6 + hashCode4) * 31) + this.f31418f.hashCode()) * 31) + this.f31419g.hashCode()) * 31;
        String str4 = this.f31420h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode5) * 31) + this.f31421i.hashCode()) * 31;
        q qVar = this.f31422j;
        if (qVar != null) {
            i8 = qVar.hashCode();
        }
        return hashCode8 + i8;
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.f31413a + ", acsTransId=" + this.f31414b + ", dsTransId=" + this.f31415c + ", errorCode=" + this.f31416d + ", errorComponent=" + this.f31417e + ", errorDescription=" + this.f31418f + ", errorDetail=" + this.f31419g + ", errorMessageType=" + this.f31420h + ", messageVersion=" + this.f31421i + ", sdkTransId=" + this.f31422j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f31413a);
        out.writeString(this.f31414b);
        out.writeString(this.f31415c);
        out.writeString(this.f31416d);
        c cVar = this.f31417e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        out.writeString(this.f31418f);
        out.writeString(this.f31419g);
        out.writeString(this.f31420h);
        out.writeString(this.f31421i);
        q qVar = this.f31422j;
        if (qVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            qVar.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, String str8, q qVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, str4, (i8 & 16) != 0 ? null : cVar, str5, str6, (i8 & 128) != 0 ? null : str7, str8, qVar);
    }
}
