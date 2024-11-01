package R0;

import J0.AbstractC1253j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final File f9108a;

    public a(P0.g gVar) {
        this.f9108a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f9108a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        G0.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a9 = a();
                if (a9.exists()) {
                    fileInputStream = new FileInputStream(a9);
                    try {
                        jSONObject = new JSONObject(AbstractC1253j.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        G0.g.f().e("Failed to fetch cached settings", e);
                        AbstractC1253j.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    G0.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC1253j.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e9) {
                e = e9;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1253j.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC1253j.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j8, JSONObject jSONObject) {
        G0.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j8);
                    FileWriter fileWriter2 = new FileWriter(a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        AbstractC1253j.f(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e8) {
                        e = e8;
                        fileWriter = fileWriter2;
                        G0.g.f().e("Failed to cache settings", e);
                        AbstractC1253j.f(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        AbstractC1253j.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
