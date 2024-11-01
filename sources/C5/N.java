package c5;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class N implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15659a;

    /* renamed from: b, reason: collision with root package name */
    private int f15660b;

    /* renamed from: c, reason: collision with root package name */
    private int f15661c;

    /* renamed from: d, reason: collision with root package name */
    private int f15662d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f15658e = new b(null);
    public static Parcelable.Creator<N> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public N createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new N(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public N[] newArray(int i8) {
            return new N[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final N a(JSONObject jsonObjectScreenshot) {
            AbstractC3292y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            N n8 = new N();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                n8.p(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                n8.s(jsonObjectScreenshot.getInt("isVertical"));
            }
            if (!jsonObjectScreenshot.isNull("featured")) {
                n8.l(jsonObjectScreenshot.getInt("featured"));
            }
            return n8;
        }

        public final N b(JSONObject jsonObjectScreenshot) {
            AbstractC3292y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            N n8 = new N();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                n8.p(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                n8.s(jsonObjectScreenshot.getInt("isVertical"));
            }
            return n8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public N() {
    }

    public final int a() {
        return this.f15661c;
    }

    public final int b() {
        return this.f15660b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String f() {
        return this.f15659a;
    }

    public final String h() {
        if (this.f15659a != null) {
            return this.f15659a + UptodownApp.f29249C.D() + ":webp";
        }
        return null;
    }

    public final String i() {
        if (this.f15659a != null) {
            return this.f15659a + UptodownApp.f29249C.C() + ":webp";
        }
        return null;
    }

    public final void l(int i8) {
        this.f15661c = i8;
    }

    public final void p(String str) {
        this.f15659a = str;
    }

    public final void s(int i8) {
        this.f15662d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        AbstractC3292y.i(dest, "dest");
        dest.writeString(this.f15659a);
        dest.writeInt(this.f15660b);
        dest.writeInt(this.f15661c);
        dest.writeInt(this.f15662d);
    }

    public N(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15659a = source.readString();
        this.f15660b = source.readInt();
        this.f15661c = source.readInt();
        this.f15662d = source.readInt();
    }
}
