package E1;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1544a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f1545b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1546c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1547d;

    /* renamed from: e, reason: collision with root package name */
    private float f1548e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f1544a = context;
        this.f1545b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f1546c = aVar;
        this.f1547d = cVar;
    }

    private float a() {
        return this.f1546c.a(this.f1545b.getStreamVolume(3), this.f1545b.getStreamMaxVolume(3));
    }

    private boolean b(float f8) {
        if (f8 != this.f1548e) {
            return true;
        }
        return false;
    }

    private void c() {
        this.f1547d.a(this.f1548e);
    }

    public void d() {
        this.f1548e = a();
        c();
        this.f1544a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f1544a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a9 = a();
        if (b(a9)) {
            this.f1548e = a9;
            c();
        }
    }
}
