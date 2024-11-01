package com.mbridge.msdk.foundation.same.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;

/* loaded from: classes4.dex */
public final class e extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20772a;

    /* renamed from: b, reason: collision with root package name */
    private String f20773b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20774c;

    /* renamed from: d, reason: collision with root package name */
    private String f20775d;

    /* renamed from: e, reason: collision with root package name */
    private a f20776e;

    /* renamed from: f, reason: collision with root package name */
    private String f20777f;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public e(String str, String str2, String str3) {
        this.f20772a = false;
        this.f20774c = false;
        this.f20775d = str;
        this.f20773b = str2;
        this.f20777f = str3;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z8) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        if (!this.f20774c) {
            if (TextUtils.isEmpty(this.f20777f)) {
                a(this.f20773b, "save path is null.");
                return;
            }
            File file = new File(this.f20777f);
            if (file.exists() && file.length() > 0) {
                a();
                return;
            } else {
                b();
                return;
            }
        }
        b();
    }

    private void b() {
        try {
            File file = new File(this.f20777f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.mbridge.msdk.foundation.same.net.h.c.downloadFile(file, this.f20773b, new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.c.e.1
                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(final com.mbridge.msdk.foundation.same.net.b.a aVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar = e.this;
                            eVar.a(eVar.f20773b, "load image from http faild because http return code: " + aVar.f20840a + ".image url is " + e.this.f20773b);
                        }
                    };
                    if (e.this.f20772a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j8, long j9) {
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            String unused = e.this.f20777f;
                            e.this.a();
                        }
                    };
                    if (e.this.f20772a) {
                        com.mbridge.msdk.foundation.same.f.b.c().execute(runnable);
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (Exception e8) {
            a(this.f20773b, e8.getMessage());
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        } catch (OutOfMemoryError e9) {
            a(this.f20773b, e9.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        a aVar = this.f20776e;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(a aVar) {
        this.f20776e = aVar;
    }

    public final void a(boolean z8) {
        this.f20774c = z8;
    }

    public e(String str, String str2, String str3, h hVar) {
        this.f20774c = false;
        this.f20775d = str;
        this.f20773b = str2;
        this.f20777f = str3;
        this.f20772a = true;
    }

    protected final void a() {
        if (new File(this.f20777f).exists()) {
            String str = this.f20773b;
            String str2 = this.f20777f;
            a aVar = this.f20776e;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        a(this.f20773b, "load image faild.because file[" + this.f20777f + "] is not exist!");
    }
}
