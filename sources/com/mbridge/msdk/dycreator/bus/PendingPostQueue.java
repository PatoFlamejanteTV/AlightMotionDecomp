package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f19904a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f19905b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.f19905b;
                if (pendingPost2 != null) {
                    pendingPost2.f19903c = pendingPost;
                    this.f19905b = pendingPost;
                } else if (this.f19904a == null) {
                    this.f19905b = pendingPost;
                    this.f19904a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f19904a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f19903c;
            this.f19904a = pendingPost2;
            if (pendingPost2 == null) {
                this.f19905b = null;
            }
        }
        return pendingPost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a(int i8) throws InterruptedException {
        try {
            if (this.f19904a == null) {
                wait(i8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
