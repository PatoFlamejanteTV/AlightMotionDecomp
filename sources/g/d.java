package G;

import a0.AbstractC1650i;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public abstract class d {
    public static final void a(String str) {
        try {
            try {
                AbstractC1650i.b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        Log.w("HttpUrlPinger", sb.toString());
                    }
                    AbstractC1650i.a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e8) {
                e = e8;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                Log.w("HttpUrlPinger", sb2.toString(), e);
                AbstractC1650i.a();
            } catch (IndexOutOfBoundsException e9) {
                String message2 = e9.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), e9);
                AbstractC1650i.a();
            } catch (RuntimeException e10) {
                e = e10;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                Log.w("HttpUrlPinger", sb22.toString(), e);
                AbstractC1650i.a();
            }
        } catch (Throwable th) {
            AbstractC1650i.a();
            throw th;
        }
    }
}
