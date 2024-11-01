package c5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.work.WorkManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;
import q5.C3798w;

/* loaded from: classes5.dex */
public final class T implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15690a;

    /* renamed from: b, reason: collision with root package name */
    private String f15691b;

    /* renamed from: c, reason: collision with root package name */
    private String f15692c;

    /* renamed from: d, reason: collision with root package name */
    private String f15693d;

    /* renamed from: e, reason: collision with root package name */
    private String f15694e;

    /* renamed from: f, reason: collision with root package name */
    private long f15695f;

    /* renamed from: g, reason: collision with root package name */
    private String f15696g;

    /* renamed from: h, reason: collision with root package name */
    private String f15697h;

    /* renamed from: i, reason: collision with root package name */
    private String f15698i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15699j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f15689k = new b(null);
    public static Parcelable.Creator<T> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new T(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T[] newArray(int i8) {
            return new T[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            b(context);
            SettingsPreferences.f30529b.f1(context, null);
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("PreRegisterWorker");
            }
            if (aVar.W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).cancelAllWorkByTag("GetUserDataWorker");
            }
            G.f15593e.a(context);
            new C3798w().f(context);
        }

        public final void b(Context context) {
            AbstractC3292y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
            edit.remove("user_id");
            edit.remove("user_email");
            edit.remove("user_name");
            edit.remove("user_picture");
            edit.remove("registered_timestamp");
            edit.remove("is_turbo");
            edit.remove("username_format");
            edit.apply();
            SettingsPreferences.f30529b.h1(context, false);
        }

        public final String c(String str) {
            if (str != null) {
                return str + UptodownApp.f29249C.t() + ":webp";
            }
            return null;
        }

        public final String d(String str) {
            if (str != null) {
                return str + UptodownApp.f29249C.m() + ":webp";
            }
            return null;
        }

        public final T e(Context context) {
            T t8;
            AbstractC3292y.i(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesUser", 0);
            if (sharedPreferences.contains("user_id")) {
                t8 = new T();
                t8.W(sharedPreferences.getString("user_id", null));
            } else {
                t8 = null;
            }
            if (sharedPreferences.contains("user_email")) {
                if (t8 == null) {
                    t8 = new T();
                }
                t8.U(sharedPreferences.getString("user_email", null));
            }
            if (sharedPreferences.contains("user_name")) {
                if (t8 == null) {
                    t8 = new T();
                }
                t8.X(sharedPreferences.getString("user_name", null));
            }
            if (t8 != null) {
                if (sharedPreferences.contains("user_picture")) {
                    t8.Q(sharedPreferences.getString("user_picture", null));
                }
                if (sharedPreferences.contains("registered_timestamp")) {
                    t8.Y(sharedPreferences.getLong("registered_timestamp", -1L));
                }
                if (sharedPreferences.contains("is_turbo")) {
                    t8.Z(sharedPreferences.getString("is_turbo", null));
                }
                if (sharedPreferences.contains("username_format")) {
                    t8.a0(sharedPreferences.getString("username_format", "type0"));
                }
            }
            return t8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public T() {
        this.f15695f = -1L;
        this.f15696g = "type0";
    }

    public final void I(Context context) {
        AbstractC3292y.i(context, "context");
        SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesUser", 0).edit();
        edit.putString("user_id", this.f15690a);
        edit.putString("user_email", this.f15691b);
        edit.putString("user_picture", this.f15692c);
        edit.putString("user_name", this.f15693d);
        edit.putLong("registered_timestamp", this.f15695f);
        edit.putString("is_turbo", this.f15698i);
        edit.putString("username_format", this.f15696g);
        edit.apply();
    }

    public final void Q(String str) {
        this.f15692c = str;
    }

    public final void U(String str) {
        this.f15691b = str;
    }

    public final void W(String str) {
        this.f15690a = str;
    }

    public final void X(String str) {
        this.f15693d = str;
    }

    public final void Y(long j8) {
        this.f15695f = j8;
    }

    public final void Z(String str) {
        this.f15698i = str;
    }

    public final String a(Context context) {
        String string;
        String string2;
        String string3;
        AbstractC3292y.i(context, "context");
        long j8 = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j8) - this.f15695f;
        if (currentTimeMillis == 1) {
            string = context.getString(R.string.unit_time_second);
        } else {
            string = context.getString(R.string.unit_time_seconds);
        }
        if (currentTimeMillis >= 60) {
            long j9 = 60;
            currentTimeMillis /= j9;
            if (currentTimeMillis == 1) {
                string = context.getString(R.string.unit_time_minute);
            } else {
                string = context.getString(R.string.unit_time_minutes);
            }
            if (currentTimeMillis >= 60) {
                currentTimeMillis /= j9;
                if (currentTimeMillis == 1) {
                    string2 = context.getString(R.string.unit_time_hour);
                } else {
                    string2 = context.getString(R.string.unit_time_hours);
                }
                string = string2;
                if (currentTimeMillis >= 24) {
                    currentTimeMillis /= 24;
                    if (currentTimeMillis == 1) {
                        string3 = context.getString(R.string.unit_time_day);
                    } else {
                        string3 = context.getString(R.string.unit_time_days);
                    }
                    string = string3;
                    if (8 <= currentTimeMillis && currentTimeMillis < 30) {
                        currentTimeMillis /= 7;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_week);
                        } else {
                            string = context.getString(R.string.unit_time_weeks);
                        }
                    } else if (31 <= currentTimeMillis && currentTimeMillis < 365) {
                        currentTimeMillis /= 30;
                        if (currentTimeMillis == 1) {
                            string = context.getString(R.string.unit_time_month);
                        } else {
                            string = context.getString(R.string.unit_time_months);
                        }
                    } else if (currentTimeMillis > 365) {
                        String format = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date(this.f15695f * j8));
                        Y y8 = Y.f34578a;
                        String string4 = context.getString(R.string.in_year);
                        AbstractC3292y.h(string4, "getString(...)");
                        String format2 = String.format(string4, Arrays.copyOf(new Object[]{format}, 1));
                        AbstractC3292y.h(format2, "format(...)");
                        return format2;
                    }
                }
            }
        }
        if (currentTimeMillis == 0) {
            String string5 = context.getString(R.string.time_now);
            AbstractC3292y.h(string5, "getString(...)");
            return string5;
        }
        Y y9 = Y.f34578a;
        String string6 = context.getString(R.string.time_ago);
        AbstractC3292y.h(string6, "getString(...)");
        String format3 = String.format(string6, Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis), string}, 2));
        AbstractC3292y.h(format3, "format(...)");
        return format3;
    }

    public final void a0(String str) {
        this.f15696g = str;
    }

    public final String b() {
        return this.f15692c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String f() {
        if (this.f15692c != null) {
            StringBuilder sb = new StringBuilder();
            String str = this.f15692c;
            AbstractC3292y.f(str);
            sb.append(str);
            sb.append(UptodownApp.f29249C.l());
            sb.append(":webp");
            return sb.toString();
        }
        return null;
    }

    public final String getId() {
        return this.f15690a;
    }

    public final String h() {
        return f15689k.d(this.f15692c);
    }

    public final void i(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
            this.f15693d = jsonObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
        }
        if (!jsonObject.isNull("registeredTimeAgo")) {
            this.f15697h = jsonObject.getString("registeredTimeAgo");
        }
        if (!jsonObject.isNull("avatar")) {
            this.f15692c = jsonObject.getString("avatar");
        }
        if (!jsonObject.isNull("isTurbo")) {
            boolean z8 = true;
            if (jsonObject.getInt("isTurbo") != 1) {
                z8 = false;
            }
            this.f15699j = z8;
        }
        if (!jsonObject.isNull("usernameFormat")) {
            this.f15696g = jsonObject.getString("usernameFormat");
        }
    }

    public final void l(Context context, JSONObject jsonObject) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("udata")) {
            JSONObject jSONObject = jsonObject.getJSONObject("udata");
            if (!jSONObject.isNull("id")) {
                this.f15690a = jSONObject.getString("id");
            }
            if (!jSONObject.isNull(HintConstants.AUTOFILL_HINT_USERNAME)) {
                this.f15693d = jSONObject.getString(HintConstants.AUTOFILL_HINT_USERNAME);
            }
            if (!jSONObject.isNull("avatar")) {
                this.f15692c = jSONObject.getString("avatar");
            }
            if (!jSONObject.isNull("registeredTimestamp")) {
                this.f15695f = jSONObject.getLong("registeredTimestamp");
            }
            if (!jSONObject.isNull("usernameFormat")) {
                String string = jSONObject.getString("usernameFormat");
                AbstractC3292y.h(string, "getString(...)");
                if (string.length() > 0) {
                    this.f15696g = jSONObject.getString("usernameFormat");
                }
            }
        }
        if (!jsonObject.isNull("utoken")) {
            SettingsPreferences.f30529b.f1(context, jsonObject.getString("utoken"));
        } else {
            f15689k.b(context);
        }
        if (!jsonObject.isNull("turboToken")) {
            this.f15698i = jsonObject.getString("turboToken");
        }
    }

    public final String p() {
        return this.f15691b;
    }

    public final String s() {
        return this.f15693d;
    }

    public final String u() {
        return this.f15697h;
    }

    public final long v() {
        return this.f15695f;
    }

    public final String w() {
        return this.f15696g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15690a);
        parcel.writeString(this.f15691b);
        parcel.writeString(this.f15692c);
        parcel.writeString(this.f15693d);
        parcel.writeString(this.f15694e);
        parcel.writeString(this.f15698i);
        parcel.writeString(this.f15696g);
        parcel.writeLong(this.f15695f);
    }

    public final boolean x(Context context) {
        AbstractC3292y.i(context, "context");
        if (SettingsPreferences.f30529b.I(context) != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        boolean z8;
        String str = this.f15698i;
        if (str != null && str.length() != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        return !z8;
    }

    public final boolean z() {
        return this.f15699j;
    }

    public T(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15695f = -1L;
        this.f15696g = "type0";
        this.f15690a = source.readString();
        this.f15691b = source.readString();
        this.f15692c = source.readString();
        this.f15693d = source.readString();
        this.f15694e = source.readString();
        this.f15698i = source.readString();
        this.f15696g = source.readString();
        this.f15695f = source.readLong();
    }
}
