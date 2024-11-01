package com.mbridge.msdk.video.dynview.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.f.b;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.g.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f23323a;

    /* renamed from: b, reason: collision with root package name */
    private View f23324b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f23325c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f23326d;

    private a() {
    }

    public final void b() {
        if (this.f23324b != null) {
            this.f23324b = null;
        }
        Bitmap bitmap = this.f23325c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f23325c.recycle();
            this.f23325c = null;
        }
        Bitmap bitmap2 = this.f23326d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f23326d.recycle();
            this.f23326d = null;
        }
    }

    public static a a() {
        a aVar;
        if (f23323a == null) {
            synchronized (a.class) {
                try {
                    if (f23323a == null) {
                        f23323a = new a();
                    }
                    aVar = f23323a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return f23323a;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.f23324b = view;
        int e8 = cVar.e();
        float d8 = cVar.d();
        float c8 = cVar.c();
        try {
            List<CampaignEx> g8 = cVar.g();
            String md5 = g8.get(0) != null ? SameMD5.getMD5(g8.get(0).getImageUrl()) : "";
            String md52 = g8.get(1) != null ? SameMD5.getMD5(g8.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(e8, d8, c8, bitmap, bitmap2);
        } catch (Exception e9) {
            ad.b("ChoiceOneDrawBitBg", e9.getMessage());
        }
    }

    private synchronized void a(final int i8, final float f8, final float f9, final Bitmap bitmap, Bitmap bitmap2) {
        try {
            b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Bitmap a9 = o.a(bitmap, 10);
                        Bitmap a10 = o.a(bitmap, 10);
                        final a.C0432a a11 = com.mbridge.msdk.video.dynview.g.a.a();
                        a11.a(i8).a(a9).b(a10);
                        if (i8 == 2) {
                            float f10 = f8;
                            float f11 = f9;
                            if (f10 > f11) {
                                a11.a(f10).b(f9);
                            } else {
                                a11.a(f11).b(f8);
                            }
                        } else {
                            a11.a(f8).b(f9);
                        }
                        if (a.this.f23324b != null) {
                            a.this.f23324b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (a.this.f23324b != null && a11.a() != null) {
                                        a.this.f23324b.setBackground(a11.a());
                                    }
                                }
                            });
                        }
                    } catch (Exception e8) {
                        ad.b("ChoiceOneDrawBitBg", e8.getMessage());
                    }
                }
            });
        } catch (Exception e8) {
            ad.a("ChoiceOneDrawBitBg", e8.getMessage());
        }
    }
}
