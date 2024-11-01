package e1;

import A0.f;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2784b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f31538c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f31539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31540b;

    public C2784b(f fVar) {
        this.f31539a = fVar.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f31540b = b(fVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(f fVar) {
        String d8 = fVar.n().d();
        if (d8 != null) {
            return d8;
        }
        String c8 = fVar.n().c();
        if (!c8.startsWith("1:") && !c8.startsWith("2:")) {
            return c8;
        }
        String[] split = c8.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e8) {
            Log.w("ContentValues", "Invalid key stored " + e8);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f31539a) {
            string = this.f31539a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f31539a) {
            try {
                String string = this.f31539a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e8 = e(string);
                if (e8 == null) {
                    return null;
                }
                return c(e8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.f31539a) {
            try {
                String g8 = g();
                if (g8 != null) {
                    return g8;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f31539a) {
            try {
                for (String str : f31538c) {
                    String string = this.f31539a.getString(a(this.f31540b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
