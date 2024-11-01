package C1;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* renamed from: a, reason: collision with root package name */
    private final String f726a;

    f(String str) {
        this.f726a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f726a;
    }
}
