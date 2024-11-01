package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f19900d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f19901a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f19902b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f19903c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f19901a = obj;
        this.f19902b = subscription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f19900d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    PendingPost remove = list.remove(size - 1);
                    remove.f19901a = obj;
                    remove.f19902b = subscription;
                    remove.f19903c = null;
                    return remove;
                }
                return new PendingPost(obj, subscription);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PendingPost pendingPost) {
        pendingPost.f19901a = null;
        pendingPost.f19902b = null;
        pendingPost.f19903c = null;
        List<PendingPost> list = f19900d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
