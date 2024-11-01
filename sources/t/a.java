package T;

import Q.C1389i;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9956a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9957b;

    /* renamed from: c, reason: collision with root package name */
    private final C1389i f9958c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9959d;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f9957b = sb;
        this.f9956a = str;
        this.f9958c = new C1389i(str);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable(this.f9956a, i8)) {
            i8++;
        }
        this.f9959d = i8;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f9956a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f9956a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f9957b.concat(str);
    }

    public boolean d(int i8) {
        if (this.f9959d <= i8) {
            return true;
        }
        return false;
    }
}
