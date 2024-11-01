package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static double f21799a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private Context f21800b;

    /* renamed from: c, reason: collision with root package name */
    private AudioManager f21801c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21802d = false;

    /* renamed from: e, reason: collision with root package name */
    private b f21803e;

    /* renamed from: f, reason: collision with root package name */
    private a f21804f;

    /* loaded from: classes4.dex */
    private static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f21805a;

        public a(d dVar) {
            this.f21805a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            b b9;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = this.f21805a.get()) != null && (b9 = dVar.b()) != null) {
                double a9 = dVar.a();
                if (a9 >= 0.0d) {
                    b9.a(a9);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(double d8);
    }

    public d(Context context) {
        this.f21800b = context;
        this.f21801c = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public final double a() {
        AudioManager audioManager = this.f21801c;
        double streamVolume = ((this.f21801c != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f21799a = streamVolume;
        return streamVolume;
    }

    public final b b() {
        return this.f21803e;
    }

    public final void c() {
        if (this.f21800b != null) {
            this.f21804f = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f21800b.registerReceiver(this.f21804f, intentFilter);
            this.f21802d = true;
        }
    }

    public final void d() {
        Context context;
        if (this.f21802d && (context = this.f21800b) != null) {
            try {
                context.unregisterReceiver(this.f21804f);
                this.f21803e = null;
                this.f21802d = false;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(b bVar) {
        this.f21803e = bVar;
    }
}
