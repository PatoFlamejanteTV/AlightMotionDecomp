package com.google.firebase.messaging;

import Q.AbstractC1396p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import q0.C3626l;

/* loaded from: classes4.dex */
public class F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f18526a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f18527b;

    /* renamed from: c, reason: collision with root package name */
    private Task f18528c;

    private F(URL url) {
        this.f18526a = url;
    }

    private byte[] g() {
        URLConnection openConnection = this.f18526a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d8 = AbstractC2570b.d(AbstractC2570b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d8.length + " bytes from " + this.f18526a);
                }
                if (d8.length <= 1048576) {
                    return d8;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static F h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(C3626l c3626l) {
        try {
            c3626l.c(b());
        } catch (Exception e8) {
            c3626l.b(e8);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f18526a);
        }
        byte[] g8 = g();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(g8, 0, g8.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f18526a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f18526a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18527b.cancel(true);
    }

    public Task i() {
        return (Task) AbstractC1396p.l(this.f18528c);
    }

    public void k(ExecutorService executorService) {
        final C3626l c3626l = new C3626l();
        this.f18527b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                F.this.j(c3626l);
            }
        });
        this.f18528c = c3626l.a();
    }
}
