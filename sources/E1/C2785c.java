package e1;

import A0.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2785c {

    /* renamed from: a, reason: collision with root package name */
    private File f31541a;

    /* renamed from: b, reason: collision with root package name */
    private final f f31542b;

    /* renamed from: e1.c$a */
    /* loaded from: classes3.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C2785c(f fVar) {
        this.f31542b = fVar;
    }

    private File a() {
        if (this.f31541a == null) {
            synchronized (this) {
                try {
                    if (this.f31541a == null) {
                        this.f31541a = new File(this.f31542b.k().getFilesDir(), "PersistedInstallation." + this.f31542b.o() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f31541a;
    }

    private JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public AbstractC2786d b(AbstractC2786d abstractC2786d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC2786d.d());
            jSONObject.put("Status", abstractC2786d.g().ordinal());
            jSONObject.put("AuthToken", abstractC2786d.b());
            jSONObject.put("RefreshToken", abstractC2786d.f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC2786d.h());
            jSONObject.put("ExpiresInSecs", abstractC2786d.c());
            jSONObject.put("FisError", abstractC2786d.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f31542b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C.UTF8_NAME));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return abstractC2786d;
    }

    public AbstractC2786d d() {
        JSONObject c8 = c();
        String optString = c8.optString("Fid", null);
        int optInt = c8.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c8.optString("AuthToken", null);
        String optString3 = c8.optString("RefreshToken", null);
        long optLong = c8.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c8.optLong("ExpiresInSecs", 0L);
        return AbstractC2786d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c8.optString("FisError", null)).a();
    }
}
