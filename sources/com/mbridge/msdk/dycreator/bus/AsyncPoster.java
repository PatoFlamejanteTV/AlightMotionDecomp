package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19871a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f19872b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncPoster(EventBus eventBus) {
        this.f19872b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f19871a.a(PendingPost.a(subscription, obj));
        EventBus.f19876a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a9 = this.f19871a.a();
        if (a9 != null) {
            this.f19872b.a(a9);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
