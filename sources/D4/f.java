package d4;

import androidx.compose.runtime.ComposerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f31437c = new f("InvalidMessageReceived", 0, 101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes");

    /* renamed from: d, reason: collision with root package name */
    public static final f f31438d = new f("UnsupportedMessageVersion", 1, 102, "Message Version Number received is not valid for the receiving component.");

    /* renamed from: e, reason: collision with root package name */
    public static final f f31439e = new f("RequiredDataElementMissing", 2, ComposerKt.providerKey, "A message element required as defined in Table A.1 is missing from the message.");

    /* renamed from: f, reason: collision with root package name */
    public static final f f31440f = new f("UnrecognizedCriticalMessageExtensions", 3, ComposerKt.compositionLocalMapKey, "Critical message extension not recognised.");

    /* renamed from: g, reason: collision with root package name */
    public static final f f31441g = new f("InvalidDataElementFormat", 4, ComposerKt.providerValuesKey, "Data element not in the required format or value is invalid as defined in Table A.1");

    /* renamed from: h, reason: collision with root package name */
    public static final f f31442h = new f("InvalidTransactionId", 5, 301, "Transaction ID received is not valid for the receiving component.");

    /* renamed from: i, reason: collision with root package name */
    public static final f f31443i = new f("DataDecryptionFailure", 6, 302, "Data could not be decrypted by the receiving system due to technical or other reason.");

    /* renamed from: j, reason: collision with root package name */
    public static final f f31444j = new f("TransactionTimedout", 7, 402, "Transaction timed-out.");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ f[] f31445k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ W5.a f31446l;

    /* renamed from: a, reason: collision with root package name */
    private final int f31447a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31448b;

    static {
        f[] a9 = a();
        f31445k = a9;
        f31446l = W5.b.a(a9);
    }

    private f(String str, int i8, int i9, String str2) {
        this.f31447a = i9;
        this.f31448b = str2;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f31437c, f31438d, f31439e, f31440f, f31441g, f31442h, f31443i, f31444j};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f31445k.clone();
    }

    public final int b() {
        return this.f31447a;
    }

    public final String c() {
        return this.f31448b;
    }
}
