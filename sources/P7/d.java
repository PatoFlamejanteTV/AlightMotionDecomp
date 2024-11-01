package P7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f8141d = M7.b.i(d.class);

    /* renamed from: a, reason: collision with root package name */
    private final Context f8142a;

    /* renamed from: b, reason: collision with root package name */
    private final e f8143b;

    /* renamed from: c, reason: collision with root package name */
    private final a f8144c;

    public d(Context context, e eVar, a aVar) {
        this.f8142a = context;
        this.f8143b = eVar;
        this.f8144c = aVar;
    }

    public int[] a() {
        try {
            Display defaultDisplay = ((WindowManager) this.f8142a.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i8 = displayMetrics.widthPixels;
            int i9 = displayMetrics.heightPixels;
            if (i8 == -1 || i9 == -1) {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics2);
                i8 = displayMetrics2.widthPixels;
                i9 = displayMetrics2.heightPixels;
            }
            return new int[]{i8, i9};
        } catch (NullPointerException e8) {
            V7.a.b(f8141d).e(e8, "Window service was not available from this context", new Object[0]);
            return null;
        }
    }

    public String b() {
        String a9 = this.f8143b.a();
        if (a9 == null || a9.startsWith("Apache-HttpClient/UNAVAILABLE (java")) {
            String b9 = this.f8143b.b();
            if (b9 == null) {
                b9 = "0.0.0";
            }
            return String.format(Locale.US, "Dalvik/%s (Linux; U; Android %s; %s Build/%s)", b9, this.f8144c.c(), this.f8144c.b(), this.f8144c.a());
        }
        return a9;
    }

    public String c() {
        return Locale.getDefault().getLanguage();
    }
}
