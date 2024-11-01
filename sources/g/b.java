package G;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f2733a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, Map map) {
        this.f2733a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f2733a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(buildUpon.build().toString());
    }
}
