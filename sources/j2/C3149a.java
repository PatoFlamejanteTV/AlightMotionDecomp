package j2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3149a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33666b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C3149a f33667c = new C0772a().e(1).c();

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f33668a;

    /* renamed from: j2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0772a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0773a f33669b = new C0773a(null);

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f33670a = new JSONObject();

        /* renamed from: j2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0773a {
            private C0773a() {
            }

            public /* synthetic */ C0773a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public C0772a() {
            a("autoplay", 0);
            a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 0);
            a("controls", 0);
            a("enablejsapi", 1);
            a("fs", 0);
            b(TtmlNode.ATTR_TTS_ORIGIN, "https://www.youtube.com");
            a("rel", 0);
            a("showinfo", 0);
            a("iv_load_policy", 3);
            a("modestbranding", 1);
            a("cc_load_policy", 0);
        }

        private final void a(String str, int i8) {
            try {
                this.f33670a.put(str, i8);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i8);
            }
        }

        private final void b(String str, String str2) {
            try {
                this.f33670a.put(str, str2);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + str2);
            }
        }

        public final C3149a c() {
            return new C3149a(this.f33670a, null);
        }

        public final C0772a d(int i8) {
            a("cc_load_policy", i8);
            return this;
        }

        public final C0772a e(int i8) {
            a("controls", i8);
            return this;
        }

        public final C0772a f(int i8) {
            a("fs", i8);
            return this;
        }

        public final C0772a g(int i8) {
            a("iv_load_policy", i8);
            return this;
        }

        public final C0772a h(int i8) {
            a("rel", i8);
            return this;
        }
    }

    /* renamed from: j2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final C3149a a() {
            return C3149a.f33667c;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ C3149a(JSONObject jSONObject, AbstractC3284p abstractC3284p) {
        this(jSONObject);
    }

    public final String b() {
        String string = this.f33668a.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC3292y.h(string, "playerOptions.getString(Builder.ORIGIN)");
        return string;
    }

    public String toString() {
        String jSONObject = this.f33668a.toString();
        AbstractC3292y.h(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }

    private C3149a(JSONObject jSONObject) {
        this.f33668a = jSONObject;
    }
}
